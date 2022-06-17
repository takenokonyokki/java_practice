public class Instance {
	public static void main(String[] args) {
		//1.勇者を生成
		Hero h = new Hero("minato"); 
		//2.フィールドに初期値をセット
//		h.name = "minato";
		h.hp = 100;
		System.out.println("HERO" + h.name);
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		
		//3.勇者のメソッドを呼び出していく
		h.sit(5); //5秒座れ
		h.slip(); //転べ
		h.sit(25); //25秒座れ
		h.run(); //逃げろ
	}
}