package com.my.domain.model;

public class Teacher {
	private int id;
	
	private String name;
	
	private String password;
	
	private String teachCourse;
	
	private boolean isTutor;

	private int leadClassId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTeachCourse() {
		return teachCourse;
	}

	public void setTeachCourse(String teachCourse) {
		this.teachCourse = teachCourse;
	}

	public boolean isTutor() {
		return isTutor;
	}

	public void setTutor(boolean isTutor) {
		this.isTutor = isTutor;
	}

	public int getLeadClassId() {
		return leadClassId;
	}

	public void setLeadClassId(int leadClassId) {
		this.leadClassId = leadClassId;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", password="
				+ password + ", teachCourse=" + teachCourse + ", isTutor="
				+ isTutor + ", leadClassId=" + leadClassId + "]";
	}

}
