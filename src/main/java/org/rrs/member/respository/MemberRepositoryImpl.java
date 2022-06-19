package org.rrs.member.respository;

import org.springframework.beans.factory.annotation.Autowired;

import com.querydsl.jpa.impl.JPAQueryFactory;

public class MemberRepositoryImpl implements MemberRepositoryCustom {
	
	@Autowired
	JPAQueryFactory jpaQueryFactory;
}
