package com.haigenomeal.storage01;

public class LaoPo {
	String name;
	int age;
	String oppaiSize;
	String Origin;
	
	public LaoPo(String name, int age, String oppaiSize, String origin) {
		super();
		this.name = name;
		this.age = age;
		this.oppaiSize = oppaiSize;
		this.Origin = origin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getOppaiSize() {
		return oppaiSize;
	}
	public void setOppaiSize(String oppaiSize) {
		this.oppaiSize = oppaiSize;
	}
	public String getOrigin() {
		return Origin;
	}
	public void setOrigin(String origin) {
		Origin = origin;
	}
	
	

}
