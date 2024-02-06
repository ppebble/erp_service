package com.erp.init.repository;

import com.erp.init.dto.InitDataDto;
import com.erp.init.entity.InitDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InitDataRepository extends JpaRepository<InitDataEntity, String> {
    @Query(value = "select p.user_id, pl.license_name, pl.idx\n" +
            "from profile_license pl \n" +
            "\tleft join profile p \n" +
            "\ton pl.user_id = p.user_id\n" +
            "where 1=1\n" +
            "and p.leavedate is null\n" +
            "order by pl.license_name ;", nativeQuery = true)
    List<InitDataEntity> findLicense();
}
