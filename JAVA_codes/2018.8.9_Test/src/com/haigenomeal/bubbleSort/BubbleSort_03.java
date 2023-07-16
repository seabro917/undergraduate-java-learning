package com.haigenomeal.bubbleSort;

public class BubbleSort_03 {
	
	public static <T extends Comparable<T>>void bubblesort_03(T[] arr)
	{
		boolean sorted = true;
		for(int i=0;i<arr.length-1;i++) 
		{
			sorted = true;
			for(int j=0;j<arr.length-1-i;j++)   
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					T temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
//					sorted = false;    
				}
			}
//			if(sorted = true)                     
//				break;
		}
	}
	public static <T> void print(T[] arr)
	{
		for(T temp:arr)
		{
			System.out.println(temp);  //自动调用toString方法
		}
    }
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student("c");
		arr[1] = new Student("c");
		arr[2] = new Student("c");
		arr[3] = new Student("b");
		arr[4] = new Student("b");
		bubblesort_03(arr);
		print(arr);
		
	}

}
