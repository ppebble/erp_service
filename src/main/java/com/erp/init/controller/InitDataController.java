package com.erp.init.controller;

import com.erp.config.JwtFilter;
import com.erp.config.TokenProvider;
import com.erp.init.dto.InitDataDto;
import com.erp.init.service.InitDataServiceImpl;
import com.erp.login.dto.ApiResponse;
import com.erp.login.dto.LoginDto;
import com.erp.login.dto.TokenDto;
import com.erp.login.dto.request.LoginRequest;
import com.erp.login.service.memberServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class InitDataController {
    private final InitDataServiceImpl initDataService;

    @Operation(summary = "초기 화면 차트 대시보드 데이터 조회")
    @GetMapping("/init")
    public List<InitDataDto> initDash() {
        return initDataService.init();
    }

}
