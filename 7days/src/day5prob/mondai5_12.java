package day5prob;

// prob5-12.(難易度：★)
// 3×3の二次元配列を作成し、それぞれに0から9の乱数を発生させ、
// 実行例にならいその内容を表示させなさい。
// ヒント：forの二重ループを使う

public class mondai5_12 {

	public static void main(String[] args) {

		int[][] a = new int[3][3];

		for(int i =0  ; i < a.length; i++) {
			for(int j =0; j < a.length; j++) {
			a[i][j] = (int)(Math.random()*9);
			System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
	}
}
