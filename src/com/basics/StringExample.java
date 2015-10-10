package com.basics;

public class StringExample {

	public static void main(String[] args) {
		
		String str1 = "Hello world";		
		String str2 = "Hello world";
		
		System.out.println("String example: "+str1);
		
		System.out.println(str1.length());
		System.out.println(str1.contains("lo"));
		System.out.println(str1.indexOf("sdfsd")); // -1
		
		System.out.println(str1.substring(6)); // world
		
		System.out.println("Hello world" == str1);  // == for primitive type. equals for object
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.trim());
		System.out.println(str1.isEmpty());
	}

}
