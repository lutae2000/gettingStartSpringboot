package com.example.springStudy.service;

import com.example.springStudy.domain.Member;
import com.example.springStudy.repository.MemberRepository;
import com.example.springStudy.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberService();
    MemoryMemberRepository memberRepository = new MemberRepository();

    @Test
    void join() {
        Member member = new Member();
        member.setName("hello");

        Long saveId = memberService.join(member);

        Assertions.assertThat();
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }

    @AfterEach
    public void afterEach(){
        member
    }
}