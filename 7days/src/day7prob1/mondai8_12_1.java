package day7prob1;

// prob8-12.(難易度★★★)（素因数分解）
// 2から100の乱数を発生させ、
// その数を素因数分解するプログラムを作成しなさい。
// 素因数分解とは、 数値を、素数の積で表すことであり、
// 例えば、72 = 2 × 2 × 2 × 3 × 3といったように表現することである。
public class mondai8_12_1 {

	public static void main(String[] args) {


        int x = (int)(Math.random()*100)+2;

        int y = x;

        System.out.println("X = " + x);
        System.out.println("数値を入力して下さい");

        for (int i = 2; x > i; i++) {
            while ((y % i) == 0) {
                System.out.println(i);
                y = y / i;
            }
        }
    }
}

