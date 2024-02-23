package com.erp.indv_profile.entity;

import com.erp.indv_profile.dto.ProfileCareerDataDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.time.LocalDate;
@Data
class careerPk implements Serializable {
    private String userId;
    private String companyName;
}

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(careerPk.class)
public class ProfileCareerDataEntity {

    @Id
    @Column(name = "user_id")
    private String userId;
    @Id
    private String companyName;
    @Column
    private LocalDate careerStart;
    @Column
    private LocalDate careerEnd;
    @Column
    private Integer hireTerm;
    @Column
    private String mainCareer;
    @Column
    private String spot;
    @Column
    private String task;
    @Column
    private String jobClassification;

    public static ProfileCareerDataEntity toProfileEntity(ProfileCareerDataDto profileDataDto){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(profileDataDto, ProfileCareerDataEntity.class);
    }

}
