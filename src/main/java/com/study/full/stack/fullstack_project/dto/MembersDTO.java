package com.study.full.stack.fullstack_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_member")
public class MembersDTO {

    // 기본키
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_seq")
    private int memberSeq;

    @Column(name = "name")
    private String name;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "addr")
    private String addr;
    @Column(name = "tel")
    private String tel;

}
