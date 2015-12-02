package launcher;

import java.io.IOException;

public class Main {
	public static void main(String[] args){
		System.out.println("start");
		Inlezen i = new Inlezen();
		i.controleer("boek");
		System.out.println("eind");
//		i.readAll();
	}
}
