public class Etudiant {
    private String matricule;
    private String nom;
    private String prenom;
    private Serie serie;

    public Etudiant(String matricule , String nom, String prenom, Serie serie){
        this.matricule=matricule;
        this.nom=nom;
        this.prenom=prenom;
        this.serie=serie;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public Serie getSerie() {
        return serie;
    }

    public String toString() {
        return "nom : "+ this.nom+ "\nprenom: "+ this.prenom+ "\nMatricule: "+this.matricule+ "\nserie : "+ this.serie;
    }

    public void changerSerie(Serie serie){
        if (serie == null)
            throw new IllegalArgumentException();
        if(this == this.serie.getDelegue())
            throw new IllegalStateException();

        if(serie== this.serie)
           throw new IllegalArgumentException();
        this.serie=serie;

    }
}
