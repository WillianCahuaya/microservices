package com.bsofgroup.springcloudmssecurity.dao;

import com.bsofgroup.springcloudmssecurity.bean.Usuario;

public interface UserDetailDaoInterface {

	public Usuario getUsuario(String username);

}
