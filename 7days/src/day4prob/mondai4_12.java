package day4prob;

// prob4-12.(難易度：★★)
// forループを用いて、１から１００までの乱数を５回発生させ、
// 表示し、終了後その中の最小値を表示しなさい。
public class mondai4_12 {

	public static void main(String[] args) {

		int[] num = new int[5];

		for(int i = 0; i < 5; i++) {
			num[i] = (int)(Math.random()*100)+1;
			System.out.println(num[i]);
		}
		int min = num[0];

		for(int i = 0; i < num.length; i++) {
			if(num[i] > min) {

			}
		}
		System.out.println("最小値 : " + min);
	}
}
