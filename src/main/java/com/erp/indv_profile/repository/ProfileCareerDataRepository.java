package com.erp.indv_profile.repository;

import com.erp.indv_profile.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileCareerDataRepository extends JpaRepository<ProfileCareerDataEntity, String> {

    @Query(value = "select \n" +
            "pc.user_id," +
            "pc.company_name,\n" +
            "pc.career_start ,\n" +
            "pc.career_end ,\n" +
            "pc.hire_term ,\n" +
            "pc.main_career ,\n" +
            "pc.spot ,\n" +
            "pc.task ,\n" +
            "pc.job_classification \n" +
            "from profile p , profile_career pc \n" +
            "where 1=1\n" +
            "and p.user_id = :userId\n" +
            "and p.user_id = pc.user_id;", nativeQuery = true)
    List<ProfileCareerDataEntity> findProfileCareerByUserId(@Param("userId") String userId);

}
