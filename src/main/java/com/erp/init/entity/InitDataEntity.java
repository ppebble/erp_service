package com.erp.init.entity;

import com.erp.init.dto.InitDataDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InitDataEntity {
    @Id
    private Double idx;
    @Column(name = "license_name")
    private String licenseName;
    @Column(name = "user_id")
    private String userId;

    public static InitDataEntity toInitDataEntity(InitDataDto initDataDto){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(initDataDto, InitDataEntity.class);
    }

}
