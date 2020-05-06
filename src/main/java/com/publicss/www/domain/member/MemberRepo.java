package com.publicss.www.domain.member;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member,Long> {
    Optional<Member> findByEmail(String email);   
}