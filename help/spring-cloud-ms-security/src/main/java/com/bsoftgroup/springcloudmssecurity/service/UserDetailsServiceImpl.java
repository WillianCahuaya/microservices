package com.bsoftgroup.springcloudmssecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bsoftgroup.springcloudmssecurity.bean.Usuario;
import com.bsoftgroup.springcloudmssecurity.repositorio.UserDetailDaoInterface;


@Service
public class UserDetailsServiceImpl implements UserDetailsService  {
	
	@Autowired
	private UserDetailDaoInterface userdao;
	
	@Autowired
	private BCryptPasswordEncoder encoder;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = userdao.getUsuario(username);
		if(usuario!=null) {
			List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN");
			return new User(usuario.getUsername(), encoder.encode(usuario.getPassword()), grantedAuthorities);
			}
			// TODO Auto-generated method stub
			throw new UsernameNotFoundException("username not found");
	}


}
