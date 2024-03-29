package com.erp.registry.repository;

import com.erp.registry.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GetMemberRepository extends JpaRepository<MemberEntity, String> {
    @Query(value = "SELECT * FROM profile ORDER BY hiredate", nativeQuery = true)
    List<MemberEntity> findAllDesc();
}
