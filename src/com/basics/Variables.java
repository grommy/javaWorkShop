package com.basics;

import com.oop.House;

public class Variables {

	public static void main(String[] args) {
		
		int year = 2015;
		System.out.println(year);
		
		double width = 2.5;
		System.out.println(width);
		
		boolean status = true;
		System.out.println(status);
		
		float intF = 5;
		System.out.println(intF); // 5.0
		
		char a = 'a';
		System.out.println(a);

		House house1 = new House();
		System.out.println(house1.getBedRooms());  // access modifier test
	}

}
