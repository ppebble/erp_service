package com.erp.registry.service;

import com.erp.registry.dto.MemberDTO;
import com.erp.registry.entity.MemberEntity;
import com.erp.registry.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostMemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        // repsitory의 save 메서드 호출
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);

    }
}
