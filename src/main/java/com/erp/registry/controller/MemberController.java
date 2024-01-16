package com.erp.registry.controller;

import com.erp.registry.dto.MemberDTO;
import com.erp.registry.service.PostMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final PostMemberService memberService;

    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/member/save")
    public void save(@RequestBody MemberDTO memberDTO){
        memberService.save(memberDTO);
        return;
    }
}

