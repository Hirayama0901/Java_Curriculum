package curriculum1_33;

public class Vehicle {
	//問題1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。
	private String owner;
	
	//問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義しましょう。
	//セッター
	public void setOwner(String owner) {
		this.owner = owner;
	}
	//ゲッター
	public String getOwner() {
		return this.owner;
	}
}