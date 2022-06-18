public class Main2 {
	//healメソッド
	public static void heal(int hp) {
		hp += 10;
	}
	//healメソッド　オーバーロード 引数が異なる
	public static void heal(Thief thief) {
		thief.hp += 10;
	}
	
	public static void main(String[] args) {
		int hp = 25; //変数baseHpに25を代入
		Thief t = new Thief("asaka", hp); //Thiefインスタンスを生成し、Thiefクラス型の変数tに代入
		heal(hp); //healメソッドを呼出し、引数にint型のbaseHpの25を渡しても呼出し元の値は変化しない
		System.out.println(hp + ":" + t.hp); //よって、baseHpは25　：　t.hpも25となる
		heal(t); //healメソッドを呼出し、引数にThiefクラス型の変数tを渡しているため、変数tが示すアドレスを参照している
		System.out.println(hp + ":" + t.hp); //よって、baseHpは25　：　t.hpは35となる
	}
}