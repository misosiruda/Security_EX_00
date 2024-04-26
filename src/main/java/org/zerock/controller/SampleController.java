package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j
@RequestMapping("/sample")
@Controller
public class SampleController {

    // 모든 사용자가 접근 가능한 페이지
    @GetMapping("/all")
    public void doAll() {
        log.info("모든 사용자가 접근 가능");
    }

    // 회원이상의 권한 소유자만 접근 가능한 페이지
    @GetMapping("/member")
    public void doMember() {
        log.info("로그인 한 회원 혹은 그이상의 권한 소유자 접근 가능");
    }

    // 관리자만 접근 가능한 페이지
    @GetMapping("/admin")
    public void doAdmin() {
        log.info("관리자 접근 가능");
    }

}
