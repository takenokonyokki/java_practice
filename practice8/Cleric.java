import java.util.*; //java.utilパッケージを全てインポート
//8-1
public class Cleric {
	
	//8-2
	String name = "ryuto";
	int hp = 50;
	final int maxhp = 50;
	int mp = 10;
	final int maxmp = 10;
	
	//8-3
	public void slefAid() {
		System.out.println(this.name + "セルフエイドを唱えた");
		this.mp -= 5;
		this.hp = this.maxhp;
		System.out.println("HPは最大まで回復した");
	}
	
	//8-4
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間祈った");
		
		int recover = new Random().nextInt(3) + sec;
		
		int recoverActual = Math.min(this.maxhp - this.mp, recover);
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}