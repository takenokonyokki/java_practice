public class Matango {
	int hp;
	final int LEVEL = 10; //finalは値を書き換えることができない定数フィールドとなる。名前は大文字にする。
	char suffix;
	
	public void run() {
		System.out.println("matango" + this.suffix);
	}
}