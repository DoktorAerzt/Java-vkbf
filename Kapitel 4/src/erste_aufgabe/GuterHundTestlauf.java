package erste_aufgabe;

public class GuterHundTestlauf {
	public static void main (String[] args) {
		GuterHund eins = new GuterHund();
		eins.setGr��e(70);
		GuterHund zwei = new GuterHund();
		zwei.setGr��e(8);
		System.out.println("Hund eins: " + eins.getGr��e());
		System.out.println("Hund zwei: " + zwei.getGr��e());
		eins.bellen();
		zwei.bellen();
	}

}
