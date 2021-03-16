package newday2;

public class SmapleEx201 {

	public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Car c = new Car();
        c.supply(10);   //  燃料補給
        c.move();   //  移動
        c.move();   //  移動
        Ambulance a = new Ambulance();
        a.supply(10);
        a.move();
        a.sevePeople();
    }

}