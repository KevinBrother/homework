package com.my.domain.model;

public class Course {
	private int id;
	
	private int courseId;
	
	private int teacherId;
	
	private String name;
	
	private int isSeleClass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIsSeleClass() {
		return isSeleClass;
	}

	public void setIsSeleClass(int isSeleClass) {
		this.isSeleClass = isSeleClass;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseId=" + courseId + ", teacherId="
				+ teacherId + ", name=" + name + ", isSeleClass=" + isSeleClass
				+ "]";
	}
}
