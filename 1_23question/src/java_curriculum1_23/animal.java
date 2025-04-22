package java_curriculum1_23;

public class animal {
	/*
		下記がコンソールに出力されるように作成してください
		※thisとsetterとgetterとフィールドを使ってください
		 	
		動物名：ライオン
		体長：2.1m
		速度：80km/h
	*/
		
	//フィールド
	private String name;
	private double bodyLength;
	private int speed;
	
	// Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public double getLength() {
        return this.bodyLength;
    }

    public int getSpeed() {
        return this.speed;
    }
}