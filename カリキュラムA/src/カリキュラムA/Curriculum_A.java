package カリキュラムA;

public class Curriculum_A {
	 public static void main(String[] args) {
			
			/**************************
			 *問題1.ローカル変数として宣言する 
			 **************************/
			byte byteValue;
			short shortValue;
			int intValue;
			long longValue;
			float floatValue;
			double doubleValue;
			char charValue;
			String stringValue;
			boolean booleanValue;
		
			/**************************
			 *問題2.ローカル変数をローカル内でそれぞれの初期値を代入し初期化する 
			 ************************ */
			/**************************
			 * [概要] ローカル変数に初期値を代入する処理
			 **************************/
			byteValue = 0;
			shortValue = 0;
			intValue = 0;
			longValue = 0L;
			floatValue = 0.0f;
			doubleValue = 0.0d;
			charValue = '\u0000';
			stringValue = "";
			booleanValue = false;
			
			
			/**************************
			 * 問題3.初期化をしたそれぞれの変数に下記の値を代入してください
			 **************************/
			/**************************
			 * [概要]それぞれの変数に下記の値を代入する処理
			 **************************/
			byteValue = 10;
			shortValue = 100;
			intValue = 1000;
			longValue = 10000L;
			floatValue = 9.5F;
			doubleValue = 10.5D;
			charValue = 'a';
			stringValue = "ハロー";
			booleanValue = true;
			
			/**************************
			 * 問題4.下記の通りにコンソール出力されるようにしてください
			 * 		 上記で作成した変数を必ず使用すること
			 **************************/
			/**************************
			 * [概要]下記の通りにコンソール出力する処理
			 **************************/
			System.out.println(byteValue + shortValue + intValue + longValue);
			System.out.println(byteValue + byteValue);
			System.out.println(charValue + stringValue + booleanValue);
			System.out.println(byteValue * 3 + shortValue + intValue + longValue);
			System.out.println(byteValue * shortValue * intValue * longValue);
			System.out.println(doubleValue / shortValue);
			System.out.println(byteValue - shortValue + "\n");
			
			/**************************
			 * 問題5.次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
			 * 		「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
			 **************************/
			/**************************
			 * [概要]下記のソースコードを正しく動作するように修正する処理
			 * String num="20";
			 * int num1=23;
			 * System.out.println("ハローJAVA"+(num+num1));
			 **************************/
			int num = 20;
			int num1 = 23;
			System.out.println("ハローJAVA"+(num+num1) + "\n");
			
			/**************************
			 * 問題6.『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
			 * 		　ローカル変数に代入し○○に入れてください
			 * 		　『山田太郎 18歳 170.5cm 62.2kg 寿司』
			 **************************/
			/**************************
			 * ローカル変数を宣言し、formatの○○に代入する処理
			 **************************/
			String name = "山田太郎";
			int age = 18;
			double height = 170.5D;
			double weight = 62.2D;
			String food = "寿司";
			/*-------------------------
			 [詳細] 代入し出力する処理
			 -------------------------*/
			System.out.println("初めまして" + name + "です");
			System.out.println("年齢は" + age + "歳です");
			System.out.println("身長は" + height + "cmです");
			System.out.println("体重は" + weight + "kgです");
			System.out.println("好きな食べ物は" + food + "です" + "\n");
			
			/**************************
			 * 問題7.問題6で作成した自己紹介に続いてBMIが出力されるようにしてください
			 * 		 「BMIは○○です」
			 * 		 ただし計算は数値を直書きせず、全て変数を使ってすること
			 **************************/
			double bmi = weight / height / height *10000;
			System.out.println("BMIは" + String.format("%.1f", bmi) + "です"  + "\n");
			
			/**************************
			 * 問題8.問題6で宣言した変数に再代入し下記の通りコンソールに出力してください
			 **************************/
			name = "鈴木一郎";
			age = 24;
			height = 168.5D;
			weight = 64.2D;
			food = "オムライス";
			bmi = 22.6;
			/*-------------------------
			 [詳細] 代入し出力する処理
			 -------------------------*/
			System.out.println("初めまして" + name + "です");
			System.out.println("年齢は" + age + "歳です");
			System.out.println("身長は" + height + "㎝です");
			System.out.println("体重は" + weight + "㎏です");
			System.out.println("好きな食べ物は" + food + "です");
			System.out.println("BMIは" + bmi + "です" + "\n");
			
			/**************************
			 * 問題9.問題8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
			 **************************/
			age = age + 24;
			height = height + 168.5D;
			weight = weight + 64.2D;
			bmi = weight / height / height *10000;
			/*-------------------------
			 [詳細] 代入し出力する処理
			 -------------------------*/
			System.out.println("初めまして" + name + "です");
			System.out.println("年齢は" + age + "歳です");
			System.out.println("身長は" + height + "㎝です");
			System.out.println("体重は" + weight + "㎏です");
			System.out.println("好きな食べ物は" + food + "です");
			System.out.println("BMIは" + String.format("%.1f", bmi) + "です" + "\n");
			
			/**************************
			 * 問題10.8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
			 **************************/
			/**************************
			 * [概要]Boolean型を宣言し、判定する処理
			 **************************/
			boolean ageValue = age >= 25;
			System.out.println(ageValue + "\n");
			
			/**************************
			 * 問題11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
			 **************************/
			/**************************
			 * [概要]【年齢・身長・体重】を文字列型に型変換する処理
			 **************************/
			age = 24;
			height = 168.5D;
			weight = 64.2D;
			String consoleAge = "年齢は" + String.valueOf(age) + "歳です";
			String consoleHeight = "身長は" + String.valueOf(height) + "㎝です";
			String consoleWeight = "体重は" + String.valueOf(weight) + "㎏です";
			System.out.println(consoleAge);
			System.out.println(consoleHeight);
			System.out.println(consoleWeight + "\n");
			
			/**************************
			 * 問題12.11で変換した【年齢・身長】を整数型に変換して出力してください
			 **************************/
			/**************************
			 * [概要]【年齢・身長】を整数型に型変換し出力する処理
			 **************************/
			int ageInteger = Integer.parseInt(consoleAge.replaceAll("[^0-9]", ""));
			int heightInteger = Integer.parseInt(consoleHeight.replaceAll("[^0-9]", ""));
			System.out.println(ageInteger);
			System.out.println(heightInteger + "\n");
			/**************************
			 * 問題13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
			 **************************/
			/**************************
			 * [概要]Boolean型を宣言し、判定する処理し出力する処理
			 **************************/
			boolean status = ageInteger >= 25 || heightInteger >= 160;
			System.out.println(status);
		 }

}
