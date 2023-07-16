package com.haigenomeal.sorting_algorithms;
/**
 * �������������Ϊ�������֣� ��������������
 * ����˼����ÿ��ȡ���������ĵ�һ��Ԫ�أ����뵽��������
 * ������������Ļ�����ͨ��һ��������ǵ�ǰ�����У� ǰ���ٸ�Ԫ���Ѿ��Ǿֲ������ˡ�
 * @author ��������û�Է�
 *
 */
public class InsertSort {
	/**
	 * ��������
	 * @param arr       ��������
	 * @param asc       �Ƿ�����
	 */
	public static void insertsort(int[] arr, boolean asc) {
		// ���������һ��Ԫ��λ��
		int orderedLastIndex = 0;//��ʼ����ʱ��������������λ����Ϊ0 (��ʼλ������0)����Ӧ����������Χ���� 1:arr.length
		for (int i = orderedLastIndex + 1; i < arr.length; i++) {//�����������е�ÿһ��Ԫ�أ����β�����������
			int temp = arr[i];//��¼�������еĵ�һ��Ԫ��ֵ
			int insertIndex = i;//���������в����������λ�ã��տ�ʼ������Ϊ�Լ���λ��
			for (int j = orderedLastIndex; j >= 0; j--) {//���������Ӻ���ǰ��ʼ�Ƚ�
				if (asc) {//�����������бȵ�ǰ��������Ԫ�ش�Ķ�����һ��λ��
					if (arr[j] > temp) {
						arr[j+1] = arr[j];
						insertIndex --;//������ÿ�ƶ�һ�Σ�������λ��-1
					} else {
						break;//��������ǰλ��Ԫ��<=��������һ��Ԫ�أ���ô֮ǰ��Ԫ�ض���<=������Ҫ�����Ƚ�
					}
				} else {//�����������бȵ�ǰ��������Ԫ��С�Ķ�����һ��λ��
					if (arr[j] < temp) {
						arr[j+1] = arr[j];
						insertIndex --;
					} else {
						break;
					}
				}
			}
			arr[insertIndex] = temp;
			orderedLastIndex ++;
		}
	}
	/**
	 * �Լ�д�Ĳ������򡣡���ע��ֲ�������ʹ�� forѭ���ı�������forѭ���������ھ�û���� ���������ҵ��Ǹ�
	 * ����������һ��ʼ�Ͷ����˱�����
	 * @param arr
	 */
	public static void insert_sort_my (int[] arr) {
		for (int outter_index = 1; outter_index < arr.length; outter_index++) {
			int temp = arr[outter_index];
			int inner_position = outter_index - 1;
			for (int j = outter_index - 1;j >= 0; j--) {
				if (arr[j] < temp) {
					arr[j + 1] = arr[j];
					inner_position--;
				}else {
					break;
				}
			}
			arr[inner_position + 1] = temp;
		}
	}
	/**
	 * ��ʵ���ǰѺ���������ÿһ�˵�һ�����ֲ��뵽ǰ���������
	 * �������� �����������飬 ���������С��ǰ��һ�����ֵ����֣� ��ô�Ͱ����������Ϊtemp�� ���뵽ǰ���������
	 * �����ʱ�� �����ǰ���ֱ�temp�� ��ô��������һ���� �����tempС�� ��ô������λ�ò����� temp�ŵ��±�+1��λ��
	 * @param arr
	 */
	public static void insert_sort_2(int[] arr) {
		for(int i = 1; i <= arr.length - 1; i++) {
			if(arr[i-1] > arr[i]) {
				int temp = arr[i];
				for(int j = i-1; j>=0; j--) {
					if(arr[j] > temp) {
						arr[j+1] = arr[j];
					}else {
						arr[j+1] = temp;
						break;
					}
				}
			}
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
		int[] arr = {1,3,5,33,1,6,44,3,98,12};
		print(arr);
		System.out.println("*****");
		//		bubblesort_01(arr);
		//		insertsort(arr, false);
//		insert_sort_my(arr);
		insert_sort_2(arr);
		print(arr);
	}
}
