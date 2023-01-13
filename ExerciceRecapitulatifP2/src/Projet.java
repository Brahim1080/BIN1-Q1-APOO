import java.util.ArrayList;
import java.util.Iterator;

public class Projet implements Iterable<Developpeur>{
    private int numero;
    private String nom;
    private boolean termine;
    private ArrayList<Developpeur> developpeurs;
    private static int nombreDeProjet;

    public Projet(String nom) {
        this.nom = nom;
        developpeurs = new ArrayList<>();
        nombreDeProjet++;
        this.numero=nombreDeProjet;


    }

    public String getNom() {
        return nom;
    }

    public boolean isTermine(){
        if (termine) return false;
        for (Developpeur developpeur : developpeurs) {
            developpeur.signalerFinDUnProjet();
        }
        this.termine = true;

        return true;
    }

    public int getNumero() {
        return numero;
    }
    public boolean ajouter (Developpeur developpeur){
        if (developpeurs.contains(developpeur)|| termine)
            return false;
        developpeur.signalerNouveauProjet();
        return developpeurs.add(developpeur);
    }

    public boolean retirer(Developpeur developpeur){
        if (developpeurs.contains(developpeur)|| !termine){
            developpeur.signalerFinDUnProjet();
            return developpeurs.remove(developpeur);
        }

        return false;
    }




    @Override
    public String toString() {
        String texte = "Projet " + numero + " : " + nom + (termine ? " termine " : " en cours" )
        +"\nDeveloppeur(s) sur le projet : ";

        for (Developpeur developpeur : developpeurs) {
            texte += "\n" +developpeur;
        }

        return texte;
    }

    @Override
    public Iterator<Developpeur> iterator() {
        return developpeurs.iterator();
    }

}
