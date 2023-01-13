public class CD extends Produit {

    private String artiste;
    private int nombreDeMorceau;
    private String titre;

    public CD(String reference, double prix,String titre , String artiste, int nombreDeMorceau) {
        super(reference, prix);
        this.titre = titre;
        this.artiste = artiste;
        this.nombreDeMorceau = nombreDeMorceau;
    }

    public String getArtiste() {
        return artiste;
    }

    public int getNombreDeMorceau() {
        return nombreDeMorceau;
    }

    public String getTitre() {
        return titre;
    }

    @Override
    public String toString() {
        return "\nCD : " + "\nArtiste : " + artiste + "\nNombre de morceaux : " + nombreDeMorceau +
                "\nTitre : " + titre +super.toString();
    }
}
