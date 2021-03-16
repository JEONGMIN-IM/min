package newday6prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class newmondai6_2_1 {

	public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<String, String>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String buf;
        //辞書追加
        map.put("0", "〇");
        map.put("1", "一");
        map.put("2", "二");
        map.put("3", "三");
        map.put("4", "四");
        map.put("5", "五");
        map.put("6", "六");
        map.put("7", "七");
        map.put("8", "八");
        map.put("9", "九");

        while (true) {
            System.out.print("整数の値を入力してください:");
            buf = br.readLine();

            if (buf.equals("")) {
                System.out.println("プログラムを終了します。");
                break;
            }

            //整数判定
            Pattern p = Pattern.compile("^[0-9]*$");
            Matcher m = p.matcher(buf);
            if(! m.find()) {
                System.out.println("半角数字以外が入力されました。");
                continue;
            }

            //3桁カンマ区切りの文字列に変換
            NumberFormat nf = NumberFormat.getInstance();
            String[] strNum = nf.format(Integer.parseInt(buf)).split("");

            //辞書参照して漢数字に変換
            String strKanji = "";
            for (String s : strNum) {
                strKanji += map.getOrDefault(s, ",");
            }

            //出力
            System.out.println(strKanji);
        }
    }
}