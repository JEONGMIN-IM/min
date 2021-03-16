package newday4prob;

//アラームつき時計クラス
public class AlarmClock implements IClock,IAlarm{
	
	public void alarm(){
	    System.out.println("アラームを鳴らす");
	}
	public void setAlarm(){
	    System.out.println("アラームをセットする");
	}
	public void stopAlarm(){
	    System.out.println("アラームを止める");
	}
	public void showTime(){
	    System.out.println("時刻を知る");
	}
	public void adjustTime(){
	    System.out.println("時刻を修正する");
	}

}