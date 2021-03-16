package day7prob1;

// prob8-9.(難易度★★)（数値の分類）
// 長さ10の整数型の配列変数に、１から100の整数をランダムに代入し、
// その値を偶数と奇数に分類して、それぞれの値を入れる配列に再代入し、
// その値を以下の例のように表示しなさい。

// 例
// 1  10  22  51  3  17  21  98  100  2
// 偶数：10  22  98  100  2
// 奇数：1  51  3  17  21
public class mondai8_9 {

	public static void main(String[] args) {
		int[] a = new int[10];

		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100)+1;
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------------");

		System.out.print("偶数 :  ");
		for(int i= 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}

		System.out.println();
		System.out.print("奇数 :  ");
		for(int i =0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
