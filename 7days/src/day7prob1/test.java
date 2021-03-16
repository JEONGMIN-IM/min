package day7prob1;

public class test {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];
		int cnt = 0;

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

		System.out.print("共通の数： ");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					a[i] = b[j];
					cnt++;
					System.out.print(" " + cnt);
				}
			}
		}
		System.out.println();
		System.out.print("どちらか入っている数： ");

		int[] c = new int[cnt];
		int p = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					c[p] = a[i];
					p++;
					
				}
			}
		}
		System.out.print(c[p]);
	}
}
