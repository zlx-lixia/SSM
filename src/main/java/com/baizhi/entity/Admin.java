package com.baizhi.entity;

import java.util.Objects;

public class Admin {
	private String id;
	private String adname;
	private String realname;
	private String password;
	private String sex;

	@Override
	public String toString() {
		return "Admin{" +
				"id='" + id + '\'' +
				", adname='" + adname + '\'' +
				", realname='" + realname + '\'' +
				", password='" + password + '\'' +
				", sex='" + sex + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Admin admin = (Admin) o;
		return Objects.equals(id, admin.id) &&
				Objects.equals(adname, admin.adname) &&
				Objects.equals(realname, admin.realname) &&
				Objects.equals(password, admin.password) &&
				Objects.equals(sex, admin.sex);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, adname, realname, password, sex);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdname() {
		return adname;
	}

	public void setAdname(String adname) {
		this.adname = adname;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Admin() {
	}

	public Admin(String id, String adname, String realname, String password, String sex) {
		this.id = id;
		this.adname = adname;
		this.realname = realname;
		this.password = password;
		this.sex = sex;
	}
}
