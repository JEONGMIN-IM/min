package newday5;

public class Student {
	// 名前
	private String name;
	// 学年
	private int grade;
	// 番号
	private int number;
	// コンストラクタ
	public Student(String name, int grade , int number) {
		this.name = name;
		this.grade = grade;
		this.number = number;
	}
	//  名前の取得
    public String getName(){
        return name;
    }
    //  学年の取得
    public int getGrade(){
        return grade;
    }
    //  番号の取得
    public int getNumber(){
        return number;
    }
 
	
}
