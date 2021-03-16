package day7prob;

// prob7-1.(難易度★)
// 以下のプログラムのクラスDataに、
// メンバ変数のセッターおよびゲッターを追加し、
// ビルドが通るようにし、期待される実行結果を得られるように書き換えなさい。
public class mondai7_1 {

	public static void main(String args[]){
        Data d = new Data();
        d.setNumber(100);
        d.setComment("Programming Java");
        System.out.println( "number = " + d.getNumber());
        System.out.println( "comment = " + d.getComment());
    }
}
