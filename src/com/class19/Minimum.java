package com.class19;

public class Minimum {
	
	static int minOfValues(int[] x) {
		int min=0;
		for(int y:x) {
			if(y<min) {
				min=y;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
