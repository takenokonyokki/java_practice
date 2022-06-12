package main;
import logics.CalcLogic;
public class Calc {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = CalcLogic.tasu(a, b); //2行目でimportしているため、CalcLogic.tasu(a, b)だけで、CalcLogicsクラスのtasu()を呼び出せる
		int delta = logics.CalcLogic.hiku(a, b); //パッケージをimportしてても、パッケージ名を記述して問題ない。書く必要はないが。
		System.out.println("tasu:" + total + ",hiku:" + delta);
	}
}