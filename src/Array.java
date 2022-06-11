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
		System.out.println("");
		
		int[] arrayA = {1, 2, 3}; //配列変数arrayAに配列を代入
		int[] arrayB; //配列変数arrayBを宣言
		arrayB = arrayA; //arrayBとarrayAは同じ配列を参照する
		arrayB[0] = 100; //arrayBの最初の要素に100を代入
		System.out.println(arrayA[0]); //arrayB = arrayAとなっているため、100が出力される
		//仮にSystem.out.println(arrayA[1])の場合は、2が出力される
		
		
		boolean judge = true;
		if (judge == true) {
			int[] array = {1, 2, 3}; //ブロック内で宣言した変数の寿命はブロックが終了するまでであり、ブロックが終了したら、この変数はメモリから消滅する
			int[] array3 = new int[3]; //newで確保された要素は普通の変数ではないため、ブロックが終了しても寿命は迎えない。その結果、どの配列変数からも参照されない状態でメモリに残ってしまう。
			//残った配列は、Javaのプログラムからどのような方法を使っても読み書きできず事実上メモリ内のゴミになる。
			//このようなゴミが溜まり続けてメモリを圧迫する可能性がある。
		}
		//しかし、Javaには、ガベージコレクションという仕組みが常に動いており、このようなメモリのごみを自動的に探して片づけてくれる
		
		
		//null　「何もない」ということ
		int[] array4 = {1, 2, 3};
		array4 = null; //nullが代入されると、参照型の変数はどこも参照していないことになる。これを参照を切るともいう。　参照型にのみ代入できる。基本型には代入できない。
//		array4[0] = 10; //nullが格納されている配列変数を利用しようとするとエラーが発生する。
		
		//多次元の配列　※業務システムの開発では使う機会は少ない。科学技術計算などで多く利用される
		int[][] scores5 = new int[2][3]; //2次元配列　2の方が行で3の方が列
		scores5[0][0] = 40;
		scores5[0][1] = 50;
		scores5[0][2] = 60;
		scores5[1][0] = 70;
		scores5[1][1] = 80;
		scores5[1][2] = 90;
		System.out.println(scores5[1][1]);
		
		int[][] scores6 = { {40, 50, 60}, {80, 60, 70} }; //このように初期化が可能
		//↑は、40,50,60の3つの要素が入った配列と80,60,70の3つの要素が入った配列の計2つの配列が入っているということ
		System.out.println(scores6.length); //なので、scores6には2つの配列が入っているため2が出力される
		System.out.println(scores6[0].length); //なので、scores6の最初の配列には3つの要素が入っているため3が出力される
 		
	}
}