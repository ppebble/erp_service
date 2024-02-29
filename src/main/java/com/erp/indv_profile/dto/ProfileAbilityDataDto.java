package com.erp.indv_profile.dto;

import com.erp.indv_profile.entity.ProfileAbilityDataEntity;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileAbilityDataDto {
    @NotNull
    private String userId;
//    @NotNull
//    private String educationName;
//    private String organ;
//    private String companyName;
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private LocalDate careerStart;
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private LocalDate careerEnd;
//    private Integer hireTerm;
//    private String mainCareer;
//    private String spot;
//    private String task;
//    private String jobClassification;
//    @NotNull
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private LocalDate eduStartDate;
//    @NotNull
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private LocalDate eduEndDate;
//    private Integer eduDuration;
//    @NotNull
//    private String abilityType;
    @NotNull
    private String skillName;
    @NotNull
    private String skillGrade;
    private String classificationCriteria;
//    @NotNull
//    private String projectName;
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private LocalDate prjStartDate;
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private LocalDate prjEndDate;
//    private String customer;
//    @NotNull
//    private String affiliation;
//    private String devField;
//    private String devRoll;
//    private String devDevice;
//    private String devOs;
//    private String devLang;
//    private String devDbms;
//    private String devTool;
//    private String devNet;
//    private String devComment;

    public static List<ProfileAbilityDataDto> toProfileDataDto(List<ProfileAbilityDataEntity> profileDataEntityList) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(profileDataEntityList, List.class);
    }

}
