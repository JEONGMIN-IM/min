package day7prob1;

// prob8-10.(難易度★★)（フィボナッチ数列）
// 1,1から始まり、前の2つの値の和を次の値とする数列のことを、
// フィボナッチ数列という（以下の例を参照）。
// このとき、40までのフィボナッチ数列を求めてint型の配列に代入し、表示しなさい。
public class mondai8_10 {

	public static void main(String[] args) {

		int[] pivo = new int[40];
		pivo[0] = 1;
		pivo[1] = 1;

		// 피보나치 수열값 초기화
		for(int i = 2; i < pivo.length; i++) {
			pivo[i] = pivo[i-1] + pivo[i-2];
		}

		for(int i = 0; i <pivo.length; i++) {
			System.out.print(pivo[i] + " ");
		}
	}


/*	public static void main(String[] args) {

		int a = 40;
		int a1 = 1;
		int a2 = 1;
		int a3;

		System.out.println(a);
		System.out.println("------------");
		System.out.print(a1 + " ");
		System.out.print(a2  + " ");

		for(int i = 1; i <= a; i++) {
			a3 = a1+a2;
			System.out.print (a3 + " ");
			a1 = a2;
			a2 = a3;
		}

	}
			*/
}
