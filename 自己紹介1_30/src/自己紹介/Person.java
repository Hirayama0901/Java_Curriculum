package 自己紹介;

class Person{
	 // インスタンスフィールドを定義
	 //問題1：インスタンスフィールドを定義してください
	 String name;
	 int age;
	 double height;
	 double weight;
	 
	 private static int count = 0;

	 // コンストラクタを定義しインスタンスフィールドに値をセット
	 //問題2：コンストラクタを定義してください（下記それぞれの引数）
	 //問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
	 //問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	 Person(String name,int age,double height,double weight){
		 this.name = name;
		 this.age = age;
		 this.height = height;
		 this.weight = weight;
		 count++; // 人数カウント
	 }
	 
	 //問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	 //問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
	 public double bmi() {
		 //bmiの公式「体重/（身長*身長）」
		 return this.weight / (this.height * this.height);
	 }
	 
	 //問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	 //問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
	 public void print() {
	        System.out.println();
	        System.out.println("名前は" + this.name + "です");
	        System.out.println("年は" + this.age + "です");
	        System.out.printf("BMIは%.1fです\n", Math.floor(this.bmi()));
	 }
	 
	 //問題10：人数の合計を「合計○人です」と出力してください。
	 public static void printCount() {
	        System.out.println();
	        System.out.println("合計" + count + "人です");
	 }
}