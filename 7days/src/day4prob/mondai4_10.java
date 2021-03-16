package day4prob;

// prob4-10.(難易度：★)
// forループを用いて、１から100までの乱数を５回発生させ、表示させなさい。
public class mondai4_10 {
	public static void main(String[] args) {


		for(int i = 0; i < 5; i++) {
			int num = (int)(Math.random()*100)+1;
			System.out.println(num);
		}
	}
}
