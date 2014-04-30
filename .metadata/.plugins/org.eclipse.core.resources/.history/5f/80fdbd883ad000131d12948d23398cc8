package erste_aufgabe;

public class EinfachesDotCom {

	private int anzahlTreffer;
	private int[] Zellorte;
	public void setZellorte(int[] orte) {
		Zellorte = orte;
	}

	public String prüfDich(String stringTipp) {
		
		int tipp = Integer.parseInt(stringTipp);
		
				String ergebnis = "Vorbei";
				
				for (int zelle : Zellorte) {
					if (tipp == zelle) {
						ergebnis = "Treffer";
						anzahlTreffer++;
						break;
					}
				}
				if (anzahlTreffer == Zellorte.length) {
					ergebnis = "Versenkt";
					
				}
				System.out.println(ergebnis);
				return ergebnis;
	}
}


