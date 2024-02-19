package com.erp.indv_profile.dto;

import com.erp.indv_profile.entity.ProfileDataEntity;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDataDto {
    @NotNull
    private String userId;
    @NotNull
    private String educationName;
    private String organ;
    @NotNull
    private Date eduStartDate;
    @NotNull
    private Date eduEndDate;
    private Integer eduDuration;
    @NotNull
    private String abilityType;
    @NotNull
    private String abilityName;
    @NotNull
    private String proficiency;
    private String classCriteria;
    @NotNull
    private String projectName;
    private Date prjStartDate;
    private Date prjEndDate;
    private String customer;
    @NotNull
    private String affiliation;
    private String devField;
    private String devRoll;
    private String devDevice;
    private String devOs;
    private String devLang;
    private String devDbms;
    private String devTool;
    private String devNet;
    private String devComment;

    public static ProfileDataDto toProfileDataDto(ProfileDataEntity profileDataEntity) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(profileDataEntity, ProfileDataDto.class);
    }

}
