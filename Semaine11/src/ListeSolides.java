import java.util.ArrayList;
import java.util.Iterator;

public class ListeSolides implements Iterable<Solide>{
    private ArrayList<Solide> solides;


    public ListeSolides() {
        solides= new ArrayList<Solide>();

    }

    public boolean estVide(){
        return true;
    }

    public int nombreDeSolides(){
        return solides.size();
    }

    public boolean contient(Solide solide){
        return solides.contains(solide);
    }

    public boolean ajouter(Solide solide){
        if (this.contient(solide)) return false;

        return solides.add(solide);
    }
    public boolean supprimer(Solide solide){
        return solides.remove(solide);
    }

    public ArrayList<Solide> trouverPlusGrand() {
        ArrayList<Solide> plusGrand = new ArrayList<>();
        double volumeMax = 0 ;

        for (Solide solide : solides) {
            if (solide.calculerVolume() > volumeMax) {
                volumeMax = solide.calculerVolume();
                plusGrand = new ArrayList<>();
            }
            if (solide.calculerVolume() == volumeMax) {
                plusGrand.add(solide);
            }

        }
        return plusGrand;
    }

    @Override
    public Iterator<Solide> iterator() {
        return solides.iterator();
    }

    @Override
    public String toString() {
        String texte = "Liste de solide : " ;

        for (Solide solide : solides ) {
            texte += "\n" + solide.toString();
        }
        return texte;
    }
}
