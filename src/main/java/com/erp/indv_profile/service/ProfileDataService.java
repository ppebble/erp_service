package com.erp.indv_profile.service;

import com.erp.indv_profile.dto.response.ProfileDataDto;

public interface ProfileDataService {
    ProfileDataDto getProfile(String userId);
}
