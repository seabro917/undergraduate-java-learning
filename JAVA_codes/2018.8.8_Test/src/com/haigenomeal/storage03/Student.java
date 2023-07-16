package com.haigenomeal.storage03;

public class Student {

	private String name;
	private int classnumber;
	private int score;
	public Student(String name, int classnumber, int score) {
		super();
		this.name = name;
		this.classnumber = classnumber;
		this.score = score;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassnumber() {
		return classnumber;
	}
	public void setClassnumber(int classnumber) {
		this.classnumber = classnumber;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
