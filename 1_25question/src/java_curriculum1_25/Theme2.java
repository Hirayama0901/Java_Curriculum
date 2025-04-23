package java_curriculum1_25;

import java.util.Scanner;

import java_curriculum1_25_main.Player;

public class Theme2 {
	/*
	 名前を入力したら下記がコンソールに出力されるように作ってください
		条件：数値は毎回変わるように作ってください
		 	 サブクラスを使用してください
			 スーパークラスを使用してください
			 getterとsetterを使用してください
			 packageを2つ作ってメインと処理を分けてください
			 命名する場合は規則にのっとってください
			 コンストラクタを使用してください
			 
		こんにちは 「 名前 」 さん
		ステータス
		HP：849
		MP：862
		攻撃力：375
		素早さ：937
		防御力：24
		
		さあ冒険に出かけよう！
	 */
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("あなたの名前を入力してください");

		String playerName = scanner.nextLine();
		Player player = new Player(playerName);

		System.out.println("\nこんにちは 「 " + player.getName() + " 」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + player.getHp());
		System.out.println("MP：" + player.getMp());
		System.out.println("攻撃力：" + player.getAttack());
		System.out.println("素早さ：" + player.getSpeed());
		System.out.println("防御力：" + player.getDefense());
		System.out.println("\nさあ冒険に出かけよう！");
		
		scanner.close();
	}
}