package newday6;

import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();

		String name[] = { "i" , "love", "you", "like"};
		map.put(name[0] , 1);
		map.put(name[1] , 2);
		map.put(name[2], 3);
		map.put(name[3], 4);
		for(String s : name) {
			System.out.println(s + " " + map.get(s));
		}
	}
}
