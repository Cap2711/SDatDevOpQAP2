package com.keyin.services;

import com.keyin.entities.Member;
import com.keyin.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public Member getMemberById(Long id) {
        return memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Member not found"));
    }

    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    public List<Member> searchMembersByName(String name) {
        return memberRepository.findByNameContaining(name);
    }
}
