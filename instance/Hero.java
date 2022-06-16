public class Hero {
	//属性はクラスブロックの中に変数宣言を記述する = フィールドの宣言
	String name;
	int hp;
	Sword sword; //Swordクラス型のsword変数を定義
	
	//眠る sleepメソッド
	public void sleep() {
		this.hp = 100; //自分自身のhpフィールド
		System.out.println(this.name + "sleep life up"); //自分自身のnameフィールド
	}
	
	//座る sitメソッド
	public void sit(int sec) { //何秒座るか引数で受け取る
		this.hp += sec; //座る秒数だけHPを増やす
		System.out.println(this.name + "ha" + sec + "sit");
		System.out.println("HP" + sec + "life up");
	}
	
	//転ぶ slipメソッド
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "slip");
		System.out.println("5damage");
	}
	
	//逃げる runメソッド
	public void run() {
		System.out.println(this.name + "run");
		System.out.println("GAMEOVER");
		System.out.println("HP" + this.hp);
	}
}