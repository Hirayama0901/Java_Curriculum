package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main (String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 問題6.入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		 */
		/*
		 * 【概要】
		 * 	・拡張for文・Switch文・条件演算子を使用すること ※普通のif文は使用不可
		 * 	・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
		 * 	・テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 
		 * 	・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字
		 * 	・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
		 * 	・そのほかの値が入力された場合下記を出力されるようにしてください
		 * 		『受け取った値』は指定の商品ではありません
		 * 	・残り台数は0〜11までのランダムな値が出力されるようにしてください
		 */	
		
		System.out.println("「パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ」を複数、(カンマ)区切りで入力してください");
		System.out.println("入力例：冷蔵庫、パソコン、ディスプレイ");
		
		String input = scanner.nextLine();
		String electricalAppliances[] = input.split("、");
		int tvCount = random.nextInt(11);
		
		for(String electricalAppliance: electricalAppliances) {
			int units = random.nextInt(11);
			switch(electricalAppliance) {
				case "パソコン","冷蔵庫","扇風機","洗濯機","加湿器":
					System.out.println(electricalAppliance + "残り台数は" + units + "台です" + '\n');
					break;
				case "テレビ","ディスプレイ":
					System.out.println(electricalAppliance.equals("テレビ") ? electricalAppliance + "残り台数は" + tvCount + "台です" + '\n' :electricalAppliance + "残り台数は" + (11 - tvCount) + "台です" + '\n' );
					break;
				default:
					System.out.println("『 " + electricalAppliance + " 』は指定の商品ではありません");
					break;
			}
		}
		scanner.close();
	}
}