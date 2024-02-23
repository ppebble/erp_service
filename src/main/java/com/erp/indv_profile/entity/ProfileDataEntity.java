//package com.erp.indv_profile.entity;
//
//import com.erp.indv_profile.dto.ProfileAbilityDataDto;
//import com.erp.indv_profile.dto.ProfileCareerDataDto;
//import com.erp.indv_profile.dto.ProfileEduDataDto;
//import com.erp.indv_profile.dto.ProfileSkillDataDto;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.validation.constraints.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.modelmapper.ModelMapper;
//
//import java.util.List;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class ProfileDataEntity {
//
//    @Id
//    private List<ProfileAbilityDataEntity> abilityList;
//    private List<ProfileCareerDataEntity> careerList;
//    private List<ProfileEduDataEntity> eduList;
//    private List<ProfileSkillInvenDataEntity> skillList;
//
//
//    public static ProfileDataEntity toProfileEntity(ProfileAbilityDataDto profileDataDto){
//        ModelMapper modelMapper = new ModelMapper();
//
//        return modelMapper.map(profileDataDto, ProfileDataEntity.class);
//    }
//
//}
