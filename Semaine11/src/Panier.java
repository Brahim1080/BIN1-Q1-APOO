import java.util.ArrayList;
import java.util.Iterator;

public class Panier implements Iterable<Produit> {

    private ArrayList<Produit> produits;

    public Panier() {
        produits = new ArrayList<Produit>();

    }
    public boolean contient(Produit produit){
        return this.produits.contains(produit);
    }

    public boolean ajouter(Produit produit){
        if(this.contient(produit)) return false;

        return produits.add(produit);
    }
    public Iterator<Produit> iterator(){
        return produits.iterator();
    }

    public boolean supprimer(Produit produit){
        if(!this.contient(produit)) return false;
        return produits.remove(produit);
    }

    public int nombreDeProduit(){
        return produits.size();
    }

    public Produit trouverReference(String reference){
        for (Produit produit : produits) {
            if (reference.equals(produit.getReference())) {
                return produit;
            }
        }
        return null;
    }
    public double calculerPrix(){
        double prix=0;
        for (Produit produit : produits) {
            prix += produit.getPrix();
        }
        return prix;
    }

    @Override
    public String toString() {
        String texte = "Panier : ";

        for (Produit produit : produits) {

            texte+= "\n" + produit.toString();

        }
        return texte;
    }
}
