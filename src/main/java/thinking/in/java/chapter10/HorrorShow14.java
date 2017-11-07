package thinking.in.java.chapter10;
// innerclasses/HorrorShow14.java
// TIJ4 Chapter Innerclasses, Exercise 14, page361
/* Modify interfaces/HorrorShow.java to implement DangerousMonster and
* Vampire using anonymous classes.
*/

interface Monster {
	void menace();
}	

interface DangerousMonster extends Monster {
	void destroy();
}	

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() {}
	public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {}
	public void destroy() {}
	public void kill() {}
	public void drinkBlood() {} 
}

public class HorrorShow14 {
	static void u(Monster b) { b.menace(); }
	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
	static void w(Lethal l) { l.kill(); }
	public DangerousMonster monsterMaker() {
		return new DangerousMonster() {
			public void menace() { System.out.println("DangerousMonster Menace"); }
			public void destroy() { System.out.println("DangerousMonster Destroy"); }
		};
	}
	public Vampire vampireMaker() {
		return new Vampire() {
			public void menace() { System.out.println("Vampire Menace"); }
			public void destroy() { System.out.println("Vampire Destroy"); }
			public void kill() { System.out.println("Vampire Kill"); }
			public void drinkBlood() { System.out.println("Vampire DrinkBlood"); }
		};
	}		
	public static void main(String[] args) {
		HorrorShow14 show = new HorrorShow14();
		show.u(show.monsterMaker());
		show.v(show.monsterMaker());
		show.u(show.vampireMaker());
		show.v(show.vampireMaker());
		show.w(show.vampireMaker());
	}
}