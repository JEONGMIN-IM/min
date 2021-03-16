package day4prob;

// prob4-11.(難易度：★★)
// forループを用いて、１から100までの乱数を５回発生させ、
// 表示し、終了後その中の最大値を表示しなさい。
public class mondia4_11 {

	public static void main(String[] args) {
		int[] num = new int[5];

		for(int i = 0; i < 5; i++) {
			num[i] = (int)(Math.random()*100)+1;
			System.out.println(num[i]);
		}

		int max = num[0];

		for(int i =1; i <num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("最大値 ："+ max);

	}
}
