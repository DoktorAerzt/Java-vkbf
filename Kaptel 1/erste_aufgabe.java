
public class erste_aufgabe {
	public static void main (String[] args) {
		System.out.print("Ich herrsche!");
		
		// ### Mach was ###
		int x = 3;
		String name = "Dirk";
		x = x * 17;
		System.out.print("x ist " + x);
		double d = Math.random();
		// das ist ein Kommentar
		System.out.print(d);
		
		// ### Mach was wieder und wieder ###
		while (x > 12) {
			x = x-1;
		}
		for (int y = 0; y < 10; y = y + 1) {
			System.out.print("y ist jetzt " + y);
		}
		
		// ### Mach was, falls ###
		if (x == 10) {
			System.out.print("x ist 10");
		} else {
			System.out.print("ist nicht 10");
		}
		if ((x < 3) & (name.equals("Dirk"))) {
			System.out.println("Vorsicht");
		}
		System.out.print("Diese Zeile wird auf alle F�lle ausgef�hrt.");
	}

}

