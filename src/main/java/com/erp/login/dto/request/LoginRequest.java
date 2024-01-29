package com.erp.login.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;


public record LoginRequest(
        @Schema(description = "아이디", example = "leesm")
        String userId,
        @Schema(description = "비밀번호", example = "1")
        String userPw) {
}
