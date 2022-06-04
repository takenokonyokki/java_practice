public class Formula_operator {
	public static void main (String[] args) {
		int a = 20;
		int b = a + 5;
		System.out.println(a);
		System.out.println(b);
		//a,b,5のことをオペランド（operand）という
		//+,=のことを演算子（operator）という
		
		//数字の５や文字列の"Hello World"などの具体的な値をリテラル（literal）という
		
		System.out.println("私の好きな記号は二重引用符(\")です");
		System.out.println("\\1200"); //¥は\で表示される
		
		System.out.println(9 / 2); //割り算は商となるため整数部分のみ表示
		System.out.println(9.0 / 2); //オペランドのどちらかを小数にすることで計算結果が小数まで表示される
		
		//どちらも同じこと
		System.out.println(a += 3); //aに3を足すということ
		System.out.println(a = a + 3); //aに3を足すということ 右辺で計算してから左辺に代入している
		
		//値を1増やす
		a++;
		System.out.println(a);
		
		//値を1減らす
		a--;
		System.out.println(a);
	}
}