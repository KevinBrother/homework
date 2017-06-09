package com.my.domain.model;

import java.util.Date;

public class Student {
	private int id;
	
	private int classId;
	
	private String name;
	
	private Date birthday;
	
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", classId=" + classId + ", name=" + name
				+ ", birthday=" + birthday + ", password=" + password + "]";
	}

}

