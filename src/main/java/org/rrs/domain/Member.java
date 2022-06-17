package org.rrs.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Member {
	
	@Id
	private String id;
	private String name;
	private String phone;
	private String password;
	private String nickName;
	private String role;
	private Boolean enabled;
	private String regDate;
	
}
