package day7prob1;

public class Example {
	  public static void main(String[] args) {

	    // 5/10 (10분의 5)
	    printFraction(reduceFraction(5, 10));
	    // 출력 결과: 1/2

	    // 1/2 (2분의 1)
	    printFraction(reduceFraction(1, 2));
	    // 출력 결과: 1/2

	    // 2940/3150 (3150분의 2940)
	    printFraction(reduceFraction(2940, 3150));
	    // 출력 결과: 14/15

	    // 6/63 (63분의 6)
	    printFraction(reduceFraction(6, 63));
	    // 출력 결과: 2/21

	    // 63/6 (6분의 63)
	    printFraction(reduceFraction(63, 6));
	    // 출력 결과: 21/2

	    // 1/1 (1분의 1)
	    printFraction(reduceFraction(1, 1));
	    // 출력 결과: 1/1

	    // 555/555 (555분의 555)
	    printFraction(reduceFraction(555, 555));
	    // 출력 결과: 1/1

	    // 0/1 (1분의 0)
	    printFraction(reduceFraction(0, 1));
	    // 출력 결과: 0/1

	    // 1/0 (0분의 1)
	    printFraction(reduceFraction(1, 0));
	    // 출력 결과 (에러): 0/0
	    // 분모가 0이 될 수는 없음

	    // 0/0 (0분의 0)
	    printFraction(reduceFraction(0, 0));
	    // 출력 결과 (에러): 0/0

	  }




	  // 분수 출력 함수
	  // (분자 분모가 든 배열을 입력받아 출력)
	  public static void printFraction(int[] bunsu) {
	    System.out.format("%d/%d%n", bunsu[0], bunsu[1]);
	  }




	  // 분수 약분 함수 (Reduce a Fraction)
	  // 분자 분모를 입력받아, 약분 후, 분자 분모가 든 배열을 반환
	  public static int[] reduceFraction(int bunja, int bunmo) {
	    int[] frac = new int[2];
	    frac[0] = bunja;
	    frac[1] = bunmo;

	    if (frac[1] == 0) { // 분모가 0일 경우에 에러 반환
	      frac[0] = 0;
	      frac[1] = 0;
	      return frac;
	    }

	    int gcd_result = gcd(frac[0], frac[1]);

	    frac[0] = frac[0] / gcd_result;
	    frac[1] = frac[1] / gcd_result;

	    return frac;
	  }




	  // 최대 공약수 계산 메서드
	  // (Euclidean Algorithm; Euclid's Algorithm)
	  public static int gcd(int a, int b) {

	    while (b != 0) {
	      int temp = a % b;
	      a = b;
	      b = temp;
	    }

	    return Math.abs(a);
	  }


	}