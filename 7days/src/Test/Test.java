package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //  コンソールから文字列の読み込み

        ArrayList<String> list = new ArrayList<String>();
        // キーボードで値を入力してもらう。

        for(String i : list) {
	 	System.out.println(list);
        }
        // 値の入力なしでエンターテインメントする前まで入力してもらう。
        // 値がないエンタが押されると終了する。
        // 入力を受けて保存した値を一度に出力する。
        String buf = br.readLine(); // BufferedReader 는 InputStreamReader에서 받았던 값을 String 형으로 한번에 보여주게된다
	 	System.out.println(buf);


    }

}