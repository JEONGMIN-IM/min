package day5prob;

// prob5-9.(難易度：★★)
// 実行例に習い、以下のプログラムを作りなさい。
//（１）長さ10のint型の配列を作成する。
//（２）（１）の各要素に、0から100までの乱数を代入する。
//（３）配列の内容をすべて表示する。
//（４）50以上の数を、すべて表示する。
//（５）50未満の数を、すべて表示する。

public class mondai5_9 {

	public static void main(String[] args) {

		int[] a = new int[10];

		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100)+1;
			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.out.println("---------------------------");
		int big = a[0];
		int small = a[0];

		System.out.print("50以上の数： ");
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 50) {
				big = a[i];
				System.out.print(+ big+ " ");
			}
		}
		System.out.println();
		System.out.print("50未満の数： ");
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 50) {
				small = a[i];
				System.out.print(small+" ");
			}
		}
	}
}
