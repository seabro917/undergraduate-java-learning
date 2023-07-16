package com.haigenomeal.bubbleSort;

public class Student implements Comparable<Student>{
	private String name;
	private int ID;
	private int classnumber;

	public Student() {
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(String name, int iD, int classnumber) {
		super();
		this.name = name;
		this.ID = iD;
		this.classnumber = classnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public int getClassnumber() {
		return classnumber;
	}
	public void setClassnumber(int classnumber) {
		this.classnumber = classnumber;
	}
	@Override
	public int compareTo(Student o) {
		
		return this.getName().compareTo(o.getName());
	}
	public String toString()
	{
		return "学生姓名为："+this.getName()+"，学生学号为："+this.getID()+"，学生的班号为："+this.getClassnumber()+"。";
		
	}

}
