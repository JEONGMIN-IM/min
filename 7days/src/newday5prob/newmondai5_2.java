package newday5prob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class newmondai5_2 {

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

		 Collections.reverse(list);

		 for(int i = 0; i < list.size(); i++) {
			 System.out.print(list.get(i) + " ");
		 }
	}
}
