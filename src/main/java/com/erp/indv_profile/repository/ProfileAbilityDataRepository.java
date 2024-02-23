package com.erp.indv_profile.repository;

import com.erp.indv_profile.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileAbilityDataRepository extends JpaRepository<ProfileAbilityDataEntity, String> {
    @Query(value = "\tselect\n" +
            "\t\tpa.user_id,\n" +
            "\t\tpa.ability_type,\n" +
            "\t\tpa.ability_name,\n" +
            "\t\tpa.proficiency,\n" +
            "\t\tpa.class_criteria\n" +
            "\tfrom profile p, profile_ability pa\n" +
            "\twhere 1=1\n" +
            "\tand p.user_id = :userId" +
            "\tand p.user_id = pa.user_id;", nativeQuery = true)
    List<ProfileAbilityDataEntity> findProfileAbilityByUserId(@Param("userId") String userId);
}
