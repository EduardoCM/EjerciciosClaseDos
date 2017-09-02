package urbanreyes.adan.main;

import urbanreyes.adan.Mobile;
import urbanreyes.adan.Person;

public class Main {
	public static void main(String[] args) {
		Mobile m = new Mobile("Samsumg galaxy s4 mini", 7.1F, 400);
		System.out.println(m);
		m.turnOn();
		m.setFree();
		m.turnOff();
		m.turnOn();
		
		Person ayan = new Person("Ayan Urban", 'M');
		Person s = ayan.makeBaby(new Person("Alizita Rios", 'F'), "Emi", 'F');
		if(s != null) {
			System.out.println("Congratulations " + s.father.getFullName()  + "and " + s.mother.getFullName());
			System.out.println("You have a beatiful " + ((s.getGender() == 'M') ? "boy " : "girl named ") + s.getFullName());
		}
	}
}
