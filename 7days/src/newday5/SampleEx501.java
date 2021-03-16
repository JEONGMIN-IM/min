package newday5;

import java.util.ArrayList;

public class SampleEx501 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Student("安藤一郎",1,1));
        al.add(new Student("伊藤花子",1,2));
        al.add(new Student("太田たかし",2,3));
        al.add(new Student("加藤紀子",2,4));
        al.add(new Student("木田直美",3,5));
        //  3番目を削除
        al.remove(3);
        for(int i = 0; i < al.size() ; i++){
            Student s = (Student)al.get(i); //  i番目のオブジェクトを取得
            System.out.println("番号:" + s.getNumber() + " 名前: " + s.getName() + " 学年" + s.getGrade());
        }

    }

}