package com.baizhi.service;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao;

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public void modifyregister(Admin admin) {
		//获取UUID作为主键
		String id = UUID.randomUUID().toString();
		admin.setId(id);
		adminDao.addAdmin(admin);
	}

	@Override
	public Admin modifylogin(Admin admin) {
		HttpServletRequest request = ServletActionContext.getRequest();
		Admin login = adminDao.login(admin);

		return login;

	}
}
