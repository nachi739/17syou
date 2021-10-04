package code17_08;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello world!");
		} catch (Exception e) {
			System.out.println("何らかのエラーが発生しました。");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				;
			}
		}
	}
}
