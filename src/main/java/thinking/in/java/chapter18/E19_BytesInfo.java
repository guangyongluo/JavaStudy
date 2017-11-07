package thinking.in.java.chapter18;

//: io/E19_BytesInfo.java
/****************** Exercise 19 *****************
* Using BinaryFile and a Map<Byte,Integer>, create
* a program that counts the occurrence of all the
* different bytes in a file.
***********************************************/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.mindview.util.BinaryFile;

public class E19_BytesInfo {
	public static void main(String[] args) throws IOException {
		Map<Byte, Integer> bytesStat = new HashMap<Byte, Integer>();
		for (Byte bt : BinaryFile.read("bin/thinking/in/java/chapter18/E19_BytesInfo.class")) {
			Integer freq = bytesStat.get(bt);
			bytesStat.put(bt, freq == null ? 1 : freq + 1);
		}
		List<Byte> keys = new ArrayList<Byte>(bytesStat.keySet());
		Collections.sort(keys);
		for (Byte key : keys)
			System.out.println(key + " => " + bytesStat.get(key));
	}
}
