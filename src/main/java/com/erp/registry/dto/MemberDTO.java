package com.erp.registry.dto;


import com.erp.registry.entity.MemberEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@Data
public class MemberDTO {
    private String password;
    private String userId;
    private String name;
    private String regNo;
    private String gender;
    private String engName;
    private String dept;
    private String employeeNumber;
    private Date enterDate;
    private String famRelation;
    private Date enlistmentDate;
    private Date dischargeDate;
    private String militarySub;
    private Date birthDay;
    private String contact;
    private String address;
    private String eduHis;
    private String techLvl;
    private String position;
    private String workType;
    private String workPlace;
    private Boolean deleteFlag;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(memberEntity, MemberDTO.class);
    }

}
