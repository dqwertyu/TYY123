package com.api;

public class P167 {
	public static void main(String[] args) {
			int[] srcArray= {101,102,103,104,105,106};
			int[] destArray= {201,202,203,204,205,206};
			System.arraycopy(srcArray,2,destArray,0,4);
			for(int i=0;i<destArray.length;i++) {
				System.out.println(i+":"+destArray[i]);
			}
		}
	
	
}
