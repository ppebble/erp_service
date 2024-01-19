package com.erp.registry.dto;


import com.erp.registry.entity.MemberEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@Data
public class MemberDTO {
    private String userId;
    
    private String userPw;
    
    private String userName;
    
    private String residentNumber;
    
    private String gender;
    
    private String engName;
    
    private String task;
    
    private String empNo;
    
    private Date hiredate;
    
    private String family;
    
    private String relation;
    
    private Date armyStart;
    
    private Date armyEnd;
    
    private String armyBranch;
    
    private Date birthday;
    
    private String tel;
    
    private String emergencyTel;
    
    private String userEmail;
    
    private String address;
    
    private String highschool;
    
    private String education;
    
    private String gradSchool;
    
    private String techGrade;
    
    private String position;
    
    private String loc;
    
    private String locDetail;
    
//    private Boolean deleteFlag;
    
    private String shotPath;
    
    private String spot;
    
    private String admincheck;
    
    private Double licenseCount;
    
    private String agreePromiss;
    
    private Double careerCount;
    
    private String evidence;
    
    private String multiMajor1;
    
    private String multiMajor2;
    
    private Long number;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime emailAuthDate;
    
    private String scienceTechCertify;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime signUpDate;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime leavedate;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(memberEntity, MemberDTO.class);
    }

}
