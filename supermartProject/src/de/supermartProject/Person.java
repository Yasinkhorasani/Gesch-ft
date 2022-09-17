package de.supermartProject;

/**
 *  die Super-klasse PERSON
 * @authorYasin
 *
 */

public class Person {

	//******ATRIBUTE*******
	protected String gender;
	
	protected String name;

	
	//*********KONSTRUKTUR*********
	public void person(String gender, String name) {
		this.gender = gender;
		this.name = name;	
	}
	
	/**
	 * methode einkaufen die überschrieben wird
	 */
	public void einkaufen() {
		System.out.println("Alle können einkaufen");
	}
	
	//**********SETTER/GETTER*********
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//******TO-String-Methode**********
	public String tostring() {
		return gender + name;
	}
}
