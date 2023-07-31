package com.tts;

public class MagicCalculator extends Calculator{
	
	public MagicCalculator() {
		
	}
	
	public int squareRoot(int a) {
		return (int) Math.sqrt(a);
	}
	
	public int sine(int a) {
		double b = Math.toRadians(a);
		return (int) Math.sin(b);
	}
	
	public int cosine(int a) {
		double b = Math.toRadians(a);
		return (int) Math.cos(b);
	}
	
	public int tangent(int a) {
		double b = Math.toRadians(a);
		return (int) Math.tan(b);
	}
	
	public int factorial(int a) {
		if (a < 0) {
			return -1;
		}
		int ans = 1;
		for (int i = 1; i <= a; i++) {
			ans *= i;
		}
		return ans;
	}
	
}
