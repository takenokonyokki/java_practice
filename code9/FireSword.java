public class FireSword {
	public static void main(String[] args) {
		Sword s = new Sword(); //Swordインスタンスを生成し、Sword型の変数sに代入
		s.name = "FireSword"; //変数sのnameに炎の剣を代入
		s.damage = 10; //変数sのdamageに10を代入
		Hero h = new Hero("ryuto"); //Heroインスタンスを生成し、Hero型の変数hに代入
//		h.name = "ryuto"; //変数hのnameに隆斗を代入
		h.hp = 100; //変数hのhpに100を代入
		h.sword = s; //変数hのswordにSword型の変数sを代入
		System.out.println("my weapon is" + " " + h.sword.name);
		//h.swordは変数sの番地が代入されていて、変数sのnameはFireSwordであるため、FireSwordが出力される
	}	
}