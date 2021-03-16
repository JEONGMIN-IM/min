package day7prob1;

public class mondai8_14 {

	public static void main(String[] args) {
        boolean[] lockers = new boolean[51];
        //Open all multiples of 1 before moving on to 2
        for (int i = 1; i < lockers.length; i++) {
            lockers[i] = true;
        }


        //open every locker for every multiple of i
        for (int i = 2; i <= 50; i++) {
            for (int j = 1; i * j <= 50; j++) {
            	lockers[i * j] = !lockers[i * j];
            }
        }

        //Display the indices of the open lockers
        for (int i = 0; i < lockers.length; i++) {
        	if (lockers[i]) {
        	       System.out.println("locker " + i + " is open.");
        	}
        }
	}
}
