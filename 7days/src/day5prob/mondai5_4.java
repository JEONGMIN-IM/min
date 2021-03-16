package day5prob;

// prob5-4.(難易度：★★)
// 整数型の配列変数dataを作成し、以下の条件のとおりの初期値を入れるものとする。
// 大きさは、100
// 値は、１から10の乱数
// このとき、実行例のように、値をすべて表示し、
// その中の50以上の数と、50未満の数を表示するようにしなさい。

public class mondai5_4 {

	public static void main(String[] args) {
		int[] a = new int[10];

		int i;

		for(i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100)+1;
			System.out.print( " " + a[i]);
		}
		System.out.println();
		System.out.println("------------------------------");

		System.out.print("50以上の数 ： ");
		for(i = 0; i < a.length; i++) {
			if(a[i] > 50) {
				System.out.print( a[i] + " " );
			}
		}
		System.out.println();
		System.out.print("50未満の数 ： ");
		for(i = 0; i < a.length; i++) {
			if(a[i] < 50) {
				System.out.print( a[i] + " " );
			}
		}
	}

}
