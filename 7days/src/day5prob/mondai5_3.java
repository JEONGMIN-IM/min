package day5prob;

// prob5-3.(難易度：★★)
// 整数型の配列変数dataを作成し、以下の条件のとおりの初期値を入れるものとする。
// 大きさは、10
// 値は、１から100の乱数
// このとき、実行例のように、値をすべて表示し、
// その中の偶数の数と、奇数の数を表示するようにしなさい。
public class mondai5_3 {

	public static void main(String[] args) {

		int[] a = new int[10];

		int i;

		for(i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100)+1;
			System.out.print(" " +  a[i]);

		}

		System.out.println();
		System.out.println("---------------------------------");
		System.out.print("偶数 :  ");
		for(i= 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}

		System.out.println();
		System.out.print("奇数 :  ");
		for(i =0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
