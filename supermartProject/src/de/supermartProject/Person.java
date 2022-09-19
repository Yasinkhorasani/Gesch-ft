package de.supermartProject;

/**
 *  die Super-klasse PERSON
 * @authorYasin
 *
 */

public class Person {

	//******ATRIBUTE*******
	protected String vorname;
	
	protected String familienname;

	
	//*********KONSTRUKTUR*********
	public Person(String vorname, String familienname) {
		super();
		this.vorname = vorname;
		this.familienname = familienname;
	}

	public Person() {
		super();
	}

	/**
	 * methode einkaufen die überschrieben wird
	 */
	public void einkaufen() {
		System.out.println(" Alle können einkaufen soger der Chef." + Person.this);
	}


	//**********SETTER/GETTER*********
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getFamilienname() {
		return familienname;
	}

	public void setFamilienname(String familienname) {
		this.familienname = familienname;
	}

	//*****TO_STRING METHODE********
	@Override
	public String toString() {
		return vorname + familienname;
	}


	
	
	
}
