package com.haigenomeal.sorting_algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void Quick_Sort(int arr[], int start, int end) {
		if (start < end) {
			int high = end;
			int low = start;
			int standard = arr[start];
			while(high > low) {
				while(low < high && arr[high] > standard) {
					high--;
				}
				arr[low] = arr[high];
				while(low < high && arr[low] < standard) {
					low++;
				}
				arr[high] = arr[low];
			}
			arr[low] = standard;
	        Quick_Sort(arr, start, high-1);
	        Quick_Sort(arr, high+1, arr.length-1);
		}
	}
	public static void main(String[] args) {
		int arr[] = new int[] {5,3,41,2,22,1,25};
		Quick_Sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
