package day3prob;

public class mondai3_17 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);


		if(num <= 50 && num % 2==0) {
			System.out.println("50以下の偶数です");
		} else if(num <= 50) {
			System.out.println("50以下です。");
		} else if (num >= 50 && num% 2== 0) {
			System.out.println("偶数です。");
		}
	}
}
