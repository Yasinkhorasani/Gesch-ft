package de.supermartProject;

/**
 * Sub-klasse Kassiere, die von der Klasse Mitarbeiter erbt wird hier demonstriert
 * 
 * Durch FINAL Schlüsselwort wird die Spizialisierung Klasse "Kassiere" durch Sub-Klasse verboten
 * @author Yasin
 *
 */
public final class Kassierer extends Mitarbeiter {
	
	
	//*******Atribut***********
	private boolean zugangsKasse ;
	
	
	// *****konstuktor*******
	public Kassierer (String gender,String name,long id,boolean zugangsKasse) {
		super(gender, name, id);
		this.zugangsKasse = zugangsKasse;
	}
	
	//*******METHODE*********
	/**
	 * überschreibt die Methode von Object Mitarbeiter
	 */
	@Override
	public final void einkaufen() {
		System.out.println("Alle können einkaufen  und der Mitarbeiter können einräumen. "
				+ "Der kassierer können zusätzlich kassieren");
	}
	
	public void geldKassieren() {
	System.out.println("Jeder kann an der Kasse bezahlen");
	}
	
	//*******SETTER/GETTER*****
	public boolean isZugangsKasse() {
		return zugangsKasse;
		
	}
	public void setZugangsKasse(boolean zugangsKasse) {
		this.zugangsKasse = zugangsKasse;
		if (zugangsKasse) {
			System.out.println("sie haben erlaubniss")
		}
	
	}
	
	
}
