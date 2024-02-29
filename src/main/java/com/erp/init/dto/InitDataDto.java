package com.erp.init.dto;

import com.erp.init.entity.InitDataEntity;
import com.erp.registry.dto.MemberDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InitDataDto {

    private Double idx;
    @NotNull
    private String userId;
    @NotNull
    private String licenseName;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate licenseDate;

    public static InitDataDto toInitDataDto(InitDataEntity initDataEntity) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(initDataEntity, InitDataDto.class);
    }

}
