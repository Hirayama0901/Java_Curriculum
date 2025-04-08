package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main (String[] args) {
		/*
		 * 問題7.N人の生徒の成績を管理するプログラムを下記条件で作成してください
		 */
		/*
		 * 【概要】
		 * ・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
		 * ・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
		 * ・このプログラムの実行は必ず1回以上行われるようにしてください
		 * ・出力例を参考にプログラミングを作成してください
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("生徒の人数を入力してください（2以上）:");
		int parsons = scanner.nextInt();
		int[][] score = new int[parsons][4];
		int order = 0;
		
		String[] subject = {"英語","数学","理科","社会"};
		//入力した数値が2より低いのか判断する処理
		if(parsons < 2) {
			System.exit(0);
		} else {
			//配列の要素へ点数を代入する処理
			for(int numbers = 0; numbers <= parsons ; numbers++) {
				order = numbers + 1;
				if(order <= parsons) {
					System.out.println(order + "人目の『英語』の点数を入力してください :");
					score[numbers][0] = scanner.nextInt();
					System.out.println(order + "人目の『数学』の点数を入力してください :");
					score[numbers][1] = scanner.nextInt();
					System.out.println(order + "人目の『理科』の点数を入力してください :");
					score[numbers][2] = scanner.nextInt();
					System.out.println(order + "人目の『社会』の点数を入力してください :");
					score[numbers][3] = scanner.nextInt();
				} 
			}
			//個人の合計点の平均点を計算し出力する処理
			for (int nums = 0; nums < parsons; nums++) {
				order = nums + 1;
				double average = (score[nums][0] + score[nums][1] + score[nums][2] + score[nums][3]) / subject.length;
//				System.out.println(order + "人目の平均点は" + String.format("%.2f",average) + "点です。");
				System.out.printf("%d人目の平均点は%.2f点です。\n",order,average);
			}
			System.out.println("");
			double totalAverage = 0;
			//それぞれの教科の平均点を計算し出力する処理
			double totle = 0;
			for (int results = 0; results < subject.length; results++) {
				for(int nums = 0; nums < parsons; nums++) {
					totle = totle + score[nums][results];
				}
				double average = totle / parsons;
				totalAverage = totalAverage + average;
//				System.out.println(subject[results] + "の平均点は" + String.format("%.2f",average) + "点です。");
				System.out.printf("%sの平均点は%.2f点です。\n",subject[results],average);
				totle = 0;
			}
			double allSubjectAverage = totalAverage / subject.length;
//			System.out.println("全体の平均点は" + String.format("%.2f",allSubjectAverage) + "点です。");
			System.out.printf("全体の平均点は%.2f点です。\n",allSubjectAverage);
		}
		scanner.close();
	}
}