package com.erp.init.dto.response;

import com.erp.init.dto.InitDataDto;
import com.erp.init.entity.InitDataEntity;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;


public record InitDataResponse(
        @Schema(description = "자격증 테이블 데이터 리스트", example = "1")
        List<InitDataDto> list
) {
}
