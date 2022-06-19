package org.rrs.home.service;

import org.rrs.member.persistence.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	MemberRepository repository;
	
}
