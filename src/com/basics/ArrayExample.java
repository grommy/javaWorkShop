package com.basics;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = new int[4];  // if you know number of elements
		int[] ints = {1,2,3,4};
		System.out.println(ints[0]+5);

		String[] strs = {"one", "two"};

		strs[0] = "zero";

		String[][] doubleDimensionalArray = {
				{"one", "two"},
				{"three", "f", "five"}
		};

		System.out.println(doubleDimensionalArray[0][1]); // two

	}

}
