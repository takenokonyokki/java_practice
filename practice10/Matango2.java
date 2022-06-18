public class Matango2 {
	int hp = 50; //hpフィールド50
	char suffix; //suffixフィールド
	
	//コンストラクタ　引数にsuffix
	public Matango2(char suffix) {
		this.suffix = suffix; //渡された引数をそのまま出力
	}
	
	//attackメソッド 引数Heroクラス型のh
	public void attack(Hero h) {
		System.out.println("kinoko" + " " + this.suffix + " " + "attack");
		System.out.println("10damege");
		h.hp -=  10;
	}
	
}