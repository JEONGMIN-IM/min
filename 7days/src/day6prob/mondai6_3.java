package day6prob;

// prob6-3.(難易度★)
// 以下のプログラムは、円の半径から、
// 円周の長さを求めるものである。このクラスに、
// 指定したメソッド追加し、
// 期待される実行結果が得られるようにプログラムを変更しなさい。
public class mondai6_3 {

	public static void main(String[] args) {
		Circle c = new Circle();
		//  円の半径を設定
        c.r = 4.0;
        System.out.println("半径" + c.r +"の円の円周の長さは" + c.circumference());
        System.out.println("半径" + c.r +"の円の面積の長さは" + c.area());
	}
}
