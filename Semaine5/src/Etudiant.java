public class Etudiant {
    private String matricule;
    private String nom;
    private String prenom;
    private Serie serie;

    public Etudiant( String matricule , String nom,String prenom, Serie serie){
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

    public boolean changerSerie(Serie serie){
        if(this == this.serie.getDelegue())
            return false;

        if(serie== this.serie)
            return false;

        this.serie=serie;

        return  true;

    }
}
