package newday5prob;

import java.util.Random;

public class newmondai5_3_2 {

	public static void main(String[] args) {
        //List<Integer> list = new ArrayList<Integer>();

        //配列初期化
        String[] list2 = new String[10];
        for(int i=0;i<10;i++) {
            list2[i]="";
        }

        while (true) {
            Random rnd = new Random();
            int v = rnd.nextInt(100);
            System.out.println("0～100の値を出力:" + v);
            if (v == 0) {
                break;
            }
            //list.add(v);

            //各１の位毎に加算
            list2[v%10]+=String.valueOf(v)+" ";
        }

        //出力
        for(int i = 0;i<list2.length;i++) {
            if(list2[i]=="") {
                System.out.println("一の位が" + i + ":なし");
            }else {
                System.out.println("一の位が" + i + ":"+list2[i]);
            }
        }
    }
}