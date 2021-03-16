package day4prob;

// prob4-15.(難易度：★★)
// ループを用いて、１から100までの数字を表示しなさい。ただし、
// このとき、数は10ごとに改行すること。

// ヒント
// 改行は、System.out.println()を用いる。
// 10で割り切れる数だったときに改行を行うとよい。

public class mondai4_15 {


	public static void main(String[] args) {

		int j= 0;

		for(int i = 1; i <= 100 ; i++) {
			System.out.print(i + " ");

			j++;
			if(j%10==0) {
				System.out.println();
			}

		}
	}
}
