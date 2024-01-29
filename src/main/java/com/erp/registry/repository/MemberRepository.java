package com.erp.registry.repository;

import com.erp.registry.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MemberRepository extends JpaRepository<MemberEntity, String> {

    boolean existsByUserId(String userId);
    Optional<MemberEntity> findByUserId(String userId);
}

