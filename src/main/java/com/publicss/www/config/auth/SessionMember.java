package com.publicss.www.config.auth;

import java.io.Serializable;

import com.publicss.www.domain.member.Member;

import lombok.Getter;
 
@Getter
public class SessionMember implements Serializable{
    
    private String name;
    private String email;
    private String picture;

    public SessionMember(Member member) {
        this.name = member.getName();
        this.email = member.getEmail();
        this.picture = member.getPicture();
    }
}