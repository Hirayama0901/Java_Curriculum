package curriculum_B;

public class Qes5 {

	public static void main (String[] args) {
		/*
		 * 問題5.for文を使用して下記の通りに出力してください
		 */
		for(int num1=1 ; num1<10 ; num1++) {
			for (int num2=1 ; num2<21 ; num2++){
				//書式を使用して1桁または2桁を3桁表示にして式を出力する処理
				System.out.printf("%03d * %03d = %03d", num2 , num1 ,(num2 * num1));
				//条件演算子を使用して答えの後に"||"or改行を付加する処理
				System.out.print(num2!= 20 ? "||":'\n');
			}
		}
	}
}