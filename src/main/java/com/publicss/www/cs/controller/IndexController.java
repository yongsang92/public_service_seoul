package com.publicss.www.cs.controller;

import lombok.RequiredArgsConstructor;

import javax.servlet.http.HttpSession;

import com.publicss.www.config.auth.LoginMember;
import com.publicss.www.config.auth.SessionMember;
import com.publicss.www.domain.member.Member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model,@LoginMember SessionMember member) {
        if (member != null) {
            model.addAttribute("memberName", member.getName());
            System.out.println(member.getEmail());
        }
        return "index";
    }
}