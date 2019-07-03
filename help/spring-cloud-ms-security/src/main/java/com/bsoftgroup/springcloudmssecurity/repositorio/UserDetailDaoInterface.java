package com.bsoftgroup.springcloudmssecurity.repositorio;

import com.bsoftgroup.springcloudmssecurity.bean.Usuario;

public interface UserDetailDaoInterface {

	public Usuario getUsuario(String username);
}
