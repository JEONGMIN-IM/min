package newday5prob;

import java.util.ArrayList;
import java.util.Random;

public class newmondai5_1 {

	public static void main(String[] args) {

		 ArrayList<Integer> list = new ArrayList<Integer>();

		 while(true) {
			 Random rnd = new Random();
			 int a = rnd.nextInt(10);
			 System.out.println("0から10の値を出力:" + a);
			 if(a == 0) {
				 break;
			 }
			 list.add(a);
		 }
		 System.out.println();
		 System.out.print("偶数 : ");
		 for(int i = 0; i < list.size(); i++) {
			 if(list.get(i) % 2 == 0) {
				 System.out.print(list.get(i) + " ");
			 }
		 }

		 System.out.println();
		 System.out.print("奇数 : ");
		 for(int i = 0; i < list.size(); i++) {
			 if(list.get(i) % 2 == 1) {
				 System.out.print(list.get(i) + " ");
			 }
		 }
	}

}
