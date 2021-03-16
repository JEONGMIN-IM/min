package newday1prob;

public class Problemprob1_2 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10)+1;
		int b = (int)(Math.random()*10)+1;
		int c = (int)(Math.random()*10)+1;
		int result = mul(a,b,c);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println(a + " * " + b + " * " + c + " = " + result);
	}

	static int mul(int a , int b, int c) {
		return a * b * c;
	}
}
