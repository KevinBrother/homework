package com.my.domain.model;

public class Score {
	private int id;
	
	private int studentId;
	
	private String grade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", studentId=" + studentId + ", grade="
				+ grade + "]";
	}
	
}
