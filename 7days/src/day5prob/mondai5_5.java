package day5prob;


// prob5-5.(難易度：★★)
// 整数型の配列変数dataを作成し、以下の条件のとおりの初期値を入れるものとする。
// 大きさは、10  , 値は、１から10の乱数
// このとき、実行例のように、値をすべて表示し、
// その中の3の倍数と、3の倍数以外の数を表示するようにしなさい。
public class mondai5_5 {

	public static void main(String[] args) {

		int[] a = new int[10];

		int i ;

		for(i = 0; i <a.length; i++) {
			a[i] = (int)(Math.random()*10)+1;
			System.out.print(" " + a[i]);

		}

		System.out.println();
		System.out.println("---------------------------");

		System.out.print("3の倍数 ： ");
		for(i = 0; i < a.length; i++) {
			if(a[i] % 3 ==0) {
				System.out.print(a[i]+ " ");
			}
		}
		System.out.println();
		System.out.print("3の倍数以外の数 ： ");
		for(i = 0; i < a.length; i++) {
			if(a[i] % 3 !=0) {
				System.out.print(a[i]+ " ");
			}
		}
	}
}
