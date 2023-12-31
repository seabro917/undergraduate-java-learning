package com.haigenomeal.sorting_algorithms;

import javax.xml.transform.Templates;

/**
 * 实际使用冒泡排序的时候可能出现的情况是：在某一趟结束之后数组其实已经排好序，不需要再进行接下来的趟数了，所以先设置一个
 * sorted布尔变量，假定某一趟里面没有发生一次交换，则说明此时数组已经排好序，不需要进行接下来的趟数了。但是这一趟里面只要
 * 发生了一次交换，那么即表示假定失败。
 * @author 海哥昨晚没吃饭
 *
 */
// 更新： 04/03/19 考虑另外一种形式的冒泡排序

public class BubbleSort{

	public static void bubblesort_01(int[] arr) {
		// 这一个冒泡排序实现的是每一趟将当前趟最大的一个数字放在后面
		// 最后实现的就是从小到大的排序。
		boolean sorted = true;
		//每趟
		for(int i=0;i<arr.length-1;i++) 
		{
			//假定有序
			sorted = true;
			//每趟里面的每次
			for(int j=0;j<arr.length-1-i;j++)  //for(int j=0;j<arr.length-1;j++)每趟其实比较的次数都在减少一次，所以-i 
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					sorted = false;    //假定失败
				}
			} // 当前趟结束。
			if(sorted == true)                     
				break;
		}
	}


	/**
	 * 
	 * @param arr 排序的数组
	 * @param up  是否升序排序
	 */
	public static void bubblesort_02(int[] arr, boolean up) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1;j < arr.length; j++) {
				if(up) {
					if (arr[i] < arr[j]) {
						swap_element(arr,i,j);
					}
				}else {
					if(arr[i] > arr[j]) {
						swap_element(arr,i,j);
					}
				}
			}
		}
	}
	public static void swap_element(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr)
	{
		for(int temp:arr)
		{
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		int[] arr = {4,1,5,33,1};
		print(arr);
		System.out.println("*****");
//		bubblesort_01(arr);
		bubblesort_02(arr, false);
		print(arr);
	}

}
