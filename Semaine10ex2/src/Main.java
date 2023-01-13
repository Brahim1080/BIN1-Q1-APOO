import java.util.ArrayList;

public class Main {

    private ArrayList<Carte> cartes;
    private final static int NOMBRE_DE_CARTES_MAX = 10;



    public Main(){
       cartes = new ArrayList<Carte>();
   }

   public void piocherCarte(Carte carte){
        if (cartes.size()==NOMBRE_DE_CARTES_MAX){
            throw new TropDeCartesException();
        }

        cartes.add(carte);



   }

   public Carte jouer(int indice){
        if(indice >= cartes.size()) {
            throw new IllegalArgumentException();
        }
        return cartes.remove(indice);
   }

    @Override
    public String toString() {
        String texte  = "";
        for (Carte carte : cartes) {
            texte +=  carte.fournirDetails() +"\n";

        }
        return texte;
    }
}
