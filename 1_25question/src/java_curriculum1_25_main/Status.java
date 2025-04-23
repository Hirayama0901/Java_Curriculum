package java_curriculum1_25_main;


//スーパークラス
public class Status {

	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;

	public Status(int hp, int mp, int attack, int speed, int defense) {
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.speed = speed;
		this.defense = defense;
	}

	//Setter
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	//Getter
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getAttack() {
		return attack;
	}
	public int getSpeed() {
		return speed;
	}
	public int getDefense() {
		return defense;
	}
}