package com.erp.indv_profile.dto.response;

import com.erp.indv_profile.dto.ProfileDataDto;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;


public record ProfileDataResponse(
        @Schema(description = "자격증 테이블 데이터 리스트", example = "1")
        List<ProfileDataDto> list
) {
}
