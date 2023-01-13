public class Groupe {
    private String nom;
    private int anneeDeFormation;
    private String nationalite;
    private String genreMusical;
    private String titrePhare;

    public Groupe(String nom, int anneeDeFormation, String nationalite, String genreMusical, String titrePhare) {
        this.nom = nom;
        this.anneeDeFormation = anneeDeFormation;
        this.nationalite = nationalite;
        this.genreMusical = genreMusical;
        this.titrePhare = titrePhare;
    }

    @Override
    public String toString() {
        return "Groupe{" +
                "nom='" + nom + '\'' +
                ", anneeDeFormation=" + anneeDeFormation +
                ", nationalite='" + nationalite + '\'' +
                ", genreMusical='" + genreMusical + '\'' +
                ", titrePhare='" + titrePhare + '\'' +
                '}';
    }
}
