package newday5prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class newmondai5_1_1 {

	public static void main(String[] args) {
        List<Integer> evens = new ArrayList<Integer>();
        List<Integer> odds = new ArrayList<Integer>();
        List[] lists = {evens, odds};
        while (true) {
            Random rnd = new Random();
            int v = rnd.nextInt(10);
            System.out.println("0から10の値を出力:" + v);
            if (v == 0) {
                break;
            }
            lists[v % 2].add(v);
        }
        System.out.print("奇数 :");
        System.out.println(Arrays.toString(odds.toArray()));
        System.out.print("偶数 :");
        System.out.println(Arrays.toString(evens.toArray()));
    }
}