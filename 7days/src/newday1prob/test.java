package newday1prob;

public class test {

	public static void main(String[] args) {
        Counter c1,c2;
        c1 = new Counter();
        c2 = new Counter();
        c1.count();
        c2.count();
        c2.count();
        c2.reset();
        c1.count();
        c1.count();
        c2.count();

        System.out.println("c1のカウント数：" + c1.getCount());
        System.out.println("c2のカウント数：" + c2.getCount());
        
    }

}