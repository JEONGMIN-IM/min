package day6prob;

// prob6-2.(難易度★)
// 以下のプログラムは、二つの実数の値の計算をするくらす、
// Calcを使ったプログラムである。このクラスに、
// 指定したメソッド追加し、
// 期待される実行結果が得られるようにプログラムを変更しなさい
public class mondai6_2 {

	public static void main(String[] args) {
		Calc c = new Calc();
		double a = 4.0, b = 2.0;
		System.out.println(a + " + " + b + " = " + c.add(a, b));
        System.out.println(a + " - " + b + " = " + c.sub(a, b));
        System.out.println(a + " * " + b + " = " + c.mul(a, b));
        System.out.println(a + " / " + b + " = " + c.div(a, b));
	}
}
