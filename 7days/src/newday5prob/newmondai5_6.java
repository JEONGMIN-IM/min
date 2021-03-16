package newday5prob;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class newmondai5_6 {

	public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        while (true) {
            Random rnd = new Random();
            int v = rnd.nextInt(10);
            System.out.println("0から10の値を出力:" + v);
            if (v == 0) {
                break;
            }
            list.add(v);
            list.remove(Integer.valueOf(2));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" ");
            System.out.print(list.get(i));
        }
    }
}