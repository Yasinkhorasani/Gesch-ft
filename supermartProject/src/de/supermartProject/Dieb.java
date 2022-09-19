package de.supermartProject;
/**
 * Die Sub-Klasse Dieb, die von der Klasse Person erbt wird demonstriert
 * @author Yasin
 *
 */
public class Dieb extends Person {

	protected boolean klauen;
	
	
	public Dieb(String gender, String name, boolean klauen) {
		super(gender, name);
		this.klauen = klauen;
	}



	/**
	 * Überschreibt direct die Methode von Object Person
	 */
	@Override
	public final void einkaufen() {
		System.out.println(" Der leider Hat Hausverbot!!!!");
	}
	
 

//*******SETTER/GETTER*******
	
	public boolean isKlauen() {
		return klauen;
	}

	public boolean setKlauen(boolean klauen) {
		
		return this.klauen = klauen;
	}


	@Override
	public String toString() {
		return "Dieb [klauen=" + klauen + "]";
	}
}
