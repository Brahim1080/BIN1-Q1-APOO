import java.util.ArrayList;

public class ListeCarte {

    private ArrayList<CarteJeu> cartes;

    public ListeCarte(ArrayList<CarteJeu> cartes) {
        this.cartes = cartes;
    }

    public boolean ajouter(CarteJeu carteJeu){
        return cartes.add(carteJeu);
    }
    public boolean retirer(CarteJeu carteJeu){
        return cartes.remove(carteJeu);
    }
    public boolean contient(CarteJeu carteJeu){
        return cartes.contains(carteJeu);
    }
}
