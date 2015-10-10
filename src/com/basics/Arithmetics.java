package com.basics;

import java.math.BigDecimal;
import java.math.MathContext;

public class Arithmetics {

	public static void main(String[] args) {
		
		int sum = (4 + 3) + 5;
		
		int sumOne = 8 + sum;
		
		float sumTwo = (float) (2.5 + sumOne); // good practice
		
		float sumTest = 2.5f + (float)sumOne; // typization
		
		double mul = 5 * 2;
		
		double div = 5d / 0;		// Infinity
		
		double div2 = 5 / 2.0;  // 2.5
		
		int divMod = 5 % 2; 	// 1
		
		System.out.println(4 > 5);
		boolean status = 6 >= 7;
		
		
		
		BigDecimal money = new BigDecimal(100.25, MathContext.DECIMAL32);
		System.out.println(money);
		System.out.println(money.add(new BigDecimal(0.75)));
		

	}

}
