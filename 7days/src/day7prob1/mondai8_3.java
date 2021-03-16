package day7prob1;

// prob8-3.(難易度★★)（階乗を求める計算）
// 任意の数値の階乗を求めるプログラムを作りなさい。
// 階乗とは、その数から一つずつ減らした全ての数を書けた数値のことであり、
// 例えば、６の階乗は、６×５×４×３×２×１＝７２０となる。.

public class mondai8_3 {

	public static void main(String[] args) {
	int n = 6;
        System.out.println(factorial(n));

    }

    public static int factorial(int n) {
        if (n <= 1)
            return n;
        else
            return factorial(n-1) * n;
    }

}
