package com.publicss.www.domain.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"), USER("ROLE_MEMBER", "회원");

    private final String key, title;

}
