package com.study.full.stack.fullstack_project.service;

import com.study.full.stack.fullstack_project.dto.MembersDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MembersDTO, Long> {
}
