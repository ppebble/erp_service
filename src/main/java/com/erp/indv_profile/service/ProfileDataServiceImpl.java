package com.erp.indv_profile.service;

import com.erp.indv_profile.dto.ProfileDataDto;
import com.erp.indv_profile.entity.ProfileDataEntity;
import com.erp.indv_profile.repository.ProfileDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProfileDataServiceImpl implements ProfileDataService {
    private final ProfileDataRepository profileDataRepository;

    @Transactional(readOnly = true)

    public List<ProfileDataDto> getProfile(String userId){
        List<ProfileDataEntity> profileData = profileDataRepository.findProfileByUserId(userId);

    return profileData.stream()
                .map(ProfileDataDto::toProfileDataDto).collect(Collectors.toList());
    }


}
