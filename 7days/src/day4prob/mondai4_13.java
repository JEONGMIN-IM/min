package day4prob;

// prob4-13.(難易度：★★)
// １から10までの乱数を発生させ、
// もしも5以上だったら、その数だけ★マークを表示し、
// 5未満だったら、その数を表示するプログラムを作りなさい。

public class mondai4_13 {

	public static void main(String[] args) {

		int num = (int)(Math.random()*10)+1;
		System.out.println("発生値 ：" + num);

		if(num < 5) {
			System.out.println("発生した数値 ：" + num);
		}else {
			for(int i = 0 ; i < num; i++) {
			System.out.print("★");
			}
		}
	}
}
