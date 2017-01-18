package com.lwei.enumrated;

import com.lwei.enumrated.Food.Appetizer;
import com.lwei.enumrated.Food.Coffee;
import com.lwei.enumrated.Food.Dessert;
import com.lwei.enumrated.Food.MainCourse;

public class TypeOfFood {
	public static void main(String[] args) {
		Food food = Appetizer.SALAD;
		food = MainCourse.LASAGNE;
		food = Dessert.GELATO;
		food = Coffee.CAPPUCCINO;
	}
} /// :~
