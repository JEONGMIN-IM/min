package day4prob;

// prob4-18.(難易度：★★)
// forの二重ループを用いて、以下のような図形を表示させるプログラムを作りなさい。

// □■■■■■■■■■
// ■□■■■■■■■■
// ■■□■■■■■■■
// ■■■□■■■■■■
// ■■■■□■■■■■
// ■■■■■□■■■■
// ■■■■■■□■■■
// ■■■■■■■□■■
// ■■■■■■■■□■
// ■■■■■■■■■□


public class mondai4_18 {
	public static void main(String[] args) {
		int j;

		for(int i = 1; i <= 10; i++) {
			for(int k = 1; k < i; k++) {
				System.out.print("■");
			}
			System.out.print("□");
			for(j = 10; j > i; j--) {
				System.out.print("■");
			}

			System.out.println();
		}

	}
}
