public class Terrain extends Carte {

    private char couleur;
    private final static char[] COULEUR = {'B', 'b', 'n', 'r', 'v'};
    private final static int coutParDefaut = 0;

    public Terrain(char couleur) {
        super(coutParDefaut);

        for (char c : COULEUR) {
            if (c == couleur) {
                this.couleur = couleur;
                break;
            }
        }
    }

    public char getCouleur() {
        return couleur;
    }

    public String fournirDetails(){
        return "Terrain - " + super.fournirDetails() + " couleur : " + couleur;
    }

}
