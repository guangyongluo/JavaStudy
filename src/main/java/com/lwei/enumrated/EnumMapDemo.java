package com.lwei.enumrated;

import java.util.EnumMap;
import java.util.Map;

enum Action {
	TURN_LEFT, TURN_RIGHT, SHOOT
}

public class EnumMapDemo {

	public static void main(String[] args) {
		Map<Action, String> map = new EnumMap<Action, String>(Action.class);

		map.put(Action.SHOOT, "射击");
		map.put(Action.TURN_LEFT, "向左转");
		map.put(Action.TURN_RIGHT, "向右转");

		for (Action action : Action.values()) {
			System.out.println(map.get(action));
		}
	}

}
