package com.baizhi.test;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminTest {
	@Test
	public void Test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminDao adminDao=(AdminDao) ac.getBean("adminDao");
		adminDao.addAdmin(new Admin("1","lmm","李喵喵","123123","男"));
	}
	@Test
	public void Test2(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminService adminService=(AdminService) ac.getBean("adminService");
		adminService.modifyregister(new Admin("2","xmm","虾咪咪","123123","女"));
	}
}
