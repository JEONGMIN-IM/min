package day7prob1;

// prob8-4.(難易度★★)（桁数を求める計算）
// 1から1000までの任意の数を乱数で発生させ、
// その数が何桁かを表示するプログラムを作りなさい。
public class mondai8_4 {

	public static void main(String[] args) {
		int i  = (int)(Math.random()*1000)+1;

		System.out.println(i);

		int a = i / 100;
		int b = i % 100/10;
		int c = i % 100 % 10;

		System.out.println("100の桁数: " + a + " , "+ "10の桁数: " + b + " , "+ "1の桁数: " + c);
	}
}
