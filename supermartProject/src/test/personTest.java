package test;

import de.supermartProject.Kassierer;
import de.supermartProject.Mitarbeiter;
import de.supermartProject.Person;

public class personTest {

	public static void main(String[] args) {
		Person ersterPerson = new Mitarbeiter("hhh", "yas", 12);
		Person zweiterPerson = new Kassierer("Miki", "Müller", 21, false);
		
		System.out.println(zweiterPerson);
		ersterPerson.einkaufen();
		zweiterPerson.einkaufen();
	}

}
