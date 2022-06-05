public class Practice3 {
	public static void main(String[] args) {
		//3-1
		//①weight == 60
		//②(age1 + age2) * 2 > 60
		//③age %2 == 1 演算子%は割った後の余りを表示するので、ageを2で割った後に1が余れば奇数と判断できる
		//④name.equals("湊")
		
		//3-3
		int isHungry = 0;
		String food = "ラーメン";
		System.out.println("こんにちは");
		if(isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("腹ペコです");
		}
		if(isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
		
		//3-4
		boolean tenki = false;
		if (tenki == true) {
			System.out.println("洗濯します");
			System.out.println("散歩しに行きます");
		} else {
			System.out.println("DVDを見ます");
			System.out.println("寝ます");
		}
		
		//3-5
		System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}
		
		//3-6
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (ans == num) {
				System.out.println("アタリ!");
				break;
			} else { 
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
		
	}
}