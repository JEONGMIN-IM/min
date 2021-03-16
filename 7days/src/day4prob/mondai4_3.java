package day4prob;

public class mondai4_3 {

	public static void main(String[] args) {

		int num = (int)(Math.random()*10)+1;
		System.out.println("数 ： "+ num);
		System.out.println();

		int i =0;
		do {
			i++;
			System.out.print("■");
		} while(i<num);
	}
}
