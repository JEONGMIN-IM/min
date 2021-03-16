package day7prob1;

// prob8-5.(難易度★★)（いまさら世界のナベアツ計算）
// 1から100までの数値のうち、3で割り切れるか、
// 数値の中に3が含まれる数値を全て表示しなさい。

public class mondai8_5 {

	public static void main(String[] args) {


		int x1, x2, x3;

	    for (int i = 1; i <= 100; i++) {
	      x1 = i / 10; // 10の位が3になる数値を判定
	      x2 = i / 100; // 100の位が3になる数値を判定
	      x3 = i / 1000; // 1000の位が3になる数値を判定

	      if (i % 3 == 0 || i % 10 == 3 || x1 % 10 == 3 || x2 % 10 == 3 || x3 % 10 == 3) {

	        System.out.print(" " + i);
	      }
	      
	    }
	    System.out.println();
	  }
}
