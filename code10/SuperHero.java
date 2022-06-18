//継承　extends
/*class SuperHero extends Heroとは、HeroクラスをベースにしてSuperHeroクラスを定義している
  ので、Heroと同じメンバの定義は省略します（違うところだけ記述します）という意味になる*/
//なので、SuperHeroクラスは、Heroクラスのメンバ（クラスに宣言された	フィールドとメソッド)は全て持っていることになる。
public class SuperHero extends Hero {
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("fly");
	}
	public void land() {
		this.flying = false;
		System.out.println("land");
	}
	
	//親クラス(Heroクラス)に定義してあるものでも、子クラス(SuperHeroクラス)で再定義して上書きできる
	//上書きすることをオーバーライドという
	//フィールドはオーバーライド禁止
	public void run() {
		System.out.println("pullout");
	}
	
	//super：親インスタンス部分のメソッドを呼び出したり、フィールドを利用することができる
	public void attack(Matango m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}
}