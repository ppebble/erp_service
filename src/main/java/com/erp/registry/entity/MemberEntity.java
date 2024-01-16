package com.erp.registry.entity;

import com.erp.registry.dto.MemberDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "ERPUSRINF")
public class MemberEntity {

    @Id
    @Column(name = "user_id",unique = true, nullable = false)
    private String userId;
    @Column
    private String password;
    @Column
    private String name;
    @Column
    private String regNo;
    @Column
    private String gender;
    @Column
    private String engName;
    @Column
    private String dept;
    @Column
    private String employeeNumber;
    @Column
    private Date enterDate;
    @Column
    private String famRelation;
    @Column
    private Date enlistmentDate;
    @Column
    private Date dischargeDate;
    @Column
    private String militarySub;
    @Column
    private Date birthDay;
    @Column
    private String contact;
    @Column
    private String address;
    @Column
    private String eduHis;
    @Column
    private String techLvl;
    @Column
    private String position;
    @Column
    private String workType;
    @Column
    private String workPlace;
    @Column
    private Boolean deleteFlag;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;



    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(memberDTO, MemberEntity.class);
    }

}
