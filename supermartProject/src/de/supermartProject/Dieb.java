package de.supermartProject;
/**
 * Die Sub-Klasse Dieb, die von der Klasse Person erbt wird demonstriert
 * @author Yasin
 *
 */
public class Dieb extends Person {

	protected boolean klauen;
	
	/**
	 * Überschreibt direct die Methode von Object Person
	 */
	@Override
	public final void einkaufen() {
		System.out.println("Alle können einkaufen");
	}
	
   //*******SETTER/GETTER*******
	
	public boolean isKlauen() {
		return klauen;
	}

	public void setKlauen(boolean klauen) {
		this.klauen = klauen;
	}
}
