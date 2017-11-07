package thinking.in.java.chapter18;

import static net.mindview.util.Print.print;

//: io/E16_UsingAllRandomAccessFile.java
/****************** Exercise 16 *****************
* Look up RandomAccessFile in the JDK
* documentation. Starting with
* UsingRandomAccessFile.java, create a program
* that stores and then retrieves all the different
* possible types provided by the RandomAccessFile
* class. Verify that the values are stored and
* * retrieved accurately.
***********************************************/
import java.io.IOException;
import java.io.RandomAccessFile;

public class E16_UsingAllRandomAccessFile {
	static String file = "rtest.dat";

	static void display() throws IOException {
		RandomAccessFile rf = new RandomAccessFile(file, "r");
		print(rf.readBoolean());
		print(rf.readByte());
		print(rf.readUnsignedByte());
		print(rf.readChar());
		print(rf.readFloat());
		print(rf.readLong());
		print(rf.readInt());
		print(rf.readShort());
		print(rf.readUnsignedShort());
		print(rf.readDouble());
		print(rf.readUTF());
		rf.close();
	}

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile(file, "rw");
		rf.writeBoolean(true);
		rf.writeByte(100);
		rf.writeByte(255);
		rf.writeChar('A');
		rf.writeFloat(1.41413f);
		rf.writeLong(1000000000L);
		rf.writeInt(100000);
		rf.writeShort(30000);
		rf.writeShort(65535);
		rf.writeDouble(3.14159);
		rf.writeUTF("The end of the file");
		rf.writeUTF("test");
		rf.close();
		display();
		rf = new RandomAccessFile(file, "rw");
		rf.seek(3); // 1 boolean + 2 bytes
		rf.writeChar('B');
		display();
		rf.close();
		System.out.println("==========================");
		rf = new RandomAccessFile(file, "rw");
		// rf.seek(33);
		// short s = rf.readShort();
		// System.out.println(s);
		rf.seek(54);
		rf.writeUTF("luowei");
		rf.seek(0);
		print(rf.readBoolean());
		print(rf.readByte());
		print(rf.readUnsignedByte());
		print(rf.readChar());
		print(rf.readFloat());
		print(rf.readLong());
		print(rf.readInt());
		print(rf.readShort());
		print(rf.readUnsignedShort());
		print(rf.readDouble());
		print(rf.readUTF());
		print(rf.readUTF());

	}
}
