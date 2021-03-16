package newday2;

public class Car {
	private int fuel = 0;         //  燃料
    private int migration = 0;    //  移動距離
    //  コンストラクタ
    public Car()
    {
        System.out.println("Carオブジェクト生成");
    }
    //  移動メソッド
    public void move()
    {
        //  燃料があるなら移動
        if(fuel >= 0){
            migration++;  //  距離移動
            fuel--;       //  燃料消費
        }
        System.out.println("移動距離 : "+migration);
        System.out.println("燃料 : "+fuel);
    }
    //  燃料補給メソッド
    public void supply(int fuel)
    {
         if(fuel > 0){
                this.fuel += fuel; //  燃料補給
         }
         System.out.println("燃料 : "+fuel);
    }

}