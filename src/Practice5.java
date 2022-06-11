public class Practice5 {
	public static void main(String[] args) {
		//5-1
		introduceOneself();
		
		//5-2
		String title = "紅";
		String addres = "kurenai.com";
		String text = "XJapan";
		email(title, addres, text);
		
		//5-3
		email(addres, text);
		
		//5-4
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積：" + triangleArea + "平方cm");
		
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積:" + circleArea + "平方cm");
	}

	//5-1
	public static void introduceOneself() {
		String name = "saitoh ryuto";
		int age = 27;
		double height = 164.4;
		char earthly_branches = '亥';
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age);
		System.out.println("身長は" + height);
		System.out.println("十二支は" + earthly_branches);
	}
	
	//5-2
	public static void email(String title, String addres, String text) {
		System.out.println(addres + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文" + text);
	}
	
	//5-3
	public static void email(String addres, String text) {
		System.out.println(addres + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文:" + text);
	}
	
	//5-4
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}