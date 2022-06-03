public class Sample001 {
	public static void main (String[] args) {
		System.out.println("javajava");
		System.out.println("27 + 27");
		System.out.println(27 + 27);
		System.out.println(35 - 23);
		
		//変数を定義
		int x; //変数xを定義 intは整数しか入れられない
		x = 8; //変数に８を代入
		System.out.println(x * x * 3.14); //変数を使って計算
		
		int age; //変数age定義
		age = 27; //代入
		System.out.println(age); //取得
		
		//変数を宣言すると同時に値を代入することを変数の初期化という
		int age2 = 23; //変数の初期化
		System.out.println(age2);
		age2 = 32; //再代入可能
		System.out.println(age2);
		
		//定数の宣言(finalを記述し書き換えを防止する)
		final double PI = 3.14; //定数
		//PI = 45; //final変数PIには値を代入することはできないというエラーが発生する
		
		
				
	}
}