package sechste_aufgabe;

public class phraseomat {
	public static void main (String[] args) {
		
		//drei Wortgruppen erstellen, aus denen ausge�hlt wird
		String[] wortListeEins = { "verl�ssliche" , "erfolgsorientierte" , "webbasiert", "allumfassende", "clevere",
								"kundenorientierte", "pfadkritische", "dynamische", "konkurrenzf�hige", "verteilte", 
								"zielgerichtete"};
		String[] wortListeZwei = { "gepowerte ", "haftende ", "Mehrwert-", "zentrierte ", "geclusterte ", "proaktive ",
								"Out-of-the-Box-", "positionsierte ", "vernetzte ", "fokussierte ", "kraftvolle ", "geordnete ",
								"geteilte ", "kooperative ", "beschleunigte ", "Multi-Tier-", "Enterprise-", "B2B-", "Frontend-"};
		String[] wortListeDrei = {"Schicht", "Endstufe", "L�sung", "Architektur", "Kernkompetenz", "Strategie", "Kooperation",
								"Ausrichtung", "R�umlichkeit", "Vision", "Dimension", "Mission"};
		
		// ermitteln, wie viele W�rter sich in jeder Liste befinden
		int einsL�nge = wortListeEins.length;
		int zweiL�nge = wortListeZwei.length;
		int dreiL�nge = wortListeDrei.length;
		
		//drei Zufallszahlen generieren, um W�rter aus den Listen herauszuziehen
		int rand1 = (int) (Math.random() * einsL�nge);
		int rand2 = (int) (Math.random() * zweiL�nge);
		int rand3 = (int) (Math.random() * dreiL�nge);
		
		//eine Phrase zusammenbauen
		String phrase = wortListeEins[rand1] + " " + wortListeZwei[rand2] + wortListeDrei[rand3];
		
		//eine Phrase ausgeben
		System.out.println("Was wir brauchen, ist eine " + phrase);
	}

}
