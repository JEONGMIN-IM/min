package day5prob;

// prob5-7.(難易度：★★★)
// 実行例に習い、以下のプログラムを作りなさい。
//（１）長さ5のint型の配列を作成する。
//（２）（１）の各要素に、1から10までの乱数を代入する。
//（３）配列の内容をすべて表示する。
//（４）配列の値の合計値と、平均値を表示する。
//（５）平均値よりも大きい数を表示する
//（６）平均値よりも小さい数を表示する。

public class mondai5_7 {

	public static void main(String[] args) {
		int[] a = new int[5];

		int sum = 0;
		int avg = 0;
		for(int i =0; i < a.length; i++) {
			a[i] = (int)(Math.random()*10)+1;
			System.out.print(" " + a[i]);

			sum += a[i];

			avg = sum/a.length;
		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("合計値： " + sum);
		System.out.println("平均値： " + avg);

		int big = a[0];
		int small = a[0];
		System.out.println("---------------------------");
		System.out.print("平均値より大きい数：" );
		for(int i =0; i <a.length; i++) {
			if(a[i] > avg) {
				big = a[i];
				System.out.print(big + " ");
			}
		}
		System.out.println();
		System.out.print("平均値より小さい数：");
		for(int i =0; i <a.length; i++) {
			if(a[i] < avg) {
				small = a[i];
				System.out.print(small + " ");
			}
		}


	}

}
