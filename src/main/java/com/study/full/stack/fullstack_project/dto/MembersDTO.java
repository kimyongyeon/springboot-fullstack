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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int memberSeq;

    @Column
    private String name;
    @Column
    private String userId;
    @Column
    private String userPassword;
    @Column
    private String addr;
    @Column
    private String tel;

}
