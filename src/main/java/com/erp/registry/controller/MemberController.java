package com.erp.registry.controller;

import com.erp.registry.dto.MemberDTO;
import com.erp.registry.service.CheckIdValidator;
import com.erp.registry.service.GetMemberService;
import com.erp.registry.service.PostPostMemberServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {
    private final PostPostMemberServiceImpl memberService;
    private final GetMemberService getMemberService;
    private final CheckIdValidator checkEmailValidator;

    @InitBinder
    public void validatorBinder(WebDataBinder binder) {
        binder.addValidators(checkEmailValidator);
    }

    @GetMapping("/member")
    public List<MemberDTO> getMember(){
        return getMemberService.selectAll();
    }

    @PostMapping("/member/save")
    public String save(@Valid @RequestBody MemberDTO memberDTO, Errors errors, Model model){
        if (errors.hasErrors()) {
            /* 회원가입 실패 시 입력 데이터 유지 */
            model.addAttribute("dto", memberDTO);
            String message = "";
            /* 유효성 검사를 통과하지 못한 필드와 메세지 핸들링 */
            Map<String, String> validatorResult = memberService.validateHandling(errors);
            for (String key : validatorResult.keySet()) {
                model.addAttribute(key, validatorResult.get(key));
                message = validatorResult.get(key);
            }
            return message;
        }
        memberService.save(memberDTO);
        return "success";
    }

}

