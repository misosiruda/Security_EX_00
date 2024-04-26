package org.zerock.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j
public class CommonController {

    // 접근 거부 페이지 핸들러
    @GetMapping("/accessError")
    public void accessDenied(Authentication auth, Model model) {
        log.info("accessDenied : " + auth);
        model.addAttribute("msg", "Access Denied");
    }

}
