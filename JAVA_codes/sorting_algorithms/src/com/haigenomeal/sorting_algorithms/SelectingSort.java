package com.haigenomeal.sorting_algorithms;
/**
 *  选择排序
 *  实际就是通过每一趟锁定index
 *  再在改趟结束的时候进行交换
 * @author 海哥昨晚没吃饭
 *
 */
public class SelectingSort {
	public static void selectsort(int[] arr, boolean up) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (up) {
					if (arr[j] > arr[i]) {      // 选择无序区中最大的元素
						index = j;
					}
				}else {
					if (arr[j] < arr[i]) {      // 选择无序区中最小的元素
						index = j;
					}
				}
			}
			if (index != i) {
				swap_element(arr, i, index);
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
		selectsort(arr, false);
		print(arr);
	}
}
