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
		ayan.makeBaby(new Person("Alizita Rios", 'F'), "Emi", 'M');
		
	}
}
