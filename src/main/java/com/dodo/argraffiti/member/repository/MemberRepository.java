package com.dodo.argraffiti.member.repository;

import com.dodo.argraffiti.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
