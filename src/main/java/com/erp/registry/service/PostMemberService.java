package com.erp.registry.service;

import com.erp.registry.dto.MemberDTO;
import org.springframework.validation.Errors;

import java.util.Map;

public interface PostMemberService {
    void save(MemberDTO memberDTO);

    Map<String, String> validateHandling(Errors errors);
}
