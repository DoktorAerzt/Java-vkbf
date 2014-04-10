package zweite_aufgabe;

public class FilmTestlauf {
	public static void main(String[] args) {
		Film eins = new Film();
		eins.titel = "Von der Krise verweht";
		eins.genre = "Trageisch";
		eins.bewertung = -2;
		
		Film zwei = new Film();
		zwei.titel = "Vier Deadlines und ein Todesfall";
		zwei.genre = "Komödie";
		zwei.bewertung = 5;
		zwei.vorführen();
		
		Film drei = new Film();
		drei.titel = "Byte Club";
		drei.genre = "Tragisch, aber letztendlich aufbauend";
		drei.bewertung = 127;
	}

}
