package java_curriculum1_25_main;

import java.util.Random;

//サブクラス
public class Player extends Status  {
	private String name;
	
	public Player(String name) {
		super(randomStat(), randomStat(), randomStat(), randomStat(), randomStat());
		this.name = name;
	}
	
	private static int randomStat() {
        Random random = new Random();
        return random.nextInt(1000); // 0～999のランダムな数を出力する処理
    }
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}