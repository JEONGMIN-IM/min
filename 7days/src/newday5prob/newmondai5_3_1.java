package newday5prob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class newmondai5_3_1 {

	public static void main(String[] args) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        Random rnd = new Random();
        int v ;

        while (true) {
            v = rnd.nextInt(100);
            System.out.println("0～100の値を出力:" + v);
            if (v == 0)
                break;

            map.computeIfAbsent(v % 10, k -> new ArrayList<Integer>()).add(v);
        }

        //出力
        String s;
        for (int i = 0; i < 10; i++) {
            s = "なし";
            if (map.containsKey(i)) {
                //s = map.get(i).toString().replace("[", "").replace("]", "").replace(",", "");
                s = map.get(i).toString().replaceAll("[\\[\\]]", "");
            }
            System.out.println("一の位が" + i + ":" + s);
        }
    }
}