package newday5prob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class newmondai5_7 {

	public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        while(true){
            int value = rand.nextInt(10);
            System.out.println("出力された数値:" + value);
            if(value == 0){
                break;
            }
            numbers.add(value);
            Collections.sort(numbers);
            System.out.println(numbers);
        }
    }
}