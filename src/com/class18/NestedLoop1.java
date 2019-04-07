package com.class18;

public class NestedLoop1 {



		public static void main (String[] args) {
			
			NestedLoop1 demo=new NestedLoop1();
			
			demo.ForLoop();
		}
			void ForLoop() {
			
			for (int i=0; i<5; i++) {
				
					for (int y=0; y<3; y++) {
						
						System.out.println("I am inner loop"+y);
					}
				
			System.out.println("-------I am outer loop------"+i);
				
			}
		}
	}
