package com.erp.indv_profile.repository;

import com.erp.indv_profile.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileSkillDataRepository extends JpaRepository<ProfileSkillInvenDataEntity, String> {

    @Query(value = "\tselect\n" +
            "\t\tp.user_id,\n" +
            "\t\tpsi.project_name,\n" +
            "\t\tpsi.start_date,\n" +
            "\t\tpsi.end_date,\t\n" +
            "\t\tpsi.client_company,\n" +
            "\t\tpsi.working_company,\n" +
            "\t\tpsi.development_field,\n" +
            "\t\tpsi.role,\n" +
            "\t\tpsi.model,\n" +
            "\t\tpsi.os,\n" +
            "\t\tpsi.language,\n" +
            "\t\tpsi.dbms,\n" +
            "\t\tpsi.tool,\n" +
            "\t\tpsi.communication,\n" +
            "\t\tpsi.etc\n" +
            "\tfrom profile p, skill_inventory psi\n" +
            "\twhere 1=1\n" +
            "\tand p.user_id = :userId\n" +
            "\tand p.emp_no = psi.emp_no", nativeQuery = true)
    List<ProfileSkillInvenDataEntity> findProfileSkillInventoryByUserId(@Param("userId") String userId);
}
