package com.erp.indv_profile.service;

import com.erp.indv_profile.dto.ProfileAbilityDataDto;
import com.erp.indv_profile.dto.ProfileCareerDataDto;
import com.erp.indv_profile.dto.ProfileEduDataDto;
import com.erp.indv_profile.dto.ProfileSkillDataDto;
import com.erp.indv_profile.dto.response.ProfileDataDto;
import com.erp.indv_profile.entity.*;
import com.erp.indv_profile.repository.ProfileAbilityDataRepository;
import com.erp.indv_profile.repository.ProfileCareerDataRepository;
import com.erp.indv_profile.repository.ProfileEduDataRepository;
import com.erp.indv_profile.repository.ProfileSkillDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfileDataServiceImpl implements ProfileDataService {
//    private final ProfileDataRepository profileDataRepository;
    private final ProfileAbilityDataRepository profileDataRepository;
    private final ProfileEduDataRepository profileEduDataRepository;
    private final ProfileSkillDataRepository profileSkillDataRepository;
    private final ProfileCareerDataRepository profileCareerDataRepository;
    @Transactional(readOnly = true)

    public ProfileDataDto getProfile(String userId){
        List<ProfileAbilityDataEntity> paData = profileDataRepository.findProfileAbilityByUserId(userId);
        List<ProfileEduDataEntity> peData = profileEduDataRepository.findProfileEduByUserId(userId);
        List<ProfileSkillInvenDataEntity> psiData = profileSkillDataRepository.findProfileSkillInventoryByUserId(userId);
        List<ProfileCareerDataEntity> pcData = profileCareerDataRepository.findProfileCareerByUserId(userId);
        List<ProfileAbilityDataDto> paDto = ProfileAbilityDataDto.toProfileDataDto(paData);
        List<ProfileEduDataDto> peDto = ProfileEduDataDto.toProfileDataDto(peData);
        List<ProfileSkillDataDto> psiDto = ProfileSkillDataDto.toProfileDataDto(psiData);
        List<ProfileCareerDataDto> pcDto = ProfileCareerDataDto.toProfileDataDto(pcData);
//        ProfileDataEntity profileData = new ProfileDataEntity();
//        profileData.setAbilityList(paData);
//        profileData.setEduList(peData);
//        profileData.setCareerList(pcData);
//        profileData.setSkillList(psiData);
//
//        return ProfileDataDto.toProfileDataDto(profileData);

        ProfileDataDto profileDataDto = new ProfileDataDto();
        profileDataDto.setAbilityList(paDto);
        profileDataDto.setCareerList(pcDto);
        profileDataDto.setEduList(peDto);
        profileDataDto.setSkillList(psiDto);
        return profileDataDto;

    }


}
