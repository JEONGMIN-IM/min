package day4prob;

public class mondai4_2 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println("数 ： "+ num);
		System.out.println();

		int i =0;

		while(i < num) {
			i++;
			System.out.print("■");

		}

	}

}
