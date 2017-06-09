package com.my.domain.model;

public class Classes {
	private int id;
	
	private int teacherId;

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

	@Override
	public String toString() {
		return "Classes [id=" + id + ", teacherId=" + teacherId + "]";
	}
	
}
