package com.haigenomeal.sorting_algorithms;
/**
 *  ѡ������
 *  ʵ�ʾ���ͨ��ÿһ������index
 *  ���ڸ��˽�����ʱ����н���
 * @author ��������û�Է�
 *
 */
public class SelectingSort {
	public static void selectsort(int[] arr, boolean up) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (up) {
					if (arr[j] > arr[i]) {      // ѡ��������������Ԫ��
						index = j;
					}
				}else {
					if (arr[j] < arr[i]) {      // ѡ������������С��Ԫ��
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
