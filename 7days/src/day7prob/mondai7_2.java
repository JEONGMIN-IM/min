package day7prob;

// prob7-2.(難易度★)
// 以下のプログラムは、二つの文字列を合成したり、
// その長さを求めるする機能を持つクラス、TwoStringsのヘッダファイルと、
// そのクラスを使ったサンプルプログラムです。
// このクラスの二つの文字列を結合させるメソッドである、
// getConnectedStringを追加し、実行結果通りに動くようにしなさい。
public class mondai7_2 {
	
	 public static void main(String args[]){
         TwoStrings s = new TwoStrings();
         s.setString1("Hello");
         s.setString2("World");
         System.out.println("一つ目の文字列は" + s.getString1());
         System.out.println("二つ目の文字列は" + s.getString2());
         System.out.println("二つの文字列を合成したものは" + s.getConnectedString());
    }

}
