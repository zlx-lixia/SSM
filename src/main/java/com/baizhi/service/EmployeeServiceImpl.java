package com.baizhi.service;

import com.baizhi.dao.EmployeeDao;
import com.baizhi.entity.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}


	@Override
	public void modifyaddEmp(Employee employee) {
		employeeDao.addEmp(employee);
	}

	@Override
	public List<Employee> selectAllEmp(String depid) {
		List<Employee> employees = employeeDao.selectAllEmp(depid);
		return employees;
	}

	@Override
	public void modifydeleteEmp(Integer id) {
		employeeDao.deleteEmp(id);
	}

	@Override
	public Employee selectOne(Integer id) {
		Employee employee = employeeDao.selectOne(id);
		return employee;
	}

	@Override
	public void modifyupdateEmp(Employee employee) {
		employeeDao.updateEmp(employee);
	}
}
