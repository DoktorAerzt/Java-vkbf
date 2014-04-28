package erste_aufgabe;

public class GuterHund {
	private int größe;
	
	public int getGröße() {
		return größe;
	}
	public void setGröße(int s) {
		größe = s;
	}
	
	void bellen() {
		if(größe > 60) {
			System.out.println("Wuff! Wuff!");
		} else if (größe > 14) {
			System.out.println("Wau! Wau!");
		} else {
			System.out.println("Jip! Jip!");
		}
	}

}
