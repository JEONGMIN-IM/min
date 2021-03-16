package newday3prob;

public class SmartPhone extends Computer {

	public SmartPhone() {
		super("スマートフォン");
	}

	public void input() {
		System.out.println("タッチパネルディスプレイをタップして操作");
	}

	public void output() {
		System.out.println("タッチパネルディスプレイに出力");
	}
}
