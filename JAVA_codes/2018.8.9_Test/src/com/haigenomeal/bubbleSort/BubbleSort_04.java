package com.haigenomeal.bubbleSort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * ʵ�ֽ�list���������Ԫ������
 * @author ��������û�Է�
 *
 */
public class BubbleSort_04 {
//	������Ҫ��������ķ���T������ʵ����Comparable�ӿڵ��࣬�����޷�����compareTo�������бȽϣ�����
	public static <T extends Comparable<T>>void bubblesort_04(T[] arr) 
	{
		boolean sorted = true;
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=0;j<arr.length-1-i;j++)   
			{
				sorted = true;
				if(arr[j].compareTo(arr[j+1])>0)
				{
					T temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					sorted = false;
				}
			} // ��ǰ�˽���
			if (sorted == true)
			{
				break;
			}
		}
	}
	
	public static void bubblesort_05(Object[] arr) 
	{
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=0;j<arr.length-1-i;j++)   
			{
				if(((Comparable)arr[j]).compareTo(arr[j+1])>0)  //����Ϊʲôһ��Ҫǿת��Comparable��
				{                                               //��������ΪObject�����û��ʵ��Comparable�ӿڣ�
					Object temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static <T extends Comparable<T>> void bubblesort_06(List<T> list) 
	{
		//��һ����ת������
		Object[] array = list.toArray();
		bubblesort_05(array);
		//�ڶ������ı������ж�Ӧ��ֵ
		for(int i=0;i<array.length;i++)
		{
			list.set(i, (T) array[i]);
		}
	}
	
	
	
	public static <T> void print(T[] arr)
	{
		for(T temp:arr)
		{
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("papapa"));
		list.add(new Student("haigege"));
		list.add(new Student("haigeGe"));
		list.add(new Student("haigeg"));
		list.add(new Student("hAigege"));
		
		bubblesort_06(list);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
		
	}

}
