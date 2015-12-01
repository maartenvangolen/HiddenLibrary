package launcher;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead {
	public Object readObject(File bestand) {
		Object objecten = null;
		try {
			FileInputStream fis = new FileInputStream(bestand);
			ObjectInputStream ois = new ObjectInputStream(fis);
			objecten = (Object) ois.readObject();
			fis.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return objecten;
	}
}