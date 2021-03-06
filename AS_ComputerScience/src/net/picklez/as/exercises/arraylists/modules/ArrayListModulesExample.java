package net.picklez.as.exercises.arraylists.modules;

import java.util.ArrayList;

import net.picklez.utils.SystemUtils;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 09:10:51
 */

public class ArrayListModulesExample {

	public static void main(String[] args) {
		ArrayList<Module> modules = new ArrayList<Module>();
		modules.add(new Module("mod1", "Module #001", "...", 1.0));
		modules.add(new Module("mod2", "Module #002", "...", 1.0));
		modules.add(new Module("mod3", "Module #003", "...", 1.0));
		
		for (Module m : modules) {
			SystemUtils.printWithTime(m.asString());
		}
		
		modules.remove(0);
		System.out.println("Removed first module");
		
		for (Module m : modules) {
			SystemUtils.printWithTime(m.asString());
		}
	}
	
}