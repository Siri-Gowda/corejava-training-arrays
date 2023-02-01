package com.java.arrays;

public class ForLoopArray {
	public static void main(String args[]) {
		new ForLoopArray().getLaptopNames();
	
	}
	//creating instance method
	public void getLaptopNames() {
		String laptopName[] = new String[3];
		laptopName[0]="Lenovo";
		laptopName[1]="HP";
		laptopName[2]="Dell";
		for(int i=0;i<laptopName.length;i++) {
			System.out.println("laptopNames:"+laptopName [i]);
		}
		
		
	}
	
	
	
	
	

}
