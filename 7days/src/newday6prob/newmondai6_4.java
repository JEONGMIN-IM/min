package newday6prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class newmondai6_4 {

	public static void main(String[] args){
	    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	      var words = br.lines()
	                    .flatMap(l->Arrays.stream(l.split(" ")))
	                    //.takeWhile(c -> !c.equals("9999"))
	                    .collect(Collectors.toCollection(TreeSet::new));
	      System.out.println(words);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	}
