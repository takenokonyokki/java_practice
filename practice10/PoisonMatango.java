public class PoisonMatango extends Matango2 {
	//毒を用いた攻撃が可能な残り回数をint	型フィールドであり、初期値は5
	int poisonCount = 5;
	
	//親のMatango2で引数を設定しているコンストラクタがあるため、引数を指定しなければならない
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	
	//Matango2のattackメソッドをオーバーライド
	public void attack(Hero h) {
		super.attack(h); //親(Matango2)のattackメソッドを呼出し
		if (this.poisonCount > 0) { //もし自分自身のインスタンスのpoisonCountが0以上であれば
			System.out.println("さらに毒の胞子をばらまいた");
			int dmg = h.hp / 5; //int型の変数dmgにHeroクラス型の変数hのhpを5で割った値を代入
			h.hp -= dmg; //勇者のHPからdmgの値を引く
			System.out.println(dmg + "ポイントのダメージ");
			this.poisonCount--; //poisonCountの回数を1減らす
		}
	}
}