package com.erp.indv_profile.dto;

import com.erp.indv_profile.entity.ProfileSkillInvenDataEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileSkillDataDto {
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
//    @NotNull
//    private String abilityName;
//    @NotNull
//    private String proficiency;
//    private String classCriteria;
    @NotNull
    private String projectName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
    private String clientCompany;
    @NotNull
    private String workingCompany;
    private String developmentField;
    private String role;
    private String model;
    private String os;
    private String language;
    private String dbms;
    private String tool;
    private String communication;
    private String etc;

    public static List<ProfileSkillDataDto> toProfileDataDto(List<ProfileSkillInvenDataEntity> profileDataEntityList) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(profileDataEntityList, List.class);
    }

}
