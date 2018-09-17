package com.study.full.stack.fullstack_project.service;

import com.study.full.stack.fullstack_project.dto.DemoDTO;
import com.study.full.stack.fullstack_project.dto.MembersDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {
    List<DemoDTO> getUserList();
    List<MembersDTO> getMemberList();
}
