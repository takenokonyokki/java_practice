public class Condtion_repeat {
	public static void main(String[] args) {
		
		//if文
		boolean tenki = false; //true or false
		if (tenki == true) {
			System.out.println("洗濯します");
			System.out.println("散歩に行ます");
		} else {
			System.out.println("DVDを見ます");
		}
		
		
		//while文 　無限ループの止め方はコンソール画面の右上に赤ボタン（終了）を押す
		boolean doorClose = false; //true or false
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
		
		
		// == , != , > , < , >= , <= は関係演算子
		//関係が成立するならtrue(真)false(偽)に化ける
		
		
		//文字列の比較
		//正しい例　if (str.equals("文字列")) {・・・
		//間違った例　if (str == "文字列") {・・・
		//間違った例での==を使用してもコンパイルエラーは起きず実行はできるけどときどき変な動きをするというタチの悪い不具合が起きる
		
		
		//&&(かつ) , ||(または) は論理演算子
		// !　は否定演算子（論理演算子の一種であり、!直後の条件式や値のtrueとfalseを逆転させる機能がある）
		
		
		/*switch文：すべての条件式が「変数==値」、「変数==変数」のように左辺と右辺が一致するかを比較する式
				　　であり > , < , != が使われていない。比較する値が整数、文字列または文字であり、小数や真偽値ではない。
		*/
		System.out.println("あなたの運勢を占います");
		int fortune2 = new java.util.Random().nextInt(5) + 1;
		switch(fortune2) {
		case 1:
			System.out.println("大吉");
			break; //breakを書き忘れないように注意
		case 2:
			System.out.println("中吉");
			break; //breakを書き忘れないように注意
		case 3:
			System.out.println("小吉");
			break; //breakを書き忘れないように注意
		case 4:
			System.out.println("吉");
			break; //breakを書き忘れないように注意
		case 5:
			System.out.println("凶");
			break; //breakを書き忘れないように注意
		//default: は条件に合致しないときの処理が不要な場合は省略可能
		}
		//breakは明示的に「処理を中断してswitch文を抜ける」ということであり、break;がないと次のcase文へ処理が進んでしまう
		
		
		//while文
		//前置判定:初めから条件式がfalseだった場合は一度もブロックが実行されない
		int temp = 25;
		while (temp > 25) { 
			temp--; //tempを-1している
			System.out.println(temp);
		}
		
		//後置判定:do-while文 ブロックを実行後に条件判定を行うので、最低1回はブロックを実行することになる
		do {
			temp--;
			System.out.println(temp);
		} while (temp > 25);
		
		
		//for文による繰り返し
		for (int i = 0; i < 3; i++) {
			System.out.println("現在" + (i + 1) + "周目→");
		}
		
		
		//for文による繰り返しをネスト
		for (int i = 1; i < 10; i++) { //1から9まで繰り返し
			for (int j = 1; j < 10; j++) { //1から9まで繰り返し
				System.out.print(i * j);
				System.out.print(" "); //空白を出力
			}
			System.out.println(""); //改行を出力
		}
		//まずiの1×jの1~9までの計算をして改行をして、次にiの2×jの1~9を計算をして・・・を繰り返している
		
		
		//繰り返しの中断
		//break文：繰り返し自体を中断
		//continue文：今の周回を中断して、同じ繰り返しの次の周回に進む
		
		
		//無限ループの作成方法
		//①while (true) {・・・処理・・・}
		//②for (;;) {・・・処理・・・}
		
	}
}