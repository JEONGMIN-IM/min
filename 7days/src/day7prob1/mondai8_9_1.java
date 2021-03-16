package day7prob1;
// prob8-9.(難易度★★★)（完全数）
// 自分自身以外の約数の総和が自分自身に等しくなる自然数を完全数とう。
// 例えば6の約数は1,2,3でその和は6となりますので完全数である。10000以下の整数の中から、全ての完全数を探し出し表示するプログラムを作りなさい。

public class mondai8_9_1 {
	
	public static void main(String[] args) {
		int a;
		int sum = 0;
		
		for(int i =1; i <=10000; i++) {
			a = i;
			for(int j =1; j <=i; j++) {
	
				if(a%j == 0) {
					sum = sum + j;
				}
			}
	
			if((sum-i)== i) {
				System.out.println(i + " ");
			}
			sum =0;
		}
	}

}
