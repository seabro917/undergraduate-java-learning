package com.haigenomeal.bubbleSort;
/**
 * 这tmd就很搞笑了
 * md所谓的最终版的冒泡排序用在String里面居然不能用...排出来是错的，，，
 * 2019年1月...
 * 兄弟...你tm再if判断里面用赋值符号 tmd能对才怪了...
 * @author 海哥昨晚没吃饭
 *
 */
public class BubbleSort_02 {
	
	public static void bubblesort_02(String[] arr) {
		boolean sorted = true;
		for(int i=0;i<arr.length-1;i++) 
		{
			sorted = true;
			for(int j=0;j<arr.length-1-i;j++)   
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					sorted = false;    
				}
			}
			if(sorted == true)                     
				break;
		}
	}
	
	public static void print(String[] arr)
	{
		for(String temp:arr)
		{
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		String[] arr = {"b","b","m","c","c","b","h"};
		bubblesort_02(arr);
		print(arr);
	}
}
