package com.haigenomeal.bubbleSort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class News {
	private Date releaseDate;
	private int hits;
	private String name;
	
	public News() {
		// TODO Auto-generated constructor stub
	}
	public News(Date releaseDate, int hits, String name) {
		super();
		this.releaseDate = releaseDate;
		this.hits = hits;
		this.name = name;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return "���ű���Ϊ��"+this.getName()+",�����ŵĵ����Ϊ��"+this.getHits()+"�������ķ�������Ϊ��"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.getReleaseDate());
	}

}
