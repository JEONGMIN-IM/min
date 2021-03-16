package newday6prob;

import java.util.Map;

public class newmondai6_2 {

	private final static Map<String, String> TR_MAP = Map.of(
            "0", "〇", "1", "一", "2", "二", "3", "三", "4", "四", "5", "五",
            "6", "六", "7", "七", "8", "八", "9", "九");

    public static void main(String[] args) {
        ;
        String[] TESTS = {
                "1", "12", "123", "1234", "12345",
                "1.2",
                "1234567890123456789012345678901234567890" };
        for (String buf : TESTS) {
            task(buf);
        }
    }

    static void task(String str) {
        System.out.println("入力: [" + str + "]");
        if (is_valid(str)) {
            System.out.println(to_kanji(str));
        } else {
            System.out.println("半角数字以外が入力されました。");
        }
    }

    static boolean is_valid(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    static String to_kanji(String str) {
        for (Map.Entry<String, String> entry : TR_MAP.entrySet()) {
            str = str.replaceAll(entry.getKey(), entry.getValue());
        }
        String ans = "";
        int keta = str.length();
        for (char c : str.toCharArray()) {
            if (ans.length() > 0 && keta % 3 == 0) {
                ans += ",";
            }
            ans += c;
            keta--;
        }
        return ans;
    }
}