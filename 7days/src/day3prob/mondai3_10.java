package day3prob;

public class mondai3_10 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);

		if(num <=10 || num >=90) {
			System.out.println("10以下か90以上の値です");
		}

	}

}
