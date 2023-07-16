package com.haigenomeal.storage03;

public class Pairs {
	private String name;
	private int score;
	public Pairs(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public Pairs() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
