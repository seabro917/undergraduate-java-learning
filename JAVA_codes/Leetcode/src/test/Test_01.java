package test;

import java.util.HashSet;
import java.util.Set;

public class Test_01 {

	public static void main(String[] args) {
//		Set<Integer> myset = new HashSet<Integer>();
//		int[] arr = new int[] {1,1,2,2,4,3,3,5,5,6};
//		for(int i=0;i<arr.length;i++) {
//			if(myset.contains(arr[i])) {
//				myset.remove(arr[i]);
//			}else {
//				myset.add(arr[i]);
//			}
//		}
//		System.out.println(myset);
		
		int[] arr = new int[] {1,1,2,2,4,3,3,5,5,6};
		int x = 0;
	    for(int i = 0; i < arr.length; i++)
            x ^= arr[i];
        x &= (-x);
        int[] arr_res = new int[2];
        for(int j=0;j<arr.length;j++) {
        	if((arr[j]&x)==x) {
        		arr_res[0] ^= arr[j];
        	}else {
        		arr_res[1] ^=arr[j];
        	}
        }
        String s = new String();
        s.c
        System.out.println(arr_res[1]);
	}


}
