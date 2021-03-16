package day7prob1;

// prob8-1.のデータから、重複を取り除いた組み合わせと、
// その数を表示するプログラムを作りなさい。
// 具体的には、a=3,b=4,c=5と、a=4,b=3,c=5は同じものとみなす。
public class mondai8_2 {

	public static void main(String[] args) {

		int count = 0;

		for(int a = 1; a < 100; a++) {
			for(int b =1; b < 100; b++) {
				for(int c =1; c < 100; c++) {
					if(a<b && (a*a)+(b*b) == c*c) {
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

