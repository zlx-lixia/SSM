package com.baizhi.action;

import com.alibaba.fastjson.JSON;
import com.baizhi.entity.Department;
import com.baizhi.entity.Employee;
import com.baizhi.service.DepartmentService;
import com.baizhi.service.EmployeeService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class EmployeeAction {
	private DepartmentService departmentService;
	private EmployeeService employeeService;
	private Employee employee;
	private List<Employee> list;
	private String depid;
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	public String getDepid() {
		return depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	//动态下拉列表
	public String selectDepname(){
		HttpServletResponse response = ServletActionContext.getResponse();
		List<Department> list = departmentService.selectAllDep();
		String jsonString = JSON.toJSONString(list);
		//System.out.println(list);
		//System.out.println("jsonString"+jsonString);
		response.setCharacterEncoding("UTF-8");
		try {
			PrintWriter out = response.getWriter();
			out.print(jsonString);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	//添加员工
	public String addEmp(){
		employeeService.modifyaddEmp(employee);
		return "addEmpSuccess";
	}
	//展示所有员工
	public String selectAllEmp(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(depid!=null){
			//System.out.println("depid:"+depid);
			session.setAttribute("depid",depid);
			list = employeeService.selectAllEmp(depid);
		}else {

			depid = (String)session.getAttribute("depid");
			//System.out.println("depid========="+ this.depid);
			list = employeeService.selectAllEmp(this.depid);
		}
		return "selectAllEmpSuccess";
	}
	public String deleteEmp(){
		employeeService.modifydeleteEmp(id);
		return "deleteEmpSuccess";
	}
	public String selestOne(){
		employee = employeeService.selectOne(id);
		//System.out.println(employee);
		return "selestOneSuccess";
	}
	public String updateEmp(){
		employee.setId(id);
		//System.out.println(id);
		employeeService.modifyupdateEmp(employee);
		return "updateEmpSuccess";
	}
}
