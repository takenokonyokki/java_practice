public class Practice4 {
	public static void main(String[] args) {
		//4-1
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
		
		//4-2
		int[] moneyList = {121902, 8302, 55100};
		//for文
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		//拡張for文
		for (int value : moneyList) {
			System.out.println(value);
		}
		
		//4-3
		int[] counts = null;
		float[] heights = {171.3F, 175.0F};
//		System.out.println(counts[1]); //NullPointerException　nullのため参照型の変数は参照されない
//		System.out.println(heights[2]); //ArrayIndexOutOfBoundsException　添え字2は存在しない　0または1を指定する
		
		//4-4
		int[] numbers = {3, 4, 9}; //配列変数numbersに3，4，9を代入
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt(); //キーボードから数字を入力
		//配列を回しながら判定
		//for文の場合
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == input) { //入力された数字がnumbersと一致した場合
				System.out.println("10"); 
			}
		}
		//拡張for文の場合
		for (int i : numbers) {
			if (i == input) { //入力された数字がnumbersと一致した場合
				System.out.println("1");
			}
		}
	}
}