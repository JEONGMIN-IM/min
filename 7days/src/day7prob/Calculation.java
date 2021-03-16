package day7prob;

public class Calculation {

	private int number1 = 0;
	private int number2 = 0;

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber1() {
		return this.number1;
	}

	public int getNumber2() {
		return this.number2;
	}

	public int add() {
		return this.getNumber1() + this.getNumber2();
	}

	public int sub() {
		return this.getNumber1() - this.getNumber2();
	}
}
