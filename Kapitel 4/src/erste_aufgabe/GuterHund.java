package erste_aufgabe;

public class GuterHund {
	private int gr��e;
	
	public int getGr��e() {
		return gr��e;
	}
	public void setGr��e(int s) {
		gr��e = s;
	}
	
	void bellen() {
		if(gr��e > 60) {
			System.out.println("Wuff! Wuff!");
		} else if (gr��e > 14) {
			System.out.println("Wau! Wau!");
		} else {
			System.out.println("Jip! Jip!");
		}
	}

}
