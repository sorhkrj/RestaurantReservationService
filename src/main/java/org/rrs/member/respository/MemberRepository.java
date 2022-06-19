package org.rrs.member.respository;

import org.rrs.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String>, MemberRepositoryCustom {
	
}