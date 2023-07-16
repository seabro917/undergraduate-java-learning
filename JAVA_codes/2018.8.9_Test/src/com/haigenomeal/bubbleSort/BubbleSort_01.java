package com.haigenomeal.bubbleSort;
/**
 * ʵ��ʹ��ð�������ʱ����ܳ��ֵ�����ǣ���ĳһ�˽���֮��������ʵ�Ѿ��ź��򣬲���Ҫ�ٽ��н������������ˣ�����������һ��
 * sorted�����������ٶ�ĳһ������û�з���һ�ν�������˵����ʱ�����Ѿ��ź��򣬲���Ҫ���н������������ˡ�������һ������ֻҪ
 * ������һ�ν�������ô����ʾ�ٶ�ʧ�ܡ�
 * @author ��������û�Է�
 *
 */

// ��һ��ð������ʵ�ֵ���ÿһ�˽���ǰ������һ�����ַ��ں���
// ���ʵ�ֵľ��Ǵ�С���������
public class BubbleSort_01 {
	
	public static void bubblesort_01(int[] arr) {
		
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
	
	public static void print(int[] arr)
	{
		for(int temp:arr)
		{
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		int[] arr = {4,1,5,33,1};;
		bubblesort_01(arr);
		print(arr);
	}

}
