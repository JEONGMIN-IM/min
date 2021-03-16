package newday5prob;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class newmondai5_3_3 {

	public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();
        while (true) {
            int v = rnd.nextInt(100);
            System.out.println("0～100の値を出力:" + v);
            if (v == 0) {
                break;
            }
            list.add(v);
        }
        for (int i = 0; i < 10; i++) {
            String result = "";
            for (int v : list) {
                if (v % 10 == i) {
                    result += " " + v;
                }
            }
            if (result.equals("")) {
                result = " なし";
            }
            System.out.println("一の位が" + i + ":" + result);
        }
    }
}