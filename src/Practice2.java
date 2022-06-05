public class Practice2 {
	public static void main(String[] args) {
		//練習2-1
		int x = 5;
		int y = 10;
		String ans = "x + yは" + (x + y);
		System.out.println(ans);
		
		
		//2-3
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine(); //キーボードから1行の文字列の入力を受け付ける
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine(); //キーボードから1行の文字列の入力を受け付ける
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4); //乱数0~3
		fortune++; //乱数で生成された整数に1を足す(インクリメント演算子)
		System.out.println("占いの結果が出ました!");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉　2:中吉 3:吉 4:凶");
		
		
	}
}