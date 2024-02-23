package com.erp.indv_profile.controller;

import com.erp.indv_profile.dto.response.ProfileDataDto;
import com.erp.indv_profile.service.ProfileDataServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
@Slf4j
public class ProfileController {
    private final ProfileDataServiceImpl profileDataService;

    @Operation(summary = "개인 프로필 데이터 조회")
    @GetMapping("/profile")
    public ProfileDataDto getProfile(@RequestParam(value = "userId") String userId) {
        return profileDataService.getProfile(userId);
    }

}
