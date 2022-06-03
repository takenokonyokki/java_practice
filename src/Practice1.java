/*Javaでプログラムを開発するためには、コンパイラとインタプリタというソフトウェアが必要です。
コンパイラは、私たちがJavaの文法に沿って記述したソースコードをバイトコードに変換してくれます。
インタプリタは内部に持っているJVM(Java Virtual Machine)のしくみをを使ってこれを解釈し、
マシン後に変換してCPUに送り、CPUは命令を実行します。
*/

public class Practice1 {
	public static void main (String[] args) {
		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println(c);
		
		boolean truth = true;
		char run = '駆';
		double PI = 3.14;
		long life = 314159265859379L;
		String damage = "ミナトの攻撃！敵に15ポイントのダメージを与えた。";
		System.out.println(damage);
	}
}