package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class DataExt implements Externalizable {
	int age;
	int id;
	String name;
	String userId;

	public DataExt() {

		System.out.println("No Arg constructor is callled");
	}

	public DataExt(int age, int id, String name, String userId) {
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.age = age;
		
		System.out.println("arg cont is called");

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(age);
		out.writeInt(id);
//		out.writeObject(name);
		out.writeObject(userId);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		age = in.readInt();
		id = in.readInt();
	//name = (String) in.readObject();
		userId = (String) in.readObject();
	}

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("xyz.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			DataExt dataExt = new DataExt();
			dataExt.age = 20;
			dataExt.id = 213;
			dataExt.name = "manish";
			dataExt.userId = "manish123";
			os.writeObject(dataExt);
			os.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream  fiStream= new FileInputStream("xyz.txt");
			ObjectInputStream oos= new ObjectInputStream(fiStream);
			DataExt data= (DataExt)oos.readObject();
			oos.close();fiStream.close();
			System.out.println(data.age);
			System.out.println(data.id);
			System.out.println(data.name);
			System.out.println(data.userId);
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}

}
