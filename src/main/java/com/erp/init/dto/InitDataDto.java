package com.erp.init.dto;

import com.erp.init.entity.InitDataEntity;
import com.erp.registry.dto.MemberDTO;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

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

    public static InitDataDto toInitDataDto(InitDataEntity initDataEntity) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(initDataEntity, InitDataDto.class);
    }

}
