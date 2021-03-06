package net.picklez.as.exercises.arraylists;

import java.util.ArrayList;

/**
 * @author Ben Pickering
 * @since 3 Dec 2015 | 11:25:52
 */

public class SwitchingValues {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("four");
		array.add("score");
		array.add("and");
		array.add("seven");
		array.add("years");
		array.add("ago");
		array.add("wagwan"); // - proof it works with an odd number

		for (int i = 0; i < array.size(); i++) {
			if (i % 2 == 0) {
				if (i < array.size() - 1) {
					String s = array.get(i);
					array.set(i, array.get(i+1));
					array.set(i+1, s);
				}
			}
		}

		for (String s : array)
			System.out.println(s);
	}

}