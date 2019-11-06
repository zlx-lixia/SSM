package com.baizhi.action;

import com.baizhi.entity.Department;
import com.baizhi.service.DepartmentService;

import java.util.List;

public class DepartmentAction {
	private DepartmentService departmentService;
	private List<Department> list;
	private Department department;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Department> getList() {
		return list;
	}

	public void setList(List<Department> list) {
		this.list = list;
	}

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public String selectAllDep(){
		list = departmentService.selectAllDep();
		return "showDepSuccess";

	}
	public String addDep(){
		departmentService.modifyaddDep(department);
		return "addDepSuccess";
	}
	public String selectDep(){
		department = departmentService.selectDep(id);

		return "selectDepSuccess";
	}
	public String updateDep(){
		department.setId(id);
		departmentService.modifyupdateDep(department);
		return "updateDepSuccess";
	}
}
