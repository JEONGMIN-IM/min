package day7prob1;

// prob8-1.(難易度★★)（ピタゴラス数）
// a,b,cを、いずれも1以上100以下の整数とするとき、
// a*a+b*b=c*cを満たす、全てのa,b,cの組み合わせ全てと、
// その数を求め、画面に表示しなさい。ただし、
// a,bの数値の組み合わせが同じものも別のものとしてもかまわない。
// 具体的には、a=3,b=4,c=5と、a=4,b=3,c=5は別の組み合わせとする。

public class mondai8_1 {

	public static void main(String[] args) {


		int count = 0;

		for(int a = 1; a < 100; a++) {
			for(int b =1; b < 100; b++) {
				for(int c =1; c < 100; c++) {
					if((a*a)+(b*b) == c*c) {
						count++;
						System.out.println("a = " + a + " , " +  "b = " + b + " , " + "c = " + c);
						//System.out.println((a*a)+(b*b) == c*c);
					}
				}
			}
		}
		System.out.println(count);
	}
}
