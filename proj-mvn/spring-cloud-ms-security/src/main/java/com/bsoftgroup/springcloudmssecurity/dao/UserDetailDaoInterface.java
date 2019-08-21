package com.bsoftgroup.springcloudmssecurity.dao;

import com.bsoftgroup.springcloudmssecurity.bean.Usuario;

public interface UserDetailDaoInterface {
	
	public Usuario getUsuario(String username);

}
