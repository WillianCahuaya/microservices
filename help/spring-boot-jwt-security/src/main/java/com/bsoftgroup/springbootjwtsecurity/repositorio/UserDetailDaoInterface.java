package com.bsoftgroup.springbootjwtsecurity.repositorio;

import com.bsoftgroup.springbootjwtsecurity.bean.Usuario;

public interface UserDetailDaoInterface {
	
	public Usuario getUsuario(String username);

}
