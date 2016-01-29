package task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Administration {
	private String path;

	public Administration(String path) {
		this.path = path;
	}

	public void writeObject(Object o) {
		try {
			ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(path));
			ois.writeObject(o);
			ois.flush();
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Object readObject() {
		Object objecten = null;
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			objecten = ois.readObject();
			fis.close();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return objecten;
	}
}
