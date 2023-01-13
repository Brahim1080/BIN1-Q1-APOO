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
        nombreDeProjet++;
        this.numero = nombreDeProjet;
        developpeurs = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public boolean isTermine(){
        return termine;
    }

    public int getNumero() {
        return numero;
    }

    public boolean ajouter(Developpeur developpeur){
        if (developpeurs.contains(developpeur) || termine ) return false;
        developpeur.signalerNouveauProjet();

        return developpeurs.add(developpeur);
    }
    public boolean retirer(Developpeur developpeur){
        if (!termine || developpeurs.contains(developpeur)){
            developpeur.signalerFinDUnProjet();
            return developpeurs.remove(developpeur);
        }
        return false;
    }



    public boolean terminer(){
        if (termine) return false;

        for (Developpeur developpeur : developpeurs) {
            developpeur.signalerFinDUnProjet();
        }

        this.termine= true;
        return true;
    }


    @Override
    public Iterator<Developpeur> iterator() {
        return developpeurs.iterator();
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
}
