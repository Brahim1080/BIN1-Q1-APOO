public class Serie {

    private char nom;
    private Etudiant delegue;

    public Serie(char nom){
        this.nom=nom;

    }

    public char getNom() {
        return nom;
    }

    public Etudiant getDelegue() {
        return delegue;

    }

    public String toString() {
        if (this.delegue != null) {
            return "Série " + this.nom + " (délégué : " + this.delegue.getNom() + ")";
        } else {
            return "Série " + this.nom;
        }
    }

    public boolean elireDelegue(Etudiant delegue){
        if( delegue.getSerie()!=this || this.delegue!=null)
            return false;

        this.delegue=delegue;
        return true;
    }

}
