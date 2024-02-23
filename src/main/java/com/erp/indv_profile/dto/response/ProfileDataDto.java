package com.erp.indv_profile.dto.response;

import com.erp.indv_profile.dto.ProfileAbilityDataDto;
import com.erp.indv_profile.dto.ProfileCareerDataDto;
import com.erp.indv_profile.dto.ProfileEduDataDto;
import com.erp.indv_profile.dto.ProfileSkillDataDto;
import com.erp.indv_profile.entity.ProfileCareerDataEntity;
//import com.erp.indv_profile.entity.ProfileDataEntity;
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
public class ProfileDataDto {
    private List<ProfileAbilityDataDto> abilityList;
    private List<ProfileCareerDataDto> careerList;
    private List<ProfileEduDataDto> eduList;
    private List<ProfileSkillDataDto> skillList;
//    public static ProfileDataDto toProfileDataDto(ProfileDataEntity ProfileDataEntity) {
//        ModelMapper modelMapper = new ModelMapper();
//
//        return modelMapper.map(ProfileDataEntity, ProfileDataDto.class);
//    }
}

