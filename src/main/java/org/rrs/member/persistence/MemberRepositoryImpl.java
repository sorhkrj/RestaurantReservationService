package org.rrs.member.persistence;

import org.springframework.beans.factory.annotation.Autowired;

import com.querydsl.jpa.impl.JPAQueryFactory;

public class MemberRepositoryImpl implements MemberRepositoryCustom {
	
	@Autowired
	JPAQueryFactory jpaQueryFactory;
}
