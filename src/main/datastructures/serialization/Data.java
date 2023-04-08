package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Data implements Serializable{
	
	static int a=100;
	transient int b=200;
	
	public static void main(String[] args) {
	try {
		FileOutputStream fos= new FileOutputStream("abc.txt");
		ObjectOutputStream stream= new ObjectOutputStream(fos);
		stream.writeObject(new Data());
		stream.close();
		fos.close();
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	Data d=null;
	d.a=1129;
	try {
		FileInputStream fis= new FileInputStream("abc.txt");
		ObjectInputStream is= new ObjectInputStream(fis);
		d=(Data)is.readObject();
		
		System.out.println(d.a);
		System.out.println(d.b);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	
	}
}
