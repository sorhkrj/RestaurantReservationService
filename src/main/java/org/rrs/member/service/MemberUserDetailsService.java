package org.rrs.member.service;

import java.util.Optional;

import org.rrs.config.SecurityUser;
import org.rrs.domain.Member;
import org.rrs.member.respository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MemberUserDetailsService implements UserDetailsService {
	
	@Autowired
	private MemberRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Member> optional = repository.findById(username);
		if (optional.isEmpty()) {
			throw new UsernameNotFoundException("사용자 권한이 없음");
		} else {
			Member member = optional.get();
			return new SecurityUser(member);
		}
	}
	
}
