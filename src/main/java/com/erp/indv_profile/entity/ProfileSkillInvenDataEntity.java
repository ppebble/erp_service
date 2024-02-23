package com.erp.indv_profile.entity;

import com.erp.indv_profile.dto.ProfileSkillDataDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.time.LocalDate;

@Data
class skillPk implements Serializable{
    private String userId;
    private String projectName;
}

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(skillPk.class)
public class ProfileSkillInvenDataEntity {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Id
    @NotNull
    @Column
    private String projectName;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate prjStartDate;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate prjEndDate;
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

    public static ProfileSkillInvenDataEntity toProfileEntity(ProfileSkillDataDto profileDataDto){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(profileDataDto, ProfileSkillInvenDataEntity.class);
    }

}
