package day6prob;

// prob6-1.(難易度★)
// 以下のプログラムを改造し、
// クラスMinMaxのメンバ関数max(),min()の引数の数を3つにし、
// 期待される実行結果にならい、
// 3つの数の最大値・最小値を出せるようにプログラムを改造しなさい。
public class mondai6_1 {

	public static void main(String[] args){
		Minmax m = new Minmax();
		int a = 4, b = 2;
		 System.out.println(a + "と" + b + "のうち、最大のものは" + m.max(a,b));
	     System.out.println(a + "と" + b + "のうち、最小のものは" + m.min(a,b));
	}
}
