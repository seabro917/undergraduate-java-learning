package com.haigenomeal.bubbleSort;
/**
 * ��tmd�ͺܸ�Ц��
 * md��ν�����հ��ð����������String�����Ȼ������...�ų����Ǵ�ģ�����
 * 2019��1��...
 * �ֵ�...��tm��if�ж������ø�ֵ���� tmd�ܶԲŹ���...
 * @author ��������û�Է�
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
