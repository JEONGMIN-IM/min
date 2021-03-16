package newday1;

public class SampleClassEx01 {
	private int value = 0;              //  インスタンスフィールド
    private static int num = 0;         //  静的フィールド
    //  コンストラクタ①　引数あり
    public SampleClassEx01(int value){
        //  引数をインスタンスフィールドに代入
        this.value = value;
        //  静的メンバのインクリメント
        num++;
    }
    //  コンストラクタ②　引数なし
    public SampleClassEx01(){
        this(100);  //  引数つきコンストラクタを呼び出す
    }
    //  インスタンスの数を取得
    public static int getNumberOfInstance(){
        return num;
    }
    //  インスタンスフィールドを取得
    public int getValue(){
        return this.value;
    }
}