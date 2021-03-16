package day7prob1;

// prob8-8.(難易度★★)（約数）
// 乱数で１から1000の数値を発生させ、
// その数値の約数を小さい順に全て表示するプログラムを作りなさい。
public class mondai8_8 {

	public static void main(String[] args) {

		int num = (int)(Math.random()*1000)+1;
		int a;
		System.out.println(num);

		for(a = 1; a < num; a++) {
			if((num%a)==0) {
				System.out.print(" " + a);
			}
		}
	}
}
