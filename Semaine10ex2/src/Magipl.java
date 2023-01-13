public class Magipl {

    public static void main(String[] args) {
        Carte carte1 = new Creature(10,"creature",15,25);
        Carte carte2 = new Sortilege(15,"Croissance ", "gigantesque");
        Carte carte3 = new Terrain('r');
        Main mainDeCarte = new Main();

        mainDeCarte.piocherCarte(carte1);
        mainDeCarte.piocherCarte(carte2);
        mainDeCarte.piocherCarte(carte3);
        System.out.println("Là j'ai en stock : ");
        System.out.println(mainDeCarte);
        System.out.println();

        System.out.println("Carte joue : " + carte3.fournirDetails());
        mainDeCarte.jouer(2);
        System.out.println();

        System.out.println("maintenant il me reste : ");
        System.out.println(mainDeCarte);


    }
}
