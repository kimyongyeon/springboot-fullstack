package com.study.full.stack.fullstack_project.service;

import com.study.full.stack.fullstack_project.dto.DemoDTO;
import com.study.full.stack.fullstack_project.dto.MembersDTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * data access object
 */
@Mapper
public interface DemoRepository {
    List<DemoDTO> getUserList();
    List<MembersDTO> getMemberList();
}
