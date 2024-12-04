package com.CH22_SpringTest;

public class Student {
	private String name;
	private char sec;
	private int gpa;
	private String collegeName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSec() {
		return sec;
	}
	public void setSec(char sec) {
		this.sec = sec;
	}
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sec=" + sec + ", gpa=" + gpa + ", collegeName=" + collegeName + "]";
	}
	

}
