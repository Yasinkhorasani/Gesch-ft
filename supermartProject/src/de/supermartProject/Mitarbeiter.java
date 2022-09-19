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
	public Mitarbeiter(String vorname, String familienname, long id) {
		super(vorname, familienname);
		this.id = id;
	}

	//********METHODE*********
	@Override
	public void einkaufen() {
		System.out.println(" Alle können einkaufen.Der Mitarbeiter kann zusätzlich einräumen" );
		// super.einkaufen();
	}
	public void einräumen(Person x) {
		System.out.println(" Das regal müss Heute eingerümt werden.");
		super.familienname =familienname ;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	//**********TO-STRING-METHODE**********
	@Override
	public String toString() {
		return vorname +""+ familienname + " [ id=" + id  + "]";
	}
	
	
}
