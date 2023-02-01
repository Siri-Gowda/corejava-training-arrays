package com.java.arrays;

import java.util.*;

public class ArrayDemo {
	public static void main(String args[]) {
		//Syntax- data_type[] Variable_name={Values with comma separated};
	int[] age = {12,4,5,2,5};
	System.out.println("Accessing elements of array");
	System.out.println("First element:"+age[0]);
	System.out.println("Second element:"+age[1]);
	System.out.println("Third element:"+age[2]);
	System.out.println("Fourth element:"+age[3]);
	System.out.println("Fifth element:"+age[4]);
	//using for loop
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		//for loop
		for(int a:age) {
			System.out.println(a);
		}
	
	Set<Integer> intNum = new TreeSet<>();
	intNum.add(100);
	intNum.add(90);
	intNum.add(80);
	intNum.add(70);
	intNum.add(60);
	System.out.println(intNum);

}
}
