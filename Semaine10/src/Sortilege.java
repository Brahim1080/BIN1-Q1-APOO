public class Sortilege extends CarteJeu {

    private String nom ;
    private String explication;

    public Sortilege(int cout, String nom, String explication) {
        super(cout);
        this.nom = nom;
        this.explication = explication;
    }

    public String getNom() {
        return nom;
    }

    public String getExplication() {
        return explication;
    }

    public String fournirdetail(){
        return "Sortilege - " + super.fourirDetail() + " nom : " + getExplication();
    }
}
