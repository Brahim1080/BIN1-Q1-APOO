public class Livre {
    //mettre des private
    int ISBN;
    String leTitre;
    String nomEtPrenomAuteur ;
    int anneEdition;
    double prixConseille;
    int nombreDePages;

    public Livre(int ISBN, String leTitre, String nomEtPrenomAuteur, int anneEdition, double prixConseille, int nombreDePages) {
        this.ISBN = ISBN;
        this.leTitre = leTitre;
        this.nomEtPrenomAuteur = nomEtPrenomAuteur;
        this.anneEdition = anneEdition;
        this.prixConseille = prixConseille;
        this.nombreDePages = nombreDePages;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "ISBN=" + ISBN +
                ", leTitre='" + leTitre + '\'' +
                ", nomEtPrenomAuteur='" + nomEtPrenomAuteur + '\'' +
                ", anneEdition=" + anneEdition +
                ", prixConseille=" + prixConseille +
                ", nombreDePages=" + nombreDePages +
                '}';
    }
}
