package launcher;

import java.io.IOException;

public class Main {
	public static void main(String[] args){
		System.out.println("start");
		Inlezen i = new Inlezen();
		try {
			i.controleer("test");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
