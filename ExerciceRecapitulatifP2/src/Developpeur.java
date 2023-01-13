public class Developpeur {

    private String nom;
    private String specialite;
    private double salaire ;
    private int nbrProjetsEnCours;
    public final static String SPECIALITE_PAR_DEFAUT = "full-stack";

    public Developpeur(String nom, String specialite, double salaire) {
        if(nom == null || nom.equals(""))
            throw new IllegalArgumentException();
        this.nom = nom;
        if(specialite==null || specialite.equals(""))
            throw new IllegalArgumentException();
        this.specialite = specialite;
        this.salaire = salaire;
        this.nbrProjetsEnCours = 0;
    }

    public Developpeur(String nom, double salaire) {
        this(nom, SPECIALITE_PAR_DEFAUT, salaire);
    }

    public String getNom() {
        return nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    public int getNbrProjetsEnCours() {
        return nbrProjetsEnCours;
    }

    public void setSpecialite(String specialite) {
        if(specialite==null || specialite.equals(""))
            throw new IllegalArgumentException();
        this.specialite = specialite;
    }

    public void signalerNouveauProjet(){
        nbrProjetsEnCours++;
    }

    public void signalerFinDUnProjet(){
        nbrProjetsEnCours--;
    }

    @Override
    public String toString() {
        return "Developpeur: " + nom + ", Specialite : " + specialite
                + ", Salaire : " + salaire + ", Nombre de projets en cours : " + nbrProjetsEnCours ;
    }
}
