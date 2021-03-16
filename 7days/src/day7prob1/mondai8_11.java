package day7prob1;

public class mondai8_11 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];


		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*10)+1;
			System.out.print(a[i] + " ");
		}

		System.out.println();
		for(int i = 0; i < b.length; i++) {
			b[i] = (int)(Math.random()*10)+1;
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("----------------------");

		int[] temp = new int[10];
		int count = 0;
		int check = 0;
		System.out.print("共通の数： ");
		for(int i = 0 ; i < b.length; i++) {
			temp[count] = b.length;

			for(int j = 0; j < a.length;j++) {
				if(i != j && temp[count] == a[j])
					check = 1;
			}
		}
		if(check == 1) {
			count += 1;
		}

		for(int i = 0; i < count; i++) {
			System.out.println(temp[i] + " ");
		}
		System.out.println();
	}
}
