package newday1prob;

public class Problemprob1_1 {

	public static void main(String[] args) {
        int a = (int)(Math.random() * 10)  + 1;     //  1～10の乱数を発生
        int b = (int)(Math.random() * 10)  + 1;     //  1～10の乱数を発生
        int result = add(a,b);  //  二つの数の和を求める
        int result1 = sub(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + " + " + b + " = " + result);
        System.out.println(a + " - " + b + " = " + result1);
    }
    //  足し算
    static int add(int a,int b){
        return a + b;
    }
    static int sub(int a, int b) {
    	return a - b;
    }

}