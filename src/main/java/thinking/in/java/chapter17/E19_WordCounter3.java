//: containers/E19_WordCounter3.java
/****************** Exercise 19 *****************
* Repeat Exercise 13 using a SimpleHashMap.
***********************************************/
package thinking.in.java.chapter17;
import java.util.*;
import net.mindview.util.*;
public class E19_WordCounter3 {
    public static void main(String[] args) {
        List<String> words = new TextFile("src/thinking/in/java/chapter17/Maps.java", "\\W+");
        SimpleHashMap<String,Integer> map = new SimpleHashMap<String,Integer>();
        for(String word : words) {
            Integer freq = map.get(word);
            map.put(word, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
} 
