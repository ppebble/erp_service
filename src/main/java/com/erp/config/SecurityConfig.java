package com.erp.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
    private final JwtAccessDeniedHandler jwtAccessDeniedHandler;
    private final TokenProvider jwtTokenProvider;

    //SecurityFilterChain에 Bean으로 등록하는 과정입니다.
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                // token을 사용하는 방식이기 때문에 csrf를 disable합니다.
                .csrf(AbstractHttpConfigurer::disable)
                .exceptionHandling((exceptionHandling) -> //컨트롤러의 예외처리를 담당하는 exception handler와는 다름.
                        exceptionHandling
                                //.accessDeniedHandler(jwtAccessDeniedHandler);
                                .authenticationEntryPoint(jwtAuthenticationEntryPoint)
                )

                // enable h2-console
                .headers((headers) ->
                        headers.contentTypeOptions(contentTypeOptionsConfig ->
                                headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin)))
                // disable session
                .sessionManagement((sessionManagement) ->
                        sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )

                .authorizeHttpRequests((authorizeRequests) ->
                                authorizeRequests
                                        //users 포함한 end point 보안 적용 X
                                        .requestMatchers("/users/**", "/member/**", "/swagger-ui.html/**", "/swagger-ui/**",
                                                "/v3/api-docs/**", "/swagger-resources/**", "/**",
                                                "/api/**", "/v1/**").permitAll() // HttpServletRequest를 사용하는 요청들에 대한 접근제한을 설정하겠다.
                                        .requestMatchers("/error/**").permitAll()
//                                .requestMatchers(PathRequest.toH2Console()).permitAll()// h2-console, favicon.ico 요청 인증 무시
                                        .requestMatchers("/favicon.ico").permitAll()
                                        .anyRequest().authenticated() // 그 외 인증 없이 접근X
                )
                .exceptionHandling((exceptionHandling) -> exceptionHandling
                        .accessDeniedHandler(jwtAccessDeniedHandler)
                        .authenticationEntryPoint(jwtAuthenticationEntryPoint))
                .with(new JwtSecurityConfig(jwtTokenProvider), customizer -> {
                }); // JwtFilter를 addFilterBefore로 등록했던 JwtSecurityConfig class 적용

        return httpSecurity.build();
    }


}