/**
 * ������һ��comparator�Ķ��� ʵ��ͨ���û��Զ�����ⲿ�Ƚ������涨�ıȽϷ�ʽ��������
 */
package com.haigenomeal.bubbleSort;

import java.util.Comparator;
import java.util.Date;

public class BubbleSort_xx {

	//����ǰ�淺��Ҫд<T>!!һ��ʼ��д����<T extends Comparator< ? super T>>���main����������ò���
	public static <T> void bubblesort_07(T[] arr,Comparator<? super T> comp)  
	{
		for(int i=0;i<arr.length-1;i++) 
		{
			boolean sorted = true;
			for(int j=0;j<arr.length-1-i;j++)   
			{
				if(comp.compare(arr[j],arr[j+1])>0)
				{
					T temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					sorted = false;
				}
			}
			if(sorted == true)
			{
				break;
			}
		}
	}
	public static void main(String[] args) {
		News[] news = new News[5];
		news[0] = new News(new Date(),200, "��������û�Է�");
		news[1] = new News(new Date(System.currentTimeMillis()+1000*60*60*4), 200,"��������û�Է�");
		news[2] = new News(new Date(System.currentTimeMillis()+1000*60*60), 300, "��������û��");
		news[3] = new News(new Date(System.currentTimeMillis()+1000*60*60), 350, "��������û��");
		news[4] = new News(new Date(System.currentTimeMillis()+1000*60*60*3), 350,"����������������");

		//		�ٴ�����Ҫ�ȽϵĶ��󼯺�ͬʱ���������Զ����comparator����
		bubblesort_07(news, new CompareNews());
		for(News temp:news)
		{
			System.out.println(temp);
		}

	}

}
