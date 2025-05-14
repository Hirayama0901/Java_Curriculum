package sub;

public class Data {
	private String name;
	private String capital;
	private double area;

	public Data(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
	
	public String getName() {
		return name;
	}
	public String getCapital() {
		return capital;
	}
	public double getArea() {
		return area;
	}
	
	public void getData() {
        System.out.println();
		System.out.println("都道府県名：" + name);
        System.out.println("県庁所在地：" + capital);
        System.out.println("面積：" + area + "km2");
	}
}