package com.baizhi.action;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;

public class AdminAction {
	private AdminService adminService;
	private Admin admin;

	
//‘∂≥Ã¡¨Ω”

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String register(){
		adminService.modifyregister(admin);
		return "registerSuccess";
	}

	public String login(){

		admin = adminService.modifylogin(admin);
		//System.out.println("-------------"+admin);
		if(admin!=null){
			return "loginSuccess";
		}else{
			return "loginError";
		}


	}
}
