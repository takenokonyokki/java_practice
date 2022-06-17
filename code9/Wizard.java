public class Wizard {
	String name; //Stringクラス型の変数nameを定義
	int hp; //int型の変数hpを定義
	public void heal(Hero h) { //引数はHero型
		h.hp += 10; //HeroのHPを10加える　+=演算子は変数hのhpと10を足して、変数hに代入している
		System.out.println(h.name + "HP+10" + "=" + h.hp);
	}
	
	public static void main(String[] args) {
		Hero h1 = new Hero("ryuto"); //Heroインスタンスを生成し、Hero型の変数h1に代入
//		h1.name = "ryuto"; //変数h1のnameにryutoを代入
		h1.hp = 100; //変数h1のhpに100を代入
		Hero h2 = new Hero("moe"); //2つ目のHeroインスタンスを生成し、Hero型の変数h2に代入
//		h2.name = "moe"; //変数h2のnameにmoeを代入
		h2.hp = 100; //変数h2のhpに100を代入
		Wizard w = new Wizard(); //Wizardインスタンスを生成し、Wizard型の変数wに代入
		w.name = "choko"; //変数wにchokoを代入
		w.hp = 50; //変数wのhpに50を代入
		w.heal(h1); //Wizardクラスである変数wからhealメソッドを呼出し、Hero型の引数h1を渡しているため、ryutoのhpに+10する。結果ryutoのhp100に+10されて110となる。、
		w.heal(h2); //Wizardクラスである変数wからhealメソッドを呼出し、Hero型の引数h2を渡し、moeのhp100に+10して、結果hpが110になる。
		w.heal(h2); //h2は2回目のhealメソッドになるため、上記でhpは110になっているため、110に+10して、結果hp120になる。
	}
}