package erste_aufgabe;

public class Hund {

    String name;

    public static void main (String[] args){
        Hund hund1 = new Hund();
        hund1.bellen();
        hund1.name = "Bert";


    Hund[] meineHunde = new Hund[3];
    meineHunde[0] = new Hund();
    meineHunde[1] = new Hund();
    meineHunde[2] = new Hund();

    meineHunde[0].name = "Fred";
    meineHunde[1].name = "Margot";

    System.out.print("der name der letzten Hundes ist ");
    System.out.print(meineHunde[2].name);

    int x = 0;

    while (x < meineHunde.length){
        x = x + 1;
    }
    }

    public void bellen() {
        System.out.println(name + " sagt Wau!");
    }
    public void essen() {}
    public void katzeJagen() {} 
}
