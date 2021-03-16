package day4prob;

public class mondai4_1 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println("数 ： " + num);
		System.out.println();
		for(int i = 1; i <=num; i++) {
			System.out.print("■");

		}
		System.out.println();
	}

}
