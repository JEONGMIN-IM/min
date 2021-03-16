package day5prob;

// prob5-2.(難易度：★)
// 実数の配列変数、dを、以下の条件で作り、
// その結果を、実行結果にならい、表示しなさい。

// 配列の大きさは、4
// 初期値は、0.2,-5.1,3.2,1.8

public class mondai5_2 {

	public static void main(String[] args) {

		double[] d = {0.2,-5.1,3.2,1.8};
		int i ;

		for(i = 0; i < d.length; i++) {

			System.out.print("d["+i+"] = " + d[i] + ", ");
		}

	}
}
