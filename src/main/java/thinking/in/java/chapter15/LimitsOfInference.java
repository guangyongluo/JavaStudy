package thinking.in.java.chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import net.mindview.util.New;
//: generics/LimitsOfInference.java
import typeinfo.pets.Person;
import typeinfo.pets.Pet;
import typeinfo.pets.Rodent;

public class LimitsOfInference {
	static void f(Map<Person, List<? extends Pet>> petPeople) {
		petPeople.put(new Person("ZhangSan"), Arrays.asList(new Rodent("lwei"), new Rodent()));
		System.out.println(petPeople);
	}

	public static void main(String[] args) {
		f(New.map()); // Does not compile
	}
} /// :~
