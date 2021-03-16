package day7prob1;

// prob8-12.(難易度★★★)（エラトステネスのふるい）
// エラトステネスのふるいを用いて、
// 100以下の素数を全て求めるプログラムを作ってください。
//（配列を用いること）“エラトステネスのふるい”とは、
// 数値の一覧表を作り、表の中から、
// 最初の素数である2の倍数（ただし、2を除く）を全て消去し、
// その次に、残った数値の中から最小の数（この場合は3）の倍数を表から全て削除していく、
// ということを繰り返していく方法です。
// 表の中の一番大きな数での処理が終わった段階で残った数値が、素数になります。
public class mondai8_12 {

	public static void main(String[] args) {
		int     t[] = new int[100];     //配列の生成
        int     i,j;

        for(i=2; i<100; i++)    t[i]= i;
        for(i=2; i<8; i++)
            for(j=i+i; j<100; j+= i)    t[j]= 0;
        for(i=2; i<100; )
        {   for(j=0; j<10 && i<100; i++)
                if (t[i]!=0)
                {   if (i<10)   System.out.print("   " + i);
                    else        System.out.print("  " + i);
                    j++;
                }
            System.out.println("");
        }
	}
}
