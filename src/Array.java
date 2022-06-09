public class Array {
	public static void main(String[] args) {
		//int[] scores; //配列の変数宣言
		//scores = new int[5]; //int型の要素を5個作り、配列変数scoresに代入
							   //new演算子は、指定された型の要素を[]内に指定された数だけ作成する
		
		int[] scores = new int[5]; //宣言と代入を同時に行う
		int num = scores.length; //配列の要素数を取得
		System.out.println("要素の数：" + num);
		
		scores[1] = 30; //配列の2つ目の要素に30を代入　※配列の最初の要素は0番であり、[1]は2つ目の要素になる
		System.out.println(scores[1]);
		
		//変数の値を取り出す前には、必ず値を代入して初期化しなければならない
		//初期化とは、変数の宣言と同時に値を格納すること。 「変数宣言」にて「int i = 100;」のように値を格納すること
		
		//配列の要素は自動的に初期化される
		System.out.println(scores[0]); //自動的にすべて0で初期化される
		
		//配列作成と初期化の省略記法
		//①
		int[] scores1 = new int[] {20, 30, 40, 50, 80};
		//②
		int[] scores2 = {20, 30, 40, 50, 80}; //ここを修正するだけでよい
		
		
		int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4]; //配列の要素は0からなので注意
		int avg = sum / scores.length;
		System.out.println("合計点：" + sum);
		System.out.println("平均点" + avg);
		
		
		//配列の最初から最後までの全要素を順にアクセスするのが最もよく用いられるパターン
		for (int i = 0; i < scores2.length; i++) {
			System.out.println(scores2[i]); //変数iは添え字　ループのたびにiの値が0～4で変化する
		}
		
		sum = 0; //変数sumに集計結果を入れるために0で初期化して準備
		for (int i = 0; i < scores2.length; i++) { //for文
			sum += scores2[i]; //+=で1科目ずつ変数sumに合算する
		}
		avg = sum / scores2.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg); 
		
		int count = 0;
		for (int i = 0; i < scores2.length; i++) {
			if (scores2[i] >= 50) {
				count++; //配列の要素は0からのため、1をプラスしておく
			}
		}
		System.out.println("50点以上の科目の数は：" + count);
		
		
		int[] seq = new int[10];
		//塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		//生成した塩基配列の記号を表示
		for (int i = 0; i < seq.length; i++) {
			//switch文の場合
			switch (seq[i]) {
			case 0:
				System.out.print("A ");
				break;
			case 1:
				System.out.print("T ");
				break;
			case 2:
				System.out.print("G ");
				break;
			case 3:
				System.out.print("C ");
				break;
			}
		}
		System.out.println(""); //改行
		
		//switch文をシンプルにした場合
		for (int i = 0; i < seq.length; i++) {
			char[] base = {'A', 'T', 'G', 'C'};
			//char[] base = {'A', 'T', 'G', 'C'};は3つの処理に分けられる
			//int baseType = seq[i]; i番目の数値を取得
			//char baseChar = base[baseType]; 数値に対応する記号を取得
			//System.out.print(baseChar + " "); 記号を画面に表示
			System.out.print(base[seq[i]] + " ");
		}
		System.out.println("");
		//for文と拡張for文
		//従来のfor文
		for (int i = 0; i < scores2.length; i++) {
			System.out.print(scores2[i] + " ");
		}
		System.out.println("");
		//拡張for文 ループ変数や添え字を記述する必要がない
		for (int value : scores2) {
			System.out.print(value + " ");
		}
		
	}
}