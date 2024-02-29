package com.erp.indv_profile.repository;

import com.erp.indv_profile.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileEduDataRepository extends JpaRepository<ProfileEduDataEntity, String> {

    @Query(value = "\tselect\n" +
            "\t\tp.user_id,\n" +
            "\t\tpe.edu_name,\n" +
            "\t\tpe.start_date,\n" +
            "\t\tpe.end_date,\n" +
            "\t\tpe.organization\n" +
            "\tfrom profile p, skill_edu pe\n" +
            "\twhere 1=1\n" +
            "\tand p.user_id = :userId\n" +
            "\tand p.emp_no = pe.emp_no;", nativeQuery = true)
    List<ProfileEduDataEntity> findProfileEduByUserId(@Param("userId") String userId);

}
