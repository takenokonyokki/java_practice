public class Thief {
	String name;
	int hp;
	int mp;
	
	public static void main(String[] args) {
		Thief t = new Thief("ryuto", 100, 200);
		System.out.println(t.name + " " + t.hp + " " + t.mp);
		
		Thief t2 = new Thief("moe", 1000);
		System.out.println(t2.name + " " + t2.hp + " " + t2.mp);
		
		Thief t3 = new Thief("choko");
		System.out.println(t3.name + " " + t3.hp + " " + t3.mp);
		
		Thief t4 = new Thief();
		System.out.println(t4.name + " " + t4.hp + " " + t4.mp);
	}
	
	//9-1
	//名前、HP、MPを指定してインスタンス化できる
	public Thief(String name, int hp, int mp) {
		this.name = name; //引数の値でnameフィールドを初期化
		this.hp = hp; //引数の値でhpフィールドを初期化
		this.mp = mp; //引数の値でmpフィールドを初期化
	}
	
	//名前とHPだけ指定してインスタンス化でき、MPは5で初期化する
	public Thief(String name, int hp) {
		this(name, hp, 5); //this()の形で同一クラスの別コンストラクタの呼出しをJVMに依頼している
	}
	
	//名前だけ指定してインスタンス化でき、HPは40、MPは5で初期化する
	public Thief(String name) {
		this(name, 40, 5);
	}
	
	public Thief() {
		this("dame", 2, 2);
	}
}