package com.erp.registry.repository;

import com.erp.registry.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<MemberEntity, String> {

    boolean existsByUserId(String userId);
}

