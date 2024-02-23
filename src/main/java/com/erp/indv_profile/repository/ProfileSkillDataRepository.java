package com.erp.indv_profile.repository;

import com.erp.indv_profile.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileSkillDataRepository extends JpaRepository<ProfileSkillInvenDataEntity, String> {

    @Query(value = "\tselect\n" +
            "\t\tpsi.user_id,\n" +
            "\t\tpsi.project_name,\n" +
            "\t\tpsi.prj_start_date,\n" +
            "\t\tpsi.prj_end_date,\t\n" +
            "\t\tpsi.customer,\n" +
            "\t\tpsi.affiliation,\n" +
            "\t\tpsi.dev_field,\n" +
            "\t\tpsi.dev_roll,\n" +
            "\t\tpsi.dev_device,\n" +
            "\t\tpsi.dev_OS,\n" +
            "\t\tpsi.dev_lang,\n" +
            "\t\tpsi.dev_dbms,\n" +
            "\t\tpsi.dev_tool,\n" +
            "\t\tpsi.dev_net,\n" +
            "\t\tpsi.dev_comment\n" +
            "\tfrom profile p, profile_skill_inventory psi\n" +
            "\twhere 1=1\n" +
            "\tand p.user_id = :userId\n" +
            "\tand p.user_id = psi.user_id", nativeQuery = true)
    List<ProfileSkillInvenDataEntity> findProfileSkillInventoryByUserId(@Param("userId") String userId);
}
