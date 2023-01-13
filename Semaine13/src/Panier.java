import java.util.ArrayList;
import java.util.Iterator;

public class Panier implements Iterable<Produit> {

    private ArrayList<Produit> produits;

    public Panier() {
        produits = new ArrayList<Produit>();

    }

    public boolean contient(Produit produit) {
        return this.produits.contains(produit);
    }

    public boolean ajouter(Produit produit) throws PanierPleinException{
        if (produits.size()==10)
            throw new PanierPleinException("Le panier est plein");
        if (produit == null)
            throw new IllegalArgumentException("Le produit ajouter ne peut pas etre null");



        return produits.add(produit);
    }

    public Iterator<Produit> iterator() {
        return produits.iterator();
    }

    public boolean supprimer(Produit produit) throws PanierVideException ,ProduitNonPresentException {

        if (produit== null)
            throw new IllegalArgumentException("Le produit ne peut pas etre null");

        if(produits.isEmpty()) {
            throw  new PanierVideException("Le panier est vide");
        }
        if (!this.contient(produit)) {
            throw new ProduitNonPresentException("Le produit n'est pas present");
        }else {

            System.out.println("oui");

        }
        return produits.remove(produit);
    }

    public int nombreDeProduit() {
        return produits.size();
    }

    public Produit trouverReference(String reference){
        if (reference == null )
            throw new IllegalArgumentException("La reference ne peut pas etre null ");
        if (reference.equals(""))
            throw new IllegalArgumentException("La reference ne peut pas etre vide");
        for (Produit produit : produits) {
            if (reference.equals(produit.getReference())) {
                return produit;
            }
        }
        return null;
    }

    public double calculerPrix() {
        double prix = 0;
        for (Produit produit : produits) {
            prix += produit.getPrix();
        }
        return prix;
    }

    @Override
    public String toString() {
        String texte = "Panier : ";

        for (Produit produit : produits) {

            texte += "\n" + produit.toString();

        }
        return texte;
    }
}
