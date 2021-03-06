package net.picklez.as.exercises.arraylists.modules;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 09:12:08
 */

public class Module {

	private String moduleName;
	private String moduleDescription;
	private String moduleCreator;
	private double moduleVersion;
	
	public Module(String name, String desc, String creator, double version) {
		this.moduleName = name;
		this.moduleDescription = desc;
		this.moduleCreator = creator;
		this.moduleVersion = version;
	}
	
	public void setName(String s) {
		this.moduleName = s;
	}
	
	public void setDescription(String s) {
		this.moduleDescription = s;
	}
	
	public void setCreator(String s) {
		this.moduleCreator = s;
	}
	
	public void setVersion(double d) {
		this.moduleVersion = d;
	}
	
	public String getName() {
		return this.moduleName;
	}
	
	public String getDescription() {
		return this.moduleDescription;
	}
	
	public String getCreator() {
		return this.moduleCreator;
	}
	
	public double getVersion() {
		return this.moduleVersion;
	}
	
	public String asString() {
		return StringUtils.formatString("Module[Name='{0}', Description='{1}', Creator='{2}', Version='{3}']", this.moduleName, this.moduleDescription, this.moduleCreator, this.moduleVersion);
	}
}
