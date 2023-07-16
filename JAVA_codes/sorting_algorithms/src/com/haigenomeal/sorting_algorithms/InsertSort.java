package com.haigenomeal.sorting_algorithms;
/**
 * 将待排序数组分为两个部分： 有序区和无序区
 * 核心思想是每次取出无序区的第一个元素，插入到有序区中
 * 有序和无序区的划分是通过一个变量标记当前数组中， 前多少个元素已经是局部有序了。
 * @author 海哥昨晚没吃饭
 *
 */
public class InsertSort {
	/**
	 * 插入排序
	 * @param arr       排序数组
	 * @param asc       是否升序
	 */
	public static void insertsort(int[] arr, boolean asc) {
		// 有序区最后一个元素位置
		int orderedLastIndex = 0;//开始排序时，将有序区结束位置设为0 (开始位置总是0)，对应的无序区范围就是 1:arr.length
		for (int i = orderedLastIndex + 1; i < arr.length; i++) {//迭代无序区中的每一个元素，依次插入有序区中
			int temp = arr[i];//记录无序区中的第一个元素值
			int insertIndex = i;//在有序区中插入的索引的位置，刚开始就设置为自己的位置
			for (int j = orderedLastIndex; j >= 0; j--) {//从有序区从后往前开始比较
				if (asc) {//升序，有序区中比当前无序区中元素大的都右移一个位置
					if (arr[j] > temp) {
						arr[j+1] = arr[j];
						insertIndex --;//有序区每移动一次，将插入位置-1
					} else {
						break;//有序区当前位置元素<=无序区第一个元素，那么之前的元素都会<=，不需要继续比较
					}
				} else {//降序，有序区中比当前无序区中元素小的都右移一个位置
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
	 * 自己写的插入排序。。。注意局部变量的使用 for循环的变量出了for循环的作用于就没用了 所以网上找的那个
	 * 插入排序他一开始就定义了变量。
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
	 * 其实就是把后面无序区每一此第一个数字插入到前面的有序区
	 * 例如升序 遍历整个数组， 如果发现有小于前面一个数字的数字， 那么就把这个数字设为temp， 插入到前面的有序区
	 * 插入的时候， 如果当前数字比temp大， 那么就往后移一个， 如果比temp小， 那么该数字位置不动， temp放到下标+1的位置
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
