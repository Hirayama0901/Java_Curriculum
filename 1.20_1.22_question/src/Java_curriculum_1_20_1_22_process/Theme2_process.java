package Java_curriculum_1_20_1_22_process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Theme2_process {
	/*
	下記がコンソールに出力されるように作成してください

		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
	*/
	//フィールドで変数を作成する処理
	String country;
	String food;
	String variousCuisines;
	
	public void output () {
		//変数に引数を代入するコンストラクタを作成する処理
		this.country = "こんにちは！ここは日本です！";
		this.food = "この寿司はうまい";
		this.variousCuisines = "寿司は和食です";
		
		System.out.println(country);
		System.out.println(food);
		System.out.println(variousCuisines);
		// 現在の日時を取得する処理
		Date now = new Date();
		// 日時を「yyyy/MM/dd H:m:s」形式でフォーマットする
		SimpleDateFormat nowTime = new SimpleDateFormat("yyyy/MM/dd H:m:s");
		String dateNowTime = nowTime.format(now);
		System.out.println("今の現在日時は" + dateNowTime + "です");
	}	
}