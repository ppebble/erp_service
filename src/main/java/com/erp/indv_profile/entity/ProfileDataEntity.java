package com.erp.indv_profile.entity;

import com.erp.indv_profile.dto.ProfileDataDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDataEntity {

    @Id
    @Column(name = "user_id")
    private String userId;
    @Column
    private String educationName;
    @Column
    private String organ;
    @NotNull
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date eduStartDate;
    @NotNull
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date eduEndDate;
    @Column
    private Integer eduDuration;
    @Column
    @NotNull
    private String abilityType;
    @NotNull
    @Column
    private String abilityName;
    @NotNull
    @Column
    private String proficiency;
    @Column
    private String classCriteria;
    @NotNull
    @Column
    private String projectName;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date prjStartDate;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date prjEndDate;
    @Column
    private String customer;
    @Column
    @NotNull
    private String affiliation;
    @Column
    private String devField;
    @Column
    private String devRoll;
    @Column
    private String devDevice;
    @Column
    private String devOs;
    @Column
    private String devLang;
    @Column
    private String devDbms;
    @Column
    private String devTool;
    @Column
    private String devNet;
    @Column
    private String devComment;

    public static ProfileDataEntity toProfileEntity(ProfileDataDto profileDataDto){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(profileDataDto, ProfileDataEntity.class);
    }

}
