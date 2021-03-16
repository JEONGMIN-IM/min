package day5prob;

public class mondai5_11 {

	public static void main(String[] args) {

		int[] a = new int[5];

		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100)+1;
			System.out.print(" " + a[i]);
		}
		System.out.println();
		System.out.println("-----------------------------");
		System.out.print("80以上： ");

		for(int i = 0; i < a.length; i++) {
			if(a[i] > 80) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		System.out.print("60以上80未満： ");
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 60 && a[i] < 80) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		System.out.print("0以上60未満： ");
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 0 && a[i] < 60) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
