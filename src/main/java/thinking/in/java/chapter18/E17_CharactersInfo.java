package thinking.in.java.chapter18;

//: io/E17_CharactersInfo.java
/****************** Exercise 17 *****************
* Using TextFile and a Map<Character,Integer>,
* create a program that counts the occurrence of
* all the different characters in a file. (So if
* there are 12 occurrences of the letter 'a' in
* the file, the Integer associated with the Character
* containing 'a' in the Map contains '12').
***********************************************/

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.mindview.util.TextFile;

public class E17_CharactersInfo {
	public static void main(String[] args) {
		Map<Character, Integer> charsStat = new HashMap<Character, Integer>();
		for (String word : new TextFile("E17_CharactersInfo.java", "\\W+"))
			for (int i = 0; i < word.length(); i++) {
				Character ch = word.charAt(i);
				Integer freq = charsStat.get(ch);
				charsStat.put(ch, freq == null ? 1 : freq + 1);
			}
		List<Character> keys = Arrays.asList(charsStat.keySet().toArray(new Character[0]));
		Collections.sort(keys);
		for (Character key : keys)
			System.out.println(key + " => " + charsStat.get(key));
	}
}