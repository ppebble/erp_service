package com.erp.indv_profile.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;


public record ProfileDataRequest(
        @Schema(description = "아이디", example = "leesm")
        String userId) {
}
