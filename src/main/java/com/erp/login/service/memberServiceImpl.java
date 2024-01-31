package com.erp.login.service;

import com.erp.config.BCryptConfig;
import com.erp.config.TokenProvider;
import com.erp.login.dto.request.LoginRequest;
import com.erp.login.dto.response.LoginResponse;
import com.erp.registry.entity.MemberEntity;
import com.erp.registry.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class memberServiceImpl {
    private final MemberRepository memberRepository;
    private final BCryptConfig passwordEncoder;
    private final PasswordEncoder encoder;
    private final TokenProvider tokenProvider;
    @Transactional(readOnly = true)
    public LoginResponse login(LoginRequest request) {
        MemberEntity member = memberRepository.findByUserId(request.userId())
                .filter(it -> encoder.matches(request.userPw(), it.getUserPw()))
                .orElseThrow(() -> new IllegalArgumentException("아이디 또는 비밀번호가 일치하지 않습니다."));
        String token = tokenProvider.createToken(String.format("%s:%d", member.getUserId(),member.getAdmincheck()),
                member.getUserId());
        return new LoginResponse(member.getUserId(), member.getUserName(), member.getAdmincheck(), token);
    }


}
