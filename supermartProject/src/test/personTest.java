package test;

import java.util.Scanner;

import de.supermartProject.Dieb;
import de.supermartProject.Geschäft;
import de.supermartProject.Kassierer;
import de.supermartProject.Mitarbeiter;
import de.supermartProject.Person;

public class personTest {

	
	public static void main(String[] args) {
		System.out.println(" Hier ist unserer Supermarkt.");
		System.out.println("--------------------------------");
		//*****Klass PERSON*****
		Person person = new Person();
		person.setVorname(" Peter");
		person.setFamilienname(" Becker");
		System.out.println(person + " ist der Chef in unserem Geschäft.");
		person.einkaufen();
		System.out.println("--------------------------------");
		
		//*****Klass MITARBEITER*****
		System.out.println(" Wir haben Drei Mitarbeiter\n");
		Person[] mitarbeiter = new Mitarbeiter[3];
		mitarbeiter[0] = new Mitarbeiter(" Beate ", "Volk", 12);
		mitarbeiter[1] = new Mitarbeiter(" Jimi  ", "Anderson", 13);
		mitarbeiter[2] = new Mitarbeiter(" niki ", "Schmidt", 14);
		for (int i = 0; i< mitarbeiter.length ; i++) {
			System.out.println(mitarbeiter[i]);
		}
		Mitarbeiter mitarbeiter1 = new Mitarbeiter(null, null, 0);
		mitarbeiter1.einkaufen(); //Override
		mitarbeiter1.einräumen(mitarbeiter[0]);
		
		System.out.println("--------------------------------");
		
		//*****Klass KASSIERER*****
		Kassierer zweiterPerson = new Kassierer(" Miki ", "Müller ", 21);
		System.out.println(zweiterPerson + " ist unere neue Mitarbeiter und Kassirer.");
		zweiterPerson.setId(22);;
		zweiterPerson.einkaufen(); //Override
		
		System.out.println("--------------------------------");
		
		//*****klasse Dieb******
		Dieb dieb = new Dieb(" Herr", " Unbekannt", false);
		System.out.println(" Herr" + dieb.getFamilienname() + " unserer Kunde");
		if(dieb.setKlauen(true)) {
			System.out.println(" Der Person ist ein Dieb");
		}
		dieb.einkaufen(); //Override
		
		System.out.println("--------------------------------");
		//************
		Geschäft suparmarkt = new Geschäft();
		Person person1 = suparmarkt.beobachten();
		Dieb dieb1 = suparmarkt.beobachten();
		
		System.out.println(" wer ist der Person ?");
		Scanner person2 = new Scanner(System.in);
		String newPerson;
		
		

		
		 
	}
}
