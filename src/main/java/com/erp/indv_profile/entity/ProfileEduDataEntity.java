package com.erp.indv_profile.entity;

import com.erp.indv_profile.dto.ProfileEduDataDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.io.Serializable;
import java.time.LocalDate;
@Data
class eduPk implements Serializable {
    private String userId;
    private String eduName;
}

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(eduPk.class)
public class ProfileEduDataEntity {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column
    @Id
    private String eduName;
    @Column
    private String organization;
    @NotNull
    @Column
    private LocalDate startDate;
    @NotNull
    @Column
    private LocalDate endDate;

    public static ProfileEduDataEntity toProfileEntity(ProfileEduDataDto profileDataDto){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(profileDataDto, ProfileEduDataEntity.class);
    }

}
