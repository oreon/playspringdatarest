package com.td.bbwp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.td.bbwp.users.AppUser;
import com.td.bbwp.web.action.users.AppUserRepository;

@Component
public class SpringDataJpaUserDetailsService implements UserDetailsService {

	private final AppUserRepository repository;

	@Autowired
	public SpringDataJpaUserDetailsService(AppUserRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
  		AppUser manager = this.repository.findByUserName(name);
		
		//List<GrantedAuthority> rolenames =  manager.getAppRoles().parallelStream().
		//		map(role -> new GrantedAuthority(role.getName())  ).collect(Collectors.toList());5
		
		return new User(manager.getUserName(), manager.getPassword(),manager.getAppRoles());
	}

}