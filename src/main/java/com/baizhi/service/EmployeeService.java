package com.baizhi.service;

import com.baizhi.entity.Employee;

import java.util.List;

public interface EmployeeService {
	public void modifyaddEmp(Employee employee);
	//展示该部门下的所有员工
	public List<Employee> selectAllEmp(String depid);

	public void modifydeleteEmp(Integer id);

	public Employee selectOne(Integer id);
	public void modifyupdateEmp(Employee employee);
}
