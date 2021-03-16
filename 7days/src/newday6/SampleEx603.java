package newday6;

public class SampleEx603 {

	public static void main(String[] args) {
        String s1 = "ABCDEF";
        String s2 = "ABCDEF";
        String s3 = new String("ABCDEF");
        if(s1.equals(s2)){
            System.out.println("s1とs2の文字列は等しい");
        }else{
            System.out.println("s1とs2の文字列は等しくない");
        }
        if(s1.equals(s3)){
            System.out.println("s1とs3の文字列は等しい");
        }else{
            System.out.println("s1とs3の文字列は等しくない");
        }
        if(s1 == s2){
            System.out.println("s1とs2のオブジェクトは等しい");
        }else{
            System.out.println("s1とs2のオブジェクトは等しくない");
        }
        if(s1 == s3){
            System.out.println("s1とs3のオブジェクトは等しい");
        }else{
            System.out.println("s1とs3のオブジェクトは等しくない");
        }
    }

}