package day4prob;

// prob4-16.(難易度：★)
// forの二重ループを用いて、以下のように九九の表を作りなさい。

public class mondai4_16 {

	public static void main(String[] args) {


		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <=9; j++) {
				System.out.print(i + " * " + j + " = " + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
