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
		System.out.println("run");
		System.out.println("GAMEOVER");
		System.out.println("HP");
	}
	
	//攻撃　attackメソッド
	public void attack(Matango m) {
		System.out.println("attack");
		m.hp -= 5;
		System.out.println("5damage");
	}
	
	//Heroメソッド 引数にString nameとすることで、文字列を1つ受け取れるようになり、Heroクラス型のインスタンスが生成されたときにnameの初期値も指定できるようになった。
	public Hero(String name) { //このHeroメソッドは特別で、Heroクラス型のインスタンスが生成された直後に(new Hero();)自動的に実行される
		this.hp = 100; //よって、Heroクラス型のインスタンスが生成された直後にhpフィールドにHP100が代入される。そのため、mainメソッド側でhpを初期化する必要はない。
		this.name = name; //引数の値でnameフィールドを初期化
	//このようなメソッドのことをコンストラクタという。
	/*コンストラクタとみなされる条件
	  ①メソッド名がクラス名と完全に等しい
	  ②メソッド宣言に戻り値が記述されていない(voidもダメ)*/
	//Heroクラスなので、public Hero()の形となる。Swordクラスでコンストラクタを定義するには、public Sword()になる。
	//コンストラクタを直接呼び出すことはできない。あくまでJVMがHero()というコンストラクタを実行してくれる
	}
	
	//コンストラクタのオーバーロード オーバーロードとは、同じ名前だが異なるメソッドを複数定義できる
	public Hero() {
		//this.Hero("ダミー"); この記述はエラーが出る。なぜなら、コンストラクタを直接呼び出せるのはJVMだけだから。
		this("ダミー"); //this(引数)の記述方法なら、同一クラスの別コンストラクタを呼び出せる。ただし、this.メンバ名とは別物になる。
	}
}