package com.haigenomeal.sorting_algorithms;

import javax.xml.transform.Templates;

/**
 * ʵ��ʹ��ð�������ʱ����ܳ��ֵ�����ǣ���ĳһ�˽���֮��������ʵ�Ѿ��ź��򣬲���Ҫ�ٽ��н������������ˣ�����������һ��
 * sorted�����������ٶ�ĳһ������û�з���һ�ν�������˵����ʱ�����Ѿ��ź��򣬲���Ҫ���н������������ˡ�������һ������ֻҪ
 * ������һ�ν�������ô����ʾ�ٶ�ʧ�ܡ�
 * @author ��������û�Է�
 *
 */
// ���£� 04/03/19 ��������һ����ʽ��ð������

public class BubbleSort{

	public static void bubblesort_01(int[] arr) {
		// ��һ��ð������ʵ�ֵ���ÿһ�˽���ǰ������һ�����ַ��ں���
		// ���ʵ�ֵľ��Ǵ�С���������
		boolean sorted = true;
		//ÿ��
		for(int i=0;i<arr.length-1;i++) 
		{
			//�ٶ�����
			sorted = true;
			//ÿ�������ÿ��
			for(int j=0;j<arr.length-1-i;j++)  //for(int j=0;j<arr.length-1;j++)ÿ����ʵ�ȽϵĴ������ڼ���һ�Σ�����-i 
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					sorted = false;    //�ٶ�ʧ��
				}
			} // ��ǰ�˽�����
			if(sorted == true)                     
				break;
		}
	}


	/**
	 * 
	 * @param arr ���������
	 * @param up  �Ƿ���������
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
