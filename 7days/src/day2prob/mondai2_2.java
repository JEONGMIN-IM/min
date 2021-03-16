package day2prob;

public class mondai2_2 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 4, e = 5;
		int a1 = 1, b1 = 2, c1 = 3, d1 = 4, e1 = 5;

		a = a + 2;  //  aに2を加える
        b = b - 1;  //  bから1を引く
        c = c * 3;  //  cに3をかける
        d = d / 2;  //  dを2で割る
        e = e % 2;  //  eに、eを2で割った余りを代入する


		a1 += 2;
		b1 -= 1;
		c1 *= 3;
		d1 /= 2;
		e1 %= 2;


		System.out.println("a="+ a +" b=" + b + " c="+ c +" d="+ d + " e="+ e);
		System.out.println("a1="+ a1 +" b1=" + b1 + " c1="+ c1+" d1="+ d1 + " e1="+ e1);

	}
}
