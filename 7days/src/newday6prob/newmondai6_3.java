package newday6prob;

import java.util.ArrayList;
import java.util.HashSet;

public class newmondai6_3 {

	public static void main(String[] args) {
        HashSet<Integer> rndSet = new HashSet<Integer>();
         ArrayList<Integer> rndList = new ArrayList<Integer>();
        int maxCount = 10;//回数
        for(int i=0;i<maxCount;i++) {
            int rndNum = (int) (Math.random() * 10) + 1;
            // データを追加
            rndList.add(rndNum);//履歴
            rndSet.add(rndNum);//種類
        }
        // すべて表示
        System.out.print("乱数:");
        for (Integer i : rndList) {
            System.out.printf("%s ", i);
        }
        System.out.println();

        System.out.print("種類:");
        for (Integer i : rndSet) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }
}