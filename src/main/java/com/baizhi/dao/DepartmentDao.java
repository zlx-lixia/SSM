package com.baizhi.dao;

import com.baizhi.entity.Department;

import java.util.List;

public interface DepartmentDao {
	//展示所有部门
	public List<Department> selectAllDep();
	//添加部门
	public void addDep(Department department);
	//查询单条数据
	public Department selectDep(String id);
	//修改
	public void updateDep(Department department);
}
