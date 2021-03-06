package thinking.in.java.chapter19;

//: enumerated/E03_Meal.java
/****************** Exercise 3 *****************
* Add a new Course to Course.java and demonstrate
* that it works in Meal.java.
***********************************************/

import net.mindview.util.Enums;

interface Food {
	enum Appetizer implements Food {
		SALAD, SOUP, SPRING_ROLLS;
	}

	enum Beverage implements Food {
		BEER, VINE, JUICE, COLA, WATER;
	}

	enum MainCourse implements Food {
		LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALOO;
	}

	enum Dessert implements Food {
		TIRAMISU, GELATO, BLACK_FOREST_CAKE, FRUIT, CREME_CARAMEL;
	}

	enum Coffee implements Food {
		BLACK_COFFEE, DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCCINO, TEA, HERB_TEA;
	}
}

enum Course {
	APPETIZER(Food.Appetizer.class), MAINCOURSE(Food.MainCourse.class), BEVERAGE(Food.Beverage.class), DESSERT(
			Food.Dessert.class), COFFEE(Food.Coffee.class);
	private Food[] values;

	private Course(Class<? extends Food> kind) {
		values = kind.getEnumConstants();
	}

	public Food randomSelection() {
		return Enums.random(values);
	}
}

public class E03_Meal {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (Course course : Course.values()) {
				Food food = course.randomSelection();
				System.out.println(food);
			}
			System.out.println("---");
		}
	}
}
