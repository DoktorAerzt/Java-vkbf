package erste_aufgabe;

public class GuterHundTestlauf {
	public static void main (String[] args) {
		GuterHund eins = new GuterHund();
		eins.setGröße(70);
		GuterHund zwei = new GuterHund();
		zwei.setGröße(8);
		System.out.println("Hund eins: " + eins.getGröße());
		System.out.println("Hund zwei: " + zwei.getGröße());
		eins.bellen();
		zwei.bellen();
	}

}
