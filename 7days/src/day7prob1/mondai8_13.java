package day7prob1;

import java.util.Arrays;

public class mondai8_13 {

	public static void main(String[] args) {

		int[] a = new int[10];

		System.out.println("Random Number");
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100)+1;


			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.out.println("-------------------------------");

		Arrays.sort(a);
		for(int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
    }
}
