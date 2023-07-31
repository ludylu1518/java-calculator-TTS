package com.tts;

public class MainClass {

	public static void main(String[] args) {
		
		MagicCalculator c = new MagicCalculator();
		
		System.out.println(c.add(1, 2));   // 3
		System.out.println(c.subtract(2, 1));   // 1
		System.out.println(c.multiply(5, 3)); // 15
		System.out.println(c.divide(8, 2));   // 4
		System.out.println(c.square(9));       // 81
		
		System.out.println(c.squareRoot(36));  // 6
		System.out.println(c.sine(90));    // 1
		System.out.println(c.cosine(0));   // 1
		System.out.println(c.tangent(46));  // 1      java rounds down no matter what ...
		System.out.println(c.factorial(8)); //40320
		
 		 
	}
	
}
