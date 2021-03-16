package day5prob;

// prob5-8.(難易度：★★)
// 実行例に習い、以下のプログラムを作りなさい。
//（１）長さ5のint型の配列を作成する。
//（２）（１）の各要素に、-10から10までの乱数を代入する。
//（３）配列の内容をすべて表示する。
//（４）0よりも大きい数が何個あるか表示する。
//（５）0よりも小さい数が何個あるか表示する。
//（６）0が何個あるか表示する。

public class mondai5_8 {

	public static void main(String[] args) {

		int[] a = new int[5];

		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*20)-10;

			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.out.println("-------------------");

		int cnt = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int big = a[0];
		int small = a[0];
		int zero = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 0) {
				big = a[i];
				cnt++;
			}
			if(a[i] < 0) {
				small = a[i];
				cnt1++;
			}
			if(a[i] == 0) {
				zero = a[i];
				cnt2++;
			}
		}
		System.out.println("0より大きい数： " + cnt + "個");
		System.out.println("0より小さい数： " + cnt1 + "個");
		System.out.println("0の個数： " + cnt2 + "個");
	}

}
