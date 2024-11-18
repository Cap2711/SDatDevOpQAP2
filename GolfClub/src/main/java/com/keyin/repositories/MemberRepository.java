package com.keyin.repositories;

import com.keyin.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByNameContaining(String name);
    List<Member> findByPhoneNumber(String phoneNumber);
}
