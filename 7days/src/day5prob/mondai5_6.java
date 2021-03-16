package day5prob;

// prob5-6.(難易度：★★)
// 整数型の配列変数dataを作成し、以下の条件のとおりの初期値を入れるものとする。

// 大きさは、10
// 値は、１から10の乱数
public class mondai5_6 {

	public static void main(String[] args) {
		int[] a = new int[10];

		for(int i =0; i < 10; i++) {
			a[i] = (int)(Math.random()*10)+1;
			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.out.println("----------------------");

		int max = a[0];
		int min = a[0];
		int sum = 0;
		int avg = 0;
		for(int i =0; i <a.length; i++) {
			if(max <a[i]) {
				max = a[i];
			}

			if(min > a[i]) {
				min = a[i];
			}
			sum += a[i];


			avg = sum / a.length;
		}
		System.out.println("最大値 ： " + max);
		System.out.println("最小値 ： " + min);
		System.out.println("平均値 ： " + avg );
	}

}
