package com.baizhi.service;

import com.baizhi.dao.DepartmentDao;
import com.baizhi.entity.Department;

import java.util.List;
import java.util.UUID;

public class DepartmentServiceImpl implements DepartmentService {
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Override
	public List<Department> selectAllDep() {
		List<Department> departments = departmentDao.selectAllDep();
		return departments;
	}

	@Override
	public void modifyaddDep(Department department) {
		String id = UUID.randomUUID().toString();
		department.setId(id);
		departmentDao.addDep(department);
	}

	@Override
	public Department selectDep(String id) {
		Department department = departmentDao.selectDep(id);
		return department;
	}

	@Override
	public void modifyupdateDep(Department department) {
		departmentDao.updateDep(department);
	}
}
