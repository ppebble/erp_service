package com.erp.registry.service;

import com.erp.registry.dto.MemberDTO;
import com.erp.registry.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@RequiredArgsConstructor
@Component
public class CheckIdValidator extends AbstractValidator<MemberDTO>{

    private final MemberRepository memberRepository;
    @Override
    protected void doValidate(MemberDTO dto, Errors errors) {
        if(memberRepository.existsByUserId(dto.getUserId())){
            errors.rejectValue("userId", "ID 중복 오류",
                    "이미 사용중인 아이디 입니다.");
        }

    }

}
