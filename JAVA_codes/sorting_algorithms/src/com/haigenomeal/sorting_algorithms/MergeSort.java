package com.haigenomeal.sorting_algorithms;

import java.util.Arrays;

public class MergeSort {
	public static void mergesort(int arr[], int start, int end) {

	}
	public static void Merge(int arr[], int start, int middle, int end) {
		int[] temp_1 = new int[middle-start+1];
		int[] temp_2 = new int[end - middle];
		for(int i = start; i<=middle; i++)
		{
			temp_1[i] = arr[i];
		}
		for(int j = middle+1; j <= end; j++) {
			temp_2[j-middle-1] = arr[j];
		}
		int index = 0;
		int i = 0;
		int j = 0;
		while(i<middle-start+1 && j<end-middle) {
			if(temp_1[i] < temp_2[j]) {
				arr[index] = temp_1[i];
				i++;
				index++;
			}else {
				arr[index] = temp_2[j];
				j++;
				index++;
			}
		}
		while(i<middle-start+1) {
			arr[index] = temp_1[i]; 
			i++;
			index++;
		}
		while(j<end-middle) {
			arr[index] = temp_2[j]; 
			j++;
			index++;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,9,11,2,4,6,8};
		Merge(arr, 0, 5, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
