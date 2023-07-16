package test;


import java.lang.reflect.Array;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class test_03{
	public static boolean check_whether_prime(double a){
        boolean flag = true;
        if((int)a == 1){
            return false;
        }
        for(double j = 2; j<a-1; j++){
            if((int)(a/j)==a/j){
                flag = false;
                break;
            } 
        }
        return flag;
}
    public static void main(String[] args) {
    	System.out.println(test_03.check_whether_prime(5.000));
//		int arr[] = new int[3];
//		double m = 3;
//		double n = 3.5;
//        LinkedList<Integer> List = new LinkedList<Integer>();
//List.add(3);
//List.add(8);
//List.add(5);
//List.add(6);
//Collections.sort(List);
//System.out.println(List.get(0));
    }
}
