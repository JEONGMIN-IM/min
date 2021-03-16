package day4prob;

// prob4-17.(難易度：★★)
// forの二重ループを用いて、以下のような図形を表示させるプログラムを作りなさい。
// ヒント：ループに用いる変数iとjの大きさの関係に注目する。

// ■□□□□□□□□□
// ■■□□□□□□□□
// ■■■□□□□□□□
// ■■■■□□□□□□
// ■■■■■□□□□□
// ■■■■■■□□□□
// ■■■■■■■□□□
// ■■■■■■■■□□
// ■■■■■■■■■□
// ■■■■■■■■■■

public class mondai4_17 {

	public static void main(String[] args) {


		for(int i = 1; i <= 10; i ++ ) {
			for(int j = 0; j <i; j++) {
			System.out.print("■");
			}
			for(int k = 10; k > i ;k--) {
				System.out.print("□");
			}

			System.out.println();

		}


	}
}
