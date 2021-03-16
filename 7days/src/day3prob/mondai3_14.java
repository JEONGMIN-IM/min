package day3prob;

public class mondai3_14 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println("a = "+num);

		int a = num;


		int num1 = (int)(Math.random()*10)+1;
		System.out.println("b = "+num1);

		int b = num1;

		if(a>b) {
			System.out.println("aのほうが大きいです");
		} else {
			System.out.println("bのほうが大きいです");
		}

	}
}
