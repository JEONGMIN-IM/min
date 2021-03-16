package day5prob;

// prob5-13.(難易度：★★)
// ３×３の二次元配列を作成し、
// それぞれに0から9の乱数を発生させ、
// 実行例のように、その内容と、数値の最大値・最小値を表示させなさい。
public class mondai5_13 {

	public static void main(String[]args) {

		int[][] a = new int[3][3];

		for(int i =0; i < a.length; i++) {
			for(int j = 0;  j < a.length; j++) {
				a[i][j] = (int)(Math.random()*9);
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}

		int big = a[0][0];
		int small = a[0][0];

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(big < a[i][j]) {
					big = a[i][j];
				}
				if(small > a[i][j]) {
					small = a[i][j];
				}
			}
		}
		System.out.println("最大値： " + big);
		System.out.println("最小値： " + small);
	}
}
