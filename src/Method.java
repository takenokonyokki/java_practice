public class Method {
	//渡す値を実引数
	//受け取る引数を仮引数
	
	//mainメソッド
	public static void main(String[] args) {
		System.out.println("start");
		hello(); //helloメソッドを呼び出す
		int x = 1000; 
		System.out.println(x); //基本型の変数をメソッド呼出しで渡しても呼出し元であるx = 1000は変化しない
		methodA(x); //methodAを呼出し
		hello("minato"); //引数minatoを渡して、helloメソッドを呼び出す
		hello("saitoh"); //引数saitohを渡して、helloメソッドを呼び出す
		add(100, 20); //2つの引数を渡して、addメソッドを呼び出す
		add(200, 50); //2つの引数を渡して、addメソッドを呼び出す
		int ans = add2(100, 10); //addメソッドの呼出し
		System.out.println("100 + 10 =" + ans);
		System.out.println(add2(add2(10, 20), add2(30, 40)));
		System.out.println(add3(10, 20));
		System.out.println(add3(3.5, 2.7));
		System.out.println(add3("Hello", "World" ));
		int[] array = {1, 2, 3}; //配列変数arrayを宣言＆代入
		incArray(array);
		for (int i : array) {
			System.out.println(i); //配列をメソッド呼び出しで渡すと呼出し元である配列変数arrayの値にも変化が生じる
		}
		printArray(array); //配列変数を渡す（材料）
		int[] array2 = makeArray(3);
		for (int i : array2) {
			System.out.println(i); //array2の全要素を出力
		}
		System.out.println("end");
	}
	
	//helloメソッド
	public static void hello() {
		System.out.println("1");
	}
	
	//methodAメソッド
	public static void methodA(int x) {
		x = 5000;
		System.out.println(x);
		methodB(); //methodBを呼出し
	}
	
	//methodBメソッド
	public static void methodB() {
		System.out.println("methodB");
	}
	
	//helloメソッド引数あり
	public static void hello(String name) { //String nameは文字列変数nameということ
		System.out.println(name + "さん、こんにちは");
	}
	
	//addメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
	
	//add2メソッド
	public static int add2(int x, int y) {
		int ans = x + y;
		return ans; //returnは、メソッドの終了も行っているので、returnの後にコードを書いてもコンパイルエラーになる
	}
	
	//オーバーロード（仮引数の型または数が異なる場合は同じ名前のメソッドが定義できる）
	public static int add3(int x, int y) {
		return x + y;
	}
	public static double add3(double x, double y) {
		return x + y;
	}
	public static String add3(String x, String y) {
		return x + y;
	}
	
	//引数に配列を受け取るメソッド
	public static void printArray(int[] array) { //配列変数array（材料）を受け取る
		for (int element : array) { //拡張for文ですべての要素を表示
			System.out.println(element);
		}
	}
	
	/*配列変数arrayを受け取り、配列内の要素すべてに1を加えるメソッド
	　　配列の場合は、呼出し元の値に変化を加えると、呼出し元の値にも変化が生じる
	　　基本型の場合は、ここのメソッドで変化を加えても、呼出し元の値に変化を生じさせることは無い*/
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	//戻り値が配列の場合のメソッド
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	
	
} 