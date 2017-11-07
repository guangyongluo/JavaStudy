package thinking.in.java.chapter14;
// typeinfo/RegisteredClasses14.java
// TIJ4 Chapter Typeinfo, Exercise 14, page 586
/* A constructor is a kind of factory method. Modify RegisteredFactories.java
* so that instead of using explicit factories, the class object is stored in
* the List, and newInstance() is used to create each object.
*/

import java.util.*;

class Part1 {
	public String toString() {
		return getClass().getSimpleName();
	}
	static List<Class<? extends Part1>> partClasses = 
		new ArrayList<Class<? extends Part1>>();
	static {
		// Collections.addAll() gives an "unchecked generic
		// array creation ... for varargs parameter" warning.
		partClasses.add(FuelFilter1.class);
		partClasses.add(AirFilter1.class);
		partClasses.add(CabinAirFilter1.class);
		partClasses.add(OilFilter1.class);
		partClasses.add(FanBelt1.class);
		partClasses.add(PowerSteeringBelt1.class);
		partClasses.add(GeneratorBelt1.class);
	}
	private static Random rand = new Random();
	public static Part1 createRandom() {
		int n = rand.nextInt(partClasses.size());
		try {
			return partClasses.get(n).newInstance();
		} catch(InstantiationException e) {
			throw new RuntimeException(e);
		} catch(IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	} 
}

class Filter1 extends Part1 {}

class FuelFilter1 extends Filter1 {
	// Create a Class Factory for each specific type:
	public static class Factory implements thinking.in.java.chapter14.Factory<FuelFilter1> {
		public FuelFilter1 create() { return new FuelFilter1(); }
	}
}

class AirFilter1 extends Filter1 {
	public static class Factory implements thinking.in.java.chapter14.Factory<AirFilter1> {
		public AirFilter1 create() { return new AirFilter1(); }
	}
}

class CabinAirFilter1 extends Filter1 {
	public static class Factory implements thinking.in.java.chapter14.Factory<CabinAirFilter1> {
		public CabinAirFilter1 create() { return new CabinAirFilter1(); }
	}
}

class OilFilter1 extends Filter1 {
	public static class Factory implements thinking.in.java.chapter14.Factory<OilFilter1> {
		public OilFilter1 create() { return new OilFilter1(); }
	}
}

class Belt1 extends Part1 {}

class FanBelt1 extends Belt1 {
	public static class Factory implements thinking.in.java.chapter14.Factory<FanBelt1> {
		public FanBelt1 create() { return new FanBelt1(); }
	}
}

class GeneratorBelt1 extends Belt1 {
	public static class Factory implements thinking.in.java.chapter14.Factory<GeneratorBelt1> {
		public GeneratorBelt1 create() { return new GeneratorBelt1(); }
	}
}

class PowerSteeringBelt1 extends Belt1 {
	public static class Factory implements thinking.in.java.chapter14.Factory<PowerSteeringBelt1> {
		public PowerSteeringBelt1 create() { return new PowerSteeringBelt1(); }
	}
}

public class RegisteredClasses14 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
			System.out.println(Part1.createRandom());
	}
}