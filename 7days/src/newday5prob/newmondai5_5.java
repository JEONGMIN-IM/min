package newday5prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class newmondai5_5 {

	public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<String>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String buf;

        while (true) {

            System.out.print("文字列を入力:");
            buf = br.readLine();

            if (buf.equals("")) {
                break;
            }

            list.add(buf);
        }
        list.removeIf(s -> s.length() >= 5);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}