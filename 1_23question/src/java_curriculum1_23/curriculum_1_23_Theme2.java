package java_curriculum1_23;

public class curriculum_1_23_Theme2 {
	public static void main(String[] arg) {
		animal lion = new animal();

		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);

		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}