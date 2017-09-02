package urbanreyes.adan.main;

import urbanreyes.adan.Mobile;

public class Main {
	public static void main(String[] args) {
		Mobile m = new Mobile("Samsumg galaxy s4 mini", 7.1F, 400);
		System.out.println(m);
		m.turnOn();
		m.setFree();
		m.turnOff();
		m.turnOn();
	}
}
