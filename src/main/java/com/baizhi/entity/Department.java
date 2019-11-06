package com.baizhi.entity;

import java.util.Objects;

public class Department {
	private String id;
	private String depnum;
	private String depname;

	@Override
	public String toString() {
		return "Department{" +
				"id='" + id + '\'' +
				", depnum='" + depnum + '\'' +
				", depname='" + depname + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Department that = (Department) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(depnum, that.depnum) &&
				Objects.equals(depname, that.depname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, depnum, depname);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepnum() {
		return depnum;
	}

	public void setDepnum(String depnum) {
		this.depnum = depnum;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public Department(String id, String depnum, String depname) {
		this.id = id;
		this.depnum = depnum;
		this.depname = depname;
	}

	public Department() {
	}
}
