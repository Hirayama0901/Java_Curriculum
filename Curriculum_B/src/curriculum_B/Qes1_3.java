package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	
	public static void main(String[] args) {
		/*
		 * 問題1.ログイン時の入力チェックシステムを下記条件で作成してください
		 * ・コンソールにユーザー名を入力できるようにしてください
		 * ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		 * ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		 * ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		 */
		/*
		 * 【概要】コンソールにユーザー名を入力できるようにする処理
		 */
		System.out.println("こんにちは");
		Scanner scanner = new Scanner(System.in);
		System.out.println("「半角英数字のみで名前を入力してください」");
		String input = scanner.nextLine();
		/*
		 *  【概要】問題1の入力チェックシステムを下記条件を行う処理
		 *  問題2.ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		 */

		if (input.isEmpty() || input.length() <= 0) {
			System.out.println("「名前を入力してください」");
			System.exit(0);
		} else if (!input.matches("^[0-9a-zA-Z]*$")) {
			System.out.println("「半角英数字のみで名前を入力してください」");
			System.exit(0);
		} else if (input.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");
			System.exit(0);
		} else {
			System.out.println("「ユーザー名「 " + input + " 」を登録しました」");
		}

		/*
		 * 問題3.じゃんけんのシステムを下記の条件で作成してください
		 */

		String win = "やるやん。" + '\n' + "次は俺にリベンジさせて";
		String lose = "俺の勝ち！" + '\n';
		String loseRock = "負けは次につながるチャンスです！" + '\n' + "ネバーギブアップ！";
		String loseSciccors = "たかがじゃんけん、そう思ってないですか？" + '\n' + "それやったら次も、俺が勝ちますよ";
		String losePaper = "なんで負けたか、明日まで考えといてください。" + '\n' + "そしたら何かが見えてくるはずです";
		String draw = "DRAW あいこ もう一回しましょう！";

		String[] len = { "グー", "チョキ", "パー" };

		int loseCount = 0;

		System.out.println("じゃんけんゲーム(数字で入力してください「0: グー、1：チョキ、2：パー」)");
		Random random = new Random();

		while (true) {
			int enemy = random.nextInt(3);
			int myChoice = scanner.nextInt();
			System.out.println(input + "の手は「" + len[myChoice] + "」"); 
			System.out.println("相手の手は「" + len[enemy] + "」");
			double result = (myChoice - enemy);
			loseCount++;
			if (myChoice == enemy) {
				System.out.println(draw);
			} else if (myChoice == 0 && enemy == 2) {
				//パー
				System.out.println(lose + losePaper);
			} else if (myChoice == 1 && enemy == 0) {
				//グー
				System.out.println(lose + loseRock);
			} else if (myChoice == 2 && enemy == 1) {
				//チョキ
				System.out.println(lose + loseSciccors);
			} else if (result == -1 || result == 2) {
				System.out.println(win + "\n");
				System.out.println("勝つまでにかかった回数は合計" + loseCount + "回です" + '\n');
				break;
			}
		}
		scanner.close();
	}
}