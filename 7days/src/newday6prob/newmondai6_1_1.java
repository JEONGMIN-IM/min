package newday6prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class newmondai6_1_1 {

	public static void main(String[] args) throws IOException {
	       Map<String, String> map = new HashMap<>();
	        InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);
	        String buf;

	        //辞書追加
	        map.put("cat", "猫です");
	        map.put("dog", "犬です");
	        map.put("bird", "鳥です");
	        map.put("tiger", "虎です");

	        while (true) {

	            System.out.print("英語で動物の名前を入力してください:");
	            buf = br.readLine();

	            //終了判定
	            if (buf.equals("")) {
	                System.out.println("プログラムを終了します。");
	                break;
	            }

	            //辞書判定
	            String str = map.getOrDefault(buf,"対応するデータは登録されていません。" );
	            System.out.println(str);
	        }
	    }
	}