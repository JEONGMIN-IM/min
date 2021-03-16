package newday5prob;

import java.util.ArrayList;
import java.util.Random;

public class newmondai5_3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		while(true) {
			Random rnd = new Random();

			int a = rnd.nextInt(100);
			System.out.println("0から100の値を出力:" + a);
			if(a == 0) {
				break;
			}
			list.add(a);
		}

		System.out.println();
		System.out.print("一の位が0 : ");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 10 == 0) {
				System.out.print(list.get(i) + " ");
			}
		}
		System.out.println();
		System.out.print("一の位が1 : ");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 10 == 1) {
				System.out.print(list.get(i) + " ");
			} 
		}
		System.out.println();
		System.out.print("一の位が2 : ");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 10 == 2) {
				System.out.print(list.get(i) + " ");
			}
		}
		System.out.println();
		System.out.print("一の位が3 : ");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 10 == 3) {
				System.out.print(list.get(i) + " ");
			}
		}
		System.out.println();
		System.out.print("一の位が4 : ");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 10 == 4) {
				System.out.print(list.get(i) + " ");
			}
		}
		System.out.println();
		System.out.print("一の位が5 : ");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 10 == 5) {
				System.out.print(list.get(i) + " ");
			}
		}
		System.out.println();
		System.out.print("一の位が6 : ");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 10 == 6) {
				System.out.print(list.get(i) + " ");
			}
		}
		System.out.println();
		System.out.print("一の位が7 : ");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 10 == 7) {
				System.out.print(list.get(i) + " ");
			}
		}
		System.out.println();
		System.out.print("一の位が8 : ");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 10 == 8) {
				System.out.print(list.get(i) + " ");
			}
		}
		System.out.println();
		System.out.print("一の位が9 : ");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 10 == 9) {
				System.out.print(list.get(i) + " ");
			}
		}
	}
}
