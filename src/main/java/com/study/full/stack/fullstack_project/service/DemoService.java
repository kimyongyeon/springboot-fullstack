package com.study.full.stack.fullstack_project.service;

import com.study.full.stack.fullstack_project.dto.DemoDTO;
import com.study.full.stack.fullstack_project.dto.MembersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DemoService {

    @Autowired
    DemoRepository demoRepository;

    public List<DemoDTO> getUserList() {
        return demoRepository.getUserList();
    }

    public List<MembersDTO> getMemberList() {
        return demoRepository.getMemberList();
    }
}
