package day4prob;

// prob4-8.(難易度：★★)
// whileの無限ループを作り、その中で、
// １から１０までの乱数を発生させて、表示しなさい。
// その際、値が１０になったら、ループを抜け、”終了します”
// と表示してプログラムを終えるようにしなさい。

public class mondai4_8 {

	public static void main(String[] args) {

		while(true) {
			int num = (int)(Math.random()*10)+1;
			System.out.println(num);
			if(num == 10) {
				break;
			}

		}
		System.out.println("終了します");
	}
}
