public class Livre extends Produit {
    private String titre;
    private String auteur;
    private int nombreDePage;

    public Livre(String reference, double prix, String titre, String auteur, int nombreDePage) {
        super(reference, prix);
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePage = nombreDePage;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombreDePage() {
        return nombreDePage;
    }

    @Override
    public String toString() {
        return "\nLivre : " +
                "\nTitre : " + titre + "\nAuteur : " + auteur +
                "\nNombre de page : " + nombreDePage +super.toString() ;
    }
}
