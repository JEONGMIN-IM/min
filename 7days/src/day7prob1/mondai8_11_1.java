package day7prob1;

import java.util.Arrays;

public class mondai8_11_1 {

	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[10];
		int x[] = new int[10];
		int y[] = new int[10];

		System.out.print("配列1:");
		for (int i = 0; i < 10; i++) {
			a[i] = (int) (Math.random() * 10) + 1;
			System.out.print(a[i] + " ");
		}

		System.out.println(" ");
		System.out.print("配列2:");

		for (int i = 0; i < 10; i++) {
			b[i] = (int) (Math.random() * 10) + 1;
			System.out.print(b[i] + " ");
		}
		
		Arrays.sort(a);
		System.out.println("");
		System.out.print("共通の数: " );
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					x[i]= a[i];
					System.out.print(x[i] + " ");
				}
			}
		}

		System.out.println("");
		System.out.print("どちらかの数: ");
		for (int i = 0; i < 10; i++) {
			if (a[i] >= b[i]) {
				y[i] = a[i];
				System.out.print(y[i] + " ");

			}

		}

	}

}