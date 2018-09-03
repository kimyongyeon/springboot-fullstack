package com.study.full.stack.fullstack_project.controller;

import com.study.full.stack.fullstack_project.config.ServerProfiles;
import com.study.full.stack.fullstack_project.service.MemberRepository;
import com.study.full.stack.fullstack_project.service.MemberSVC;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MemberSVC memberSVC;

    @Autowired
    private ServerProfiles serverProfiles;

    @GetMapping("/")
    public String index() {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");

        log.error("log error");
        log.debug("env 01: " + serverProfiles.getServers().get(0));
        log.debug("env 02: " + serverProfiles.getServers().get(1));
        log.debug("db : " + serverProfiles.getDb());

        return "hello spring ";
    }

//    @GetMapping("/members")
//    public List getMembers() {
//        MembersDTO membersDTO = new MembersDTO();
//        membersDTO.setName("admin");
//        membersDTO.setUserId("adminId");
//        membersDTO.setUserPassword("1234");
//        membersDTO.setAddr("seoul");
//        membersDTO.setTel("010-1234-1234");
//        List<MembersDTO> membersDTOS = new ArrayList<>();
//        membersDTOS.add(membersDTO);
//
//        for(int i=0; i<10; i++) {
//            membersDTO = new MembersDTO();
//            membersDTO.setName("admin_" + i);
//            membersDTO.setUserId("adminId" + i);
//            membersDTO.setUserPassword("1234" + i);
//            membersDTO.setAddr("seoul" + i);
//            membersDTO.setTel("010-1234-1234" + i);
//            membersDTOS.add(membersDTO);
//        }
//
//        return membersDTOS;
//    }
//
//    @GetMapping("/insMembers")
//    public String setMembers(String name, String userId) {
//        return name + ":" + userId;
//    }
//
//    @GetMapping("/pathMembers/{name}")
//    public String setMembers2(@PathVariable String name) {
//        return "path: " + name;
//    }

//    @GetMapping("/{depth}")
//    public String depth(@PathVariable String depth) throws Exception {
//
//        if (depth.equals("aop")) {
//            memberSVC.testAop();
//        }
//        else if (depth.equals("except")) {
//            throw new TestException("TEST EXCEPTION ERROR");
//        }
//        else if (depth.equals("async")) {
//            // http://dveamer.github.io/java/SpringAsync.html
//            memberSVC.method1("kim");
//        }
//        else {
//            memberSVC.test();
//        }
//        String returnUrl = "";
//        if (depth.equals("members")) {
//            List members = (List) memberRepository.findAll();
//            returnUrl = members.toString();
//        }
//        else if (depth.equals("insMembers")) {
//            MembersDTO membersDTO = new MembersDTO();
//            membersDTO.setName("firstInsertName");
//            memberRepository.save(membersDTO);
//            returnUrl = "ok";
//        } else {
//            returnUrl = "fail";
//        }
//        return returnUrl;
//    }

    @GetMapping("/{depth1}/{depth2}")
    public String depth2(@PathVariable String depth1, @PathVariable String depth2) {
        String returnUrl = "";
        if (depth1.equals("member1")) {
            returnUrl = ">" + depth1 + "/" + depth2;
        }
        else if (depth1.equals("member2")) {
            returnUrl = ">>" + depth1 + "/" + depth2;
        } else {
            returnUrl = depth1 + "/" +  depth2;
        }
        return returnUrl;
    }

    /**
     * 이 컨트롤러 내에서 발생하는 모든 Number Format 예외를 처리한다     *
     * http://springboot.tistory.com/33
     * */
    @ExceptionHandler(value = NumberFormatException.class)
    public String nfeHandler(NumberFormatException e){
        return e.getMessage();
    }

}

