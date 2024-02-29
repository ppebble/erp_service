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
    private LocalDate startDate;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;
    @Column
    private String clientCompany;
    @Column
    @NotNull
    private String workingCompany;
    @Column
    private String developmentField;
    @Column
    private String role;
    @Column
    private String model;
    @Column
    private String os;
    @Column
    private String language;
    @Column
    private String dbms;
    @Column
    private String tool;
    @Column
    private String communication;
    @Column
    private String etc;

    public static ProfileSkillInvenDataEntity toProfileEntity(ProfileSkillDataDto profileDataDto){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(profileDataDto, ProfileSkillInvenDataEntity.class);
    }

}
