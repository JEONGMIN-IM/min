package day5prob;

// prob5-1.(難易度：★)
// 整数型の配列変数、aを、以下の条件で作り、その結果を、
// 実行結果にならい、表示しなさい。
// 配列の大きさは、7
// 値は、1から10までの乱数を発生させて値を代入する。

public class mondai5_1 {

	public static void main(String[] args) {

		int[] a = new int[7];

		int i;

		for(i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*7)+1;

			System.out.print("a["+i+"] = " + a[i] + ", ");
		}



	}
}
