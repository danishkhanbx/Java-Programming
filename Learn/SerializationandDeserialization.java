package Learn;

/* Serialization and De-serialization:-
 * Serialization is the process of converting a java object into a stream of bytes. 
 * This stream of bytes when received by the end-user gets converted to an object and thus the object is easily transferred from one JVM to another.
 * This means that once you have a stream of bytes you can convert it into an object and run it on any kind of environment.
 * The JVM allows special privileges to the class which implements the Serializable Interface.
 * There is a class “ObjectOutputStream” which consists of a method “writeObject”. This method is responsible for converting an object into a stream of Bytes. 
 * A similar class “ObjectInputStream” contains a method readObject(). This method essentially converts the byte stream to an object.
 * Syntax:
   1)  public final void writeObject(<object>) throws IOException
   2)  public final void readObject() throws IOException,ClassNotFoundException
 * Points to remember:
   1. If a parent class has implemented Serializable interface then child class doesn’t need to implement it but vice-versa is not true.
   2. Only non-static data members are saved via Serialization process.
   3. Static data members and transient data members are not saved via Serialization process.So, if you don’t want to save value of a non-static data member then make it transient.
   4. Constructor of object is never called when an object is deserialized.
   5. Associated objects must be implementing Serializable interface. 
 */

import java.io.*;
public class SerializationandDeserialization {
	public static void main(String args[]) throws Exception
	{
		Save obj = new Save();
		obj.i = 4;
// Serialization is a mechanism of converting the state of an object into a byte stream.	
		File f = new File("Obj.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);

// Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj1 = (Save) ois.readObject();
		
		System.out.println("Value of obj1 is "+obj1.i);	
	}
}

class Save implements Serializable
{
	int i;
}