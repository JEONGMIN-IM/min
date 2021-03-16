package newday3;

//すずめクラス
public class Sparrow2 extends Bird {
	//  コンストラクタ（引数なし）
	public Sparrow2(){
	    super("すずめ");   //  Birdクラスの引数つきコンストラクタを呼び出す
	}
	// 雀が鳴く
	public void sing(){
		System.out.println("チュンチュン");
	}
}