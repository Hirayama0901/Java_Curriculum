package curriculum_new_1_18_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Curriculum_new_1_18 {
	
	public static void main(String[] args) {
	// 作成したメソッドをここで呼び出してください
		// Q1のメソッドを呼び出す
		printMessage("Hello JavaSE", 11);
		
		// Q2のメソッドを呼び出す
		calculation(5,6);
		
		// Q3のメソッドを呼び出す
        int[] numbers = {1, 2, 3, 4, 5};// 整数の配列を作成
		printArray(numbers);
		
		// Q4のメソッドを呼び出す
		calculation(1.2,6.3);
		
		// Q5のメソッドを呼び出す
		// メソッドを呼び出して、ランダムな数字を格納し、結果を受け取るする処理
        List<Integer> result = randomNumbers(5);
        System.out.println(result);
		
		// Q6のメソッドを呼び出す
		double average = averageResult(result);
		System.out.println(average);
		
		// Q7のメソッドを呼び出す
		boolean judge = judgement(average);
		System.out.println(judge);
	}	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
	// 文字列と整数型の引数を受け取るメソッド
	private static void printMessage(String str,int num) {
		// 指定された形式で出力する処理
		System.out.println(str + " " + num);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	private static void calculation(int num1,int num2) {
		// 引数を乗算する処理
		int result = num1 * num2;
		// 結果をコンソールに出力する処理
		System.out.println(result);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	private static void printArray(int[] array) {
        // 配列の各要素を順番に出力する処理
        for (int num : array) {
            System.out.println(num);
        }
    }
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	private static void calculation(double num1,double num2) {
		// 引数を乗算する処理
		double result = num1 + num2;
		// 結果をコンソールに出力する処理
		System.out.println(result);
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	private static List<Integer> randomNumbers(int count) {
        // ランダムな数字を生成する処理
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        // count回数分ランダムな数字を格納する処理
        for (int i = 0; i < count; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(100) + 1; // 1～100までのランダムな数を生成する処理
            } while (randomNumber == 0); // 0が生成されないようにする処理
            // ランダムな数字をリストの最後尾に格納する処理
            numbers.add(randomNumber);
            // 格納した値をコンソールに出力
            System.out.println(randomNumber);
        }
        // 格納したリストを返す
        return numbers;
    }
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	private static double averageResult(List<Integer> result) {
		double totle = 0;
		for(double num : result) {
			totle += num;
		}
		return  totle / 5;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	private static boolean judgement(double average) {
			return average >=50;
	}
	
}
