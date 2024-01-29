package com.erp.login.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;


public record LoginResponse(
        @Schema(description = "이름", example = "이석민")
        String userName,
        @Schema(description = "권한레벨", example = "1")
        int admincheck,

        String token
) {
}
