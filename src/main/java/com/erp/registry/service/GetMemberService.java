package com.erp.registry.service;

import com.erp.registry.dto.MemberDTO;
import com.erp.registry.entity.MemberEntity;
import com.erp.registry.repository.GetMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetMemberService {
    private final GetMemberRepository getMemberRepository;
    @Transactional (readOnly = true)
    public List<MemberDTO> selectAll() {

        List<MemberEntity> members = getMemberRepository.findAllDesc();

        return members.stream().map(MemberDTO::toMemberDTO).collect(Collectors.toList());

    }
}
