package de.supermartProject;


/**
 * Sub-Klasse Mitarbeiter, die von Klasse Person erbt wird hier demonstriert  
 * @author Yasin
 *
 */
public class Mitarbeiter extends Person  {
	
	//*******ATRIBUTE*********
	protected long id;

   
   //********Konstructor*******
public Mitarbeiter(String gender, String name, long id) {
	super();
	this.id= id;
}
	//********METHODE*********
	@Override
	public void einkaufen() {
		System.out.println("Alle können einkaufen.Der Mitarbeiter kann zusätzlich einräumen");
	}
	
	//**********TOSTRING-METHODE**********
	public String toString() {
		return gender +""+ name+""+ id;
	}
	
}
