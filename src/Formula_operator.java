public class Formula_operator {
	public static void main (String[] args) {
		int a = 20;
		int b = a + 5;
		System.out.println(a);
		System.out.println(b);
		//a,b,5のことをオペランド（operand）という
		//+,=のことを演算子（operator）という
		
		//数字の５や文字列の"Hello World"などの具体的な値をリテラル（literal）という
		
		System.out.println("私の好きな記号は二重引用符(\")です");
		System.out.println("\\1200"); //¥は\で表示される
		
		System.out.println(9 / 2); //割り算は商となるため整数部分のみ表示
		System.out.println(9.0 / 2); //オペランドのどちらかを小数にすることで計算結果が小数まで表示される
		
		//どちらも同じこと
		System.out.println(a += 3); //aに3を足すということ
		System.out.println(a = a + 3); //aに3を足すということ 右辺で計算してから左辺に代入している
		
		//値を1増やす
		a++;
		System.out.println(a);
		
		//値を1減らす
		a--;
		System.out.println(a);
		
		
		//変数の型と値の型が一致しないと代入できない
		int age;
		age = 27;
//		age = 2.7; //エラーが発生する
//		age = "エラーが発生する";
		System.out.println(age);
		
		
		//小さな型の値を大きな型の変数に代入する場合に限っては値が自動的に箱の型に変換されて代入される
		//各数値型の大小関係　　小　byte short int long float double 大
		float f = 3; //float型の変数fにint型の値を代入しているが、int型はfloat型より小さいので自動変換される
		double d = f; //上記と同じで、float方はdouble型より小さいので自動変換される
		System.out.println(f);
		System.out.println(d);
		
		
		//大きな型の値を小さな型の変数に代入しようとするとエラーが発生する
//		int i = 3.2; 
		//ただしbyte型やshort型の変数に数値リテラルを代入できないと困るため
		byte e  = 3;
		System.out.println(e);
		//のようにbyte型やshort型の変数に対して、実害がない範囲のint型リテラルを代入することだけは例外的に認められている
		
		
		//強制的な型変換
		//(int)が強制的な型変換を指示するキャスト演算子(cast operator)
		int age2 = (int)3.2; //3.2はdouble型でありint型より大きい型だが(int)により強制的に型変換している
		System.out.println(age2); //小数点以下の情報は失われて3のみ表示される
		
		
		//異なる型で演算を行う場合は、大きな型に統一されてから演算が行われる
		double h = 8.5 / 2; //2(int型)を2.0(double型)に変換して演算される
		long i = 5 + 2L; //5(int型)を5L(long型)に変換して演算される
		System.out.println(h);
		System.out.println(i);
		
		
		//オペランドが数値型とString型である場合はString型に変換されて連結される
		String msg = "私の年齢は" + 23; //23(int型)が"23"(String型)変換される
		System.out.println(msg);
		
		
		//改行なし画面出力の命令
		String name = "齊藤";
		System.out.print("私の名前は");
		System.out.print(name);
		System.out.print("です");
		
		
		//2つの値を比較して大きい方の数値を代入する
		int j = 5;
		int k = 3;
		int l = Math.max(j, k); //Math.max()は、2つの引数を指定して呼び出す命令
		System.out.println("比較実験:" + j + "と" + k + "とで大きい方は…" + l );
		
		
		//文字列を数値に変換する命令
		String age3 = "27";
		int m = Integer.parseInt(age3); //age3の文字列"27"を27の数値に変換している
		System.out.println("あなたは来年、" + (m + 1) + "歳になりますね。");
		//age3に"こんにちは"のような数字ではない文字列指定するとプログラム実行中にエラーが発生し異常終了する
		
		
		//乱数を発生させる　※乱数とはランダムに違う値を取り出せる
		int r = new java.util.Random().nextInt(90); //90の場合は0以上かつ90未満の整数がランダムにrに代入される
		System.out.println(r);
		
		
		System.out.println("あなたの名前を入力してください");
		String name2 = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int age4 = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ" + age4 + "歳の" + name2 + "さん");
		
		
		//まとめ
		//式
			//式は演算子とオペランドで構成されている
			//リテラルにも型があり、記述方法で決定されている
			//演算子が評価されると、その演算子とオペランドは結果に化ける
			//演算子は優先順位と結合規則に従い評価される
		//型変換
			//大きい変数に小さなデータを代入する際、自動的に型が変換され代入される
			//小さな変数に大きなデータを代入する際、キャスト(強制)することで代入できるが情報の欠損が発生する
			//式が評価される際、大きなデータにそろえるように自動的に型が変換される
		//命令の実行
			//Javaに用意されている、さまざまな命令を実行することができる
		
	}
}