//package launcher;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class ObjectRead {
//	public ArrayList readObject(File bestand) {
//		ArrayL objecten = null;
//		try {
//			FileReader fis = new FileReader(bestand);
//			BufferedReader ois = new BufferedReader(fis);
//			objecten = (Object) ois.readLine();
//			fis.close();
//			ois.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return objecten;
//	}
//}