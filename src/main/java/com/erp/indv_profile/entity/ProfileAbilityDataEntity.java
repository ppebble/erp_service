package com.erp.indv_profile.entity;

import com.erp.indv_profile.dto.ProfileAbilityDataDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.io.Serializable;

@Data
class abilityPk implements Serializable {
    private String userId;
    private String empNo;
    private String skillName;
}

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(abilityPk.class)
public class ProfileAbilityDataEntity {
    @Id
    @Column(name = "user_id")
    private String userId;
    @NotNull
    @Id
    @Column(name = "emp_no")
    private String empNo;
    @NotNull
    @Column
    @Id
    private String skillName;
    @NotNull
    @Column
    private String skillGrade;
    @Column
    private String classificationCriteria;


    public static ProfileAbilityDataEntity toProfileEntity(ProfileAbilityDataDto profileDataDto){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(profileDataDto, ProfileAbilityDataEntity.class);
    }

}
