public class Condtion_repeat {
	public static void main(String[] args) {
		
		//if文
		boolean tenki = false; //true or false
		if (tenki == true) {
			System.out.println("洗濯します");
			System.out.println("散歩に行ます");
		} else {
			System.out.println("DVDを見ます");
		}
		
		
		//while文 　無限ループの止め方はコンソール画面の右上に赤ボタン（終了）を押す
		boolean doorClose = false; //true or false
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
		
		
		// == , != , > , < , >= , <= は関係演算子
		//関係が成立するならtrue(真)false(偽)に化ける
		
		
		//文字列の比較
		//正しい例　if (str.equals("文字列")) {・・・
		//間違った例　if (str == "文字列") {・・・
		//間違った例での==を使用してもコンパイルエラーは起きず実行はできるけどときどき変な動きをするというタチの悪い不具合が起きる
		
		
		//&&(かつ) , ||(または) は論理演算子
		// !　は否定演算子（論理演算子の一種であり、!直後の条件式や値のtrueとfalseを逆転させる機能がある）
		
		
		
		
	}
}