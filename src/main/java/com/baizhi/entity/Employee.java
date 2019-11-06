package com.baizhi.entity;

import java.util.Objects;

public class Employee {
	private Integer id;
	private String empname;
	private Double salary;
	private Integer age;
	private String depid;
	private Department dep;

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", empname='" + empname + '\'' +
				", salary=" + salary +
				", age=" + age +
				", depid='" + depid + '\'' +
				", dep=" + dep +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(id, employee.id) &&
				Objects.equals(empname, employee.empname) &&
				Objects.equals(salary, employee.salary) &&
				Objects.equals(age, employee.age) &&
				Objects.equals(depid, employee.depid) &&
				Objects.equals(dep, employee.dep);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, empname, salary, age, depid, dep);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDepid() {
		return depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public Employee(Integer id, String empname, Double salary, Integer age, String depid, Department dep) {
		this.id = id;
		this.empname = empname;
		this.salary = salary;
		this.age = age;
		this.depid = depid;
		this.dep = dep;
	}

	public Employee() {
	}
}
