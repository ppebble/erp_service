package com.erp.indv_profile.repository;

import com.erp.indv_profile.entity.ProfileDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileDataRepository extends JpaRepository<ProfileDataEntity, String> {
    @Query(value = "select \n" +
            "p.user_id,\n" +
            "pe.education_name,\n" +
            "pe.edu_start_date,\n" +
            "pe.edu_end_date,\n" +
            "pe.edu_duration,\n" +
            "pe.organ,\n" +
            "pa.ability_type,\n" +
            "pa.ability_name,\n" +
            "pa.proficiency,\n" +
            "pa.class_criteria ,\n" +
            "psi.project_name,\n" +
            "psi.prj_start_date,\n" +
            "psi.prj_end_date,\n" +
            "psi.customer,\n" +
            "psi.affiliation,\n" +
            "psi.dev_field,\n" +
            "psi.dev_roll,\n" +
            "psi.dev_device,\n" +
            "psi.dev_os,\n" +
            "psi.dev_lang,\n" +
            "psi.dev_dbms,\n" +
            "psi.dev_tool,\n" +
            "psi.dev_net,\n" +
            "psi.dev_comment\n" +
            "from profile p ,profile_edu pe ,profile_ability pa ,profile_skill_inventory psi \n" +
            "where 1=1\n" +
            "and p.user_id = :userId\n" +
            "and p.user_id = pe.user_id\n" +
            "and p.user_id = pa.user_id \n" +
            "and p.user_id = psi.user_id;", nativeQuery = true)
    List<ProfileDataEntity> findProfileByUserId(@Param("userId") String userId);
}
