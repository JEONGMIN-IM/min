package day4prob;

// prob4-9.(難易度：★★)
// whileの無限ループを作り、その中で、
// １から１００までの乱数を発生させ、表示しなさい。
// その際、値が１０の倍数であれば、ループを抜け、”終了します”と表示して、
// プログラムを終了しなさい。

public class mondai4_9 {

	public static void main(String[] args) {

		while(true) {
			int num = (int)(Math.random()*100)+1;

			System.out.println(num);
			if(num%10==0) {
				break;
			}
		}
		System.out.println("終了します");
	}
}
