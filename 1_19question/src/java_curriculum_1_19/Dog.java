package java_curriculum_1_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String dog;
    String cat;
    String elephant;
    String tiger;
    String rabbit;
    
    public void printAnimals() {
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(elephant);
        System.out.println(tiger);
        System.out.println(rabbit);
    }
    
	// Q2：フィールドに動物の数の変数を定義してください。
    int dogCount;        // 犬の数
    int catCount;        // 猫の数
    int elephantCount;   // 象の数
    int tigerCount;      // トラの数
    int rabbitCount;     // ウサギの数
    
    public void printAnimalNums() {
        System.out.println("犬の数は" + dogCount + "匹です");
        System.out.println("猫の数は" + catCount + "匹です");
        System.out.println("象の数は" + elephantCount + "匹です");
        System.out.println("トラの数は" + tigerCount + "匹です");
        System.out.println("ウサギの数は" + rabbitCount + "匹です");
    }
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
		this.dog = "犬";
		this.cat = "猫";
		this.elephant = "象";
		this.tiger = "トラ";
		this.rabbit = "ウサギ";
		
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		this.dogCount = 9;
		this.catCount = 5;
		this.elephantCount = 4;
		this.tigerCount = 2;
		this.rabbitCount = 15;
	}
}