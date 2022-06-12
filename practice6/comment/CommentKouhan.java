package comment;
public class CommentKouhan {
	public static void callDeae() {
		System.out.println("deae");
	}
	public static void showMondokoro() throws Exception {
		System.out.println("kakusan");
		System.out.println("mondokoro");
		Thread.sleep(3000); //3秒停止
		CommentZenhan.doTogame();
	}
}