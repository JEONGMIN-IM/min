package day5prob;

// prob5-10.(難易度：★★)
// 長さ7の整数型配列を生成しかなに1から10までの乱数を代入しなさい。
// その際、実行例にならって、その数の分だけ、*マークを表示するようにしなさい。
public class mondai5_10 {

	public static void main(String[] args) {

		int[] a = new int[7];

		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*10)+1;

			System.out.print(" " + a[i]);
		}
		System.out.println();

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j <a[i]; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
