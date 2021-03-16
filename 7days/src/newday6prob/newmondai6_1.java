package newday6prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class newmondai6_1 {

	public static void main(String[] args) throws IOException {
        @SuppressWarnings("serial")
        Map<String, String> map = new HashMap<String, String>() {
            {
                put("cat", "猫");
                put("dog", "犬");
                put("bird", "鳥");
                put("tiger", "虎");
            }
        };

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (true) {
            System.out.print("英語で動物の名前を入力してください:");
            String buf = br.readLine();
            if (buf.equals("")) {
                System.out.println("プログラムを終了します。");
                break;
            }

            String ret = map.get(buf);
            if (ret != null) {
                System.out.println(ret + "です。");
            } else {
                System.out.println("対応するデータは登録されていません。");
            }
        }
    }
}