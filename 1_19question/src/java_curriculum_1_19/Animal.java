package java_curriculum_1_19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
	// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog animals = new Dog();
		animals.printAnimals();
		
	// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		animals.printAnimalNums();
		
	// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		// 現在の日時を取得する処理
		Date now = new Date();
		// 日時を「yyyy-MM-dd H:m:s」形式でフォーマットする
        SimpleDateFormat nowTime = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        String dateNowTime = nowTime.format(now);
        
        System.out.println(dateNowTime);
	}
}