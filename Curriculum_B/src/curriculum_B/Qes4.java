package curriculum_B;

public class Qes4 {
	
	public static void main (String[] args) {
		/*
		 * 問題4.for文を使用して下記の通りに出力してください
		 */
		for(int num1=1 ; num1<10 ; num1++) {
			for (int num2=1 ; num2<10 ; num2++){
				//書式を使用して1桁を2桁表示にして式を出力する処理
				System.out.printf("%02d * %02d = %02d", num1 , num2 ,(num1 * num2));
				//条件演算子を使用して答えの後に"||"or改行を付加する処理
				System.out.print(num2!= 9 ? "||":'\n');
			}
		}
	}
}