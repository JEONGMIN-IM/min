package newday1prob;

public class problemprob1_3 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10)+1;
		int b = (int)(Math.random()*10)+1;

		int result = square(a,b);

		System.out.println("たて： " + a);
		System.out.println("よこ： "+ b);
		System.out.println();
		
		for(int i = 0;  i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(" ■ ");
			}

			System.out.println();
		}

	}
	static int square(int a , int b) {
		return a * b;
	}

}
