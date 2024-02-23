package com.erp.registry.entity;

import com.erp.registry.dto.MemberDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "profile")
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity {

    @Id
    @Column(name = "user_id",unique = true, nullable = false)
    private String userId;
    @Column
    private String userPw;

    public void setUserPw(String userPw, PasswordEncoder encoder) {
        this.userPw = encoder.encode(userPw);
    }

    @Column
    private String userName;
    @Column
    private String residentNumber;
    @Column
    private String gender;
    @Column
    private String engName;
    @Column
    private String task;
    @Column
    private String empNo;
    @Column
    private LocalDate hiredate;
    @Column
    private String family;
    @Column
    private String relation;
    @Column
    private LocalDate armyStart;
    @Column
    private LocalDate armyEnd;
    @Column
    private String armyBranch;
    @Column
    private LocalDate birthday;
    @Column
    private String tel;
    @Column
    private String emergencyTel;
    @Column
    private String emailAuth;
    @Column
    private String address;
    @Column
    private String education;
    @Column
    private String gradSchool;
    @Column
    private String techGrade;
    @Column
    private String highschool;
    @Column
    private String position;
    @Column
    private String loc;
    @Column
    private String locDetail;
//    @Column
//    private Boolean deleteFlag;
    @Column
    private String shotPath;
    @Column
    private String spot;
    @Column
    private int admincheck;
    @Column
    private Double licenseCount;
    @Column
    private String agreePromiss;
    @Column
    private Double careerCount;
    @Column
    private String evidence;
    @Column
    private String multiMajor1;
    @Column
    private String multiMajor2;
    @Column
    private Long number;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime emailAuthDate;
    @Column
    private String scienceTechCertify;

//    @Column
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    private LocalDateTime createTime;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate signUpDate;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate leavedate;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.map(memberDTO, MemberEntity.class);
    }

}
