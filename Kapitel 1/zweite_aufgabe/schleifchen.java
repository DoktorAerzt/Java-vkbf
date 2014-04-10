package zweite_aufgabe;

public class schleifchen {
	public static void main (String[] args) {
		int x = 1;
		System.out.println("Vor der Schleife");
		while (x < 4) {
			System.out.println("In der Schleife");
			System.out.println("Der Wert von x ist " + x);
			x = x +1;
		}
		System.out.println("Nach der Schleife");
	}
}
