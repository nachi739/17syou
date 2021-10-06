package test01;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("ネコ"); //0
		animals.add("コブタ"); //1
		animals.add("タヌキ"); //2
		animals.add("キツネ"); //3
		animals.set(2,"タテハモドキ"); //2上書き
		animals.add(3,"ジョウビタキ"); //3挿入
		animals.add(3,"キジ"); //3挿入
		for(int i = 0 ; i<animals.size();i++){
		 System.out.print(animals.get(i) + ",");
		}
	}
}
