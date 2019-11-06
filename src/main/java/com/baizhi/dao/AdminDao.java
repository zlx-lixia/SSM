package com.baizhi.dao;

import com.baizhi.entity.Admin;

public interface AdminDao {
	//管理员注册
	public void addAdmin(Admin admin);
	//管理员登录
	public Admin login(Admin admin);

}
