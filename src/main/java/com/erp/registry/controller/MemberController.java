package com.erp.registry.controller;

import com.erp.registry.dto.MemberDTO;
import com.erp.registry.service.GetMemberService;
import com.erp.registry.service.PostMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final PostMemberService memberService;
    private final GetMemberService getMemberService;

    @GetMapping("/member")
    public List<MemberDTO> getMember(){
        return getMemberService.selectAll();
    }

    @PostMapping("/member/save")
    public void save(@RequestBody MemberDTO memberDTO){
        memberService.save(memberDTO);
    }

}

