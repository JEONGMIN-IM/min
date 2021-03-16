package day4prob;

// prob4-14.(難易度：★★)
// 1から10までの乱数を発生させ、偶数なら、★を、
// 奇数なら☆を、それぞれ発生した数の文だけ表示するプログラムを作りなさい。

public class mondai4_14 {

	public static void main(String[] args) {

		int num = (int)(Math.random()*10)+1;
		System.out.println("発生値 ："+ num);

		for(int i = 0; i < num; i++) {
			if(num % 2 == 1) {
				System.out.print("☆");
			} else {
				System.out.print("★");
			}
		}

	}

}
