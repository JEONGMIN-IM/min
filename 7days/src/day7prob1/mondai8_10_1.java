package day7prob1;

//prob8-10.(難易度★★)（フィボナッチ数列）
//1,1から始まり、前の2つの値の和を次の値とする数列のことを、
//フィボナッチ数列という（以下の例を参照）。
//このとき、40までのフィボナッチ数列を求めてint型の配列に代入し、
//表示しなさい。

//例
//1  1  2  4  7  13  24  …
public class mondai8_10_1 {

	public static void main(String[] args) {

		int[] pivo = new int[20];
		pivo[0] = 1;
		pivo[1] = 1;
		pivo[2] = 2;

		// 트리보나치 수열값 초기화
		for(int i = 3; i < pivo.length; i++) {
			pivo[i] = pivo[i-1] + pivo[i-2] + pivo[i-3];
		}

		for(int i = 0; i <pivo.length; i++) {
			System.out.print(pivo[i] + " ");
		}
	}
}
