package newday6;

import java.util.HashSet;

public class SampleEx602 {

	public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        //  ハッシュセットにデータを追加
        hs.add("山田太郎");
        hs.add("山田太郎");
        hs.add("太田美代子");
        hs.add("斉藤五郎");
        hs.add("斉藤五郎");
        //  追加した成分をすべて表示
        for(String s:hs){
            System.out.println(s);
        }
    }

}