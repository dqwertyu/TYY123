package com.Collection集合遍历;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_tool {
	public static void main(String[] args) {
		int[] arr= {7,4,6,1,5};
		System.out.print("排序前:");
		printArray(arr);
		Arrays.sort(arr);
		System.out.print("排序后:");
		
		printArray(arr);
		int[]arr1= {7,4,6,1,5};
		Arrays.sort(arr);
		int index=Arrays.binarySearch(arr,4);
		System.out.println("元素的4索引是:"+index);
		
		int[]arr2={7,4,6,1,5};
		int[]copied=Arrays.copyOfRange(arr, 1, 7);
		for(int i=0;i<copied.length;i++) {
			System.out.print(copied[i]+" ");
		}
		
		
		int[]arr3= {1,2,3,4};
		Arrays.fill(arr, 8);
		for(int i=0; i<arr.length;i++) {
			System.out.println(i+":"+arr[i]);
		}
		
		
}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++) {
			if(x !=arr.length-1) {
				System.out.print(arr[x]+",");
			}else {
				System.out.println(arr[x]+"]");
			}
		}
	}
	
	
	
}

