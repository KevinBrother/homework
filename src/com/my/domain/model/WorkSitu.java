package com.my.domain.model;

import java.util.Date;

public class WorkSitu {
	private int id;
	
	private int teacherId;
	
	private int classId;
	
	private int courseId;
	
	private String title;
	
	private String descr;
	
	private Date newat;
	
	private Date upat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Date getNewat() {
		return newat;
	}

	public void setNewat(Date newat) {
		this.newat = newat;
	}

	public Date getUpat() {
		return upat;
	}

	public void setUpat(Date upat) {
		this.upat = upat;
	}
	
	
}
