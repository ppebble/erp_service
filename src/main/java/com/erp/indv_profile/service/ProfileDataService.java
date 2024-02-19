package com.erp.indv_profile.service;

import com.erp.indv_profile.dto.ProfileDataDto;

import java.util.List;

public interface ProfileDataService {
    List<ProfileDataDto> getProfile(String userId);
}
