package com.baizhi.dao;

import com.baizhi.entity.Employee;

import java.util.List;

public interface EmployeeDao {
	//展示该部门下的所有员工
	public List<Employee> selectAllEmp(String depid);

	//添加员工
	public void addEmp(Employee employee);

	public void deleteEmp(Integer id);

	public Employee selectOne(Integer id);
	public void updateEmp(Employee employee);
}
