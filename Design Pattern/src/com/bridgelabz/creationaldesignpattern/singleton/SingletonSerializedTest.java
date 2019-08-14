package com.bridgelabz.creationaldesignpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
*serialize an object of a singleton class. 
*Then if you de-serialize that object it will create a new instance and 
*hence break the singleton pattern.
*/
public class SingletonSerializedTest {
	public static void main(String[] args) {
		SerializedSingleton instance1 = SerializedSingleton.getInstance();
		SerializedSingleton instance2 = SerializedSingleton.getInstance();
		System.out.println("----With normal Singleton----");
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("newfile.txt"));
			out.writeObject(instance1);
			out.close();

			// deserailize from file to object
			ObjectInput input = new ObjectInputStream(new FileInputStream("newfile.txt"));
			SerializedSingleton newInstance2 = (SerializedSingleton) input.readObject();
			input.close();
			System.out.println("----With Serialization----");
			System.out.println(instance1.hashCode());
			System.out.println(newInstance2.hashCode());

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

/*
 * To overcome this issue, we have to implement method readResolve() method.
 * SEE THE SerializedSingleton Class NOW
 */
