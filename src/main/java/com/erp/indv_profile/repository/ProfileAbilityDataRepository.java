package com.erp.indv_profile.repository;

import com.erp.indv_profile.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileAbilityDataRepository extends JpaRepository<ProfileAbilityDataEntity, String> {
    @Query(value = "\tselect\n" +
            "\t\tp.user_id,\n" +
            "\t\tpa.emp_no,\n" +
            "\t\tpa.skill_name,\n" +
            "\t\tpa.skill_grade,\n" +
            "\t\tpa.classification_criteria\n" +
            "\tfrom profile p, skill pa\n" +
            "\twhere 1=1\n" +
            "\tand p.user_id = :userId" +
            "\tand p.emp_no = pa.emp_no;", nativeQuery = true)
    List<ProfileAbilityDataEntity> findProfileAbilityByUserId(@Param("userId") String userId);
}
