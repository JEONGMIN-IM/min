package newday2prob;

public class NewCalc {

	private double number1 = 0.0;   //  一つ目の数
    private double number2 = 0.0;   //  二つ目の数
    //  一つ目の数を設定
    public void setNumber1(double number1){
        this.number1 = number1;
    }
    //  二つ目の数を設定
    public void setNumber2(double number2){
        this.number2 = number2;
    }
    //  一つ目の数を設定
    public double getNumber1(){
        return number1;
    }
    //  二つ目の数を設定
    public double getNumber2(){
        return number2;
    }

    public double add() {
    	return number1 + number2;
    }

    public double sub() {
    	return number1 - number2;
    }
	public double mul() {
		return number1 * number2;
	}

	public double div() {
		return number1 / number2;
	}

}
