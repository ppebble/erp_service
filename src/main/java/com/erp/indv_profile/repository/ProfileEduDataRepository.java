package com.erp.indv_profile.repository;

import com.erp.indv_profile.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileEduDataRepository extends JpaRepository<ProfileEduDataEntity, String> {

    @Query(value = "\tselect\n" +
            "\t\tpe.user_id,\n" +
            "\t\tpe.education_name,\n" +
            "\t\tpe.edu_start_date,\n" +
            "\t\tpe.edu_end_date,\n" +
            "\t\tpe.edu_duration,\n" +
            "\t\tpe.organ\n" +
            "\tfrom profile p, profile_edu pe\n" +
            "\twhere 1=1\n" +
            "\tand p.user_id = :userId\n" +
            "\tand p.user_id = pe.user_id;", nativeQuery = true)
    List<ProfileEduDataEntity> findProfileEduByUserId(@Param("userId") String userId);

}
