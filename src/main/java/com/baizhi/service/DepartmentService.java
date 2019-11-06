package com.baizhi.service;

import com.baizhi.entity.Department;

import java.util.List;

public interface DepartmentService {
	public List<Department> selectAllDep();
	public void modifyaddDep(Department department);
	public Department selectDep(String id);
	public void modifyupdateDep(Department department);

}
