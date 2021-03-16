package newday6;

import java.util.HashMap;

public class SampleEx601 {

	public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        String nengo[] = { "明治" , "大正" , "昭和" , "平成" };
        map.put(nengo[0], 1868);
        map.put(nengo[1], 1912);
        map.put(nengo[2], 1926);
        map.put(nengo[3], 1989);
        for(String s: nengo){
            System.out.println(s+"元年は、西暦"+map.get(s)+"年");
        }
    }
}