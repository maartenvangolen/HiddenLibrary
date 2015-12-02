package launcher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead {
	public Object readObject(File bestand) {
		Object objecten = null;
		try {
			FileReader fis = new FileReader(bestand);
			BufferedReader ois = new BufferedReader(fis);
			objecten = (Object) ois.readLine();
			fis.close();
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return objecten;
	}
}