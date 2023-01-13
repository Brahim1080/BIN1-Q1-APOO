import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Random;

public class TestProduit {

    public static void main(String[] args)  {
        //1 Créer un panier
        Panier panier = new Panier();
        //2 Créer un livre de référence « 123 » et le stocker dans la variable livre1
        Livre livre1 = new Livre("123",30,"L'art de la guerre","Sun Tzu",456);

        try {
            //3 Supprimer livre1 du panier (>PanierVideException)
            panier.supprimer(livre1);

        } catch (PanierVideException e){
            System.out.println("Suprimme dans un panier vide : "+e.getMessage());
        }catch(ProduitNonPresentException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


        //4 Supprimer « null » du panier (>IllegalArgumentException)
        try {
            System.out.print("\nSupprimer « null » du panier (>IllegalArgumentException) : ");
            panier.supprimer(null);
        } catch (PanierVideException e) {
            System.out.println(e.getMessage());
        } catch (ProduitNonPresentException e) {
            System.out.println(e.getMessage());;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());;
        }

        //5 Chercher le produit de référence « 123 » dans le panier (> return null)
        System.out.println("\nChercher le produit de référence « 123 » dans le panier (> return null) : "+panier.trouverReference("123"));
        //6 Chercher le produit de référence null (>IllegalArgumentException)
        try {
            System.out.print("\nChercher le produit de référence null (>IllegalArgumentException) :");
            panier.trouverReference(null);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            //7  Ajouter « null » au panier (>IllegalArgumentException)
            System.out.print("\nAjouter « null » au panier (>IllegalArgumentException) : ");
            panier.ajouter(null);

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (PanierPleinException e){
            System.out.println(e.getMessage());
        }

        try {
            //8  Ajouter livre1 au panier
            panier.ajouter(livre1);
        } catch (PanierPleinException e) {
            System.out.println(e.getMessage());
        }




        //9 Chercher un produit de référence « 1234 » dans le panier (> return null)
        System.out.print("\nChercher un produit de référence « 1234 » dans le panier (> return null) :");
        System.out.println(panier.trouverReference("1234"));

        //10 Chercher un produit de référence «» dans le panier (>IllegalArgumentException)
        try {
            System.out.print("\nChercher un produit de référence «» dans le panier (>IllegalArgumentException)");
            System.out.println(panier.trouverReference(""));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //11 Créer un CD de référence « cd1 » et le stocker dans la variable « cd1 »
        CD cd1 = new CD("cd1",27.5,"tt","tt",43);


        try {
            System.out.print("\nSupprimer cd1 du panier (>ProduitNonPresentException) : ");
            //12 Supprimer cd1 du panier (>ProduitNonPresentException)
            System.out.println(panier.supprimer(cd1));
        }catch (ProduitNonPresentException e){
            System.out.println(e.getMessage());
        } catch (PanierVideException e){
            System.out.println(e.getMessage());
        }


        //13 Ajouter cd1 au panier
        try {
            panier.ajouter(cd1);
        } catch (PanierPleinException e){
            System.out.println(e.getMessage());
        }

        //14 Créer un livre de référence « 123 » et le stocker dans la variable livre2
        Livre livre2 = new Livre("123",17.99,"livre","auteur",427);

        //15 Supprimer livre2 du panier

        try {
            System.out.print("\n15 Supprimer livre2 du panier");
            panier.supprimer(livre2);
        } catch (PanierVideException e) {

            System.out.println(e.getMessage());
        } catch (ProduitNonPresentException e){
            System.out.println(e.getMessage());
        }


        //16 Afficher le panier (il ne doit y avoir que le cd)
        System.out.println("\nAfficher le panier (il ne doit y avoir que le cd) : \n"+panier);

        //17 Faire une boucle qui ajoute 9 DVD au panier

/*
        for (int i = 0; i < 9 ; i++) {
           String reference = "PR" + Math.random();

           double prix = (double) (Math.random()*51);
            DVD dvd = new DVD(reference,prix,"titre "+reference,"realisateur "+reference);


            try {
                panier.ajouter(dvd);
            } catch (PanierPleinException e) {
                System.out.println(e.getMessage());;
            }
        }
*/


        //18 Ajouter livre1 au panier (>PanierPleinException)
      /*  System.out.print("ajout dans un panier plein : ");
        try {
            panier.ajouter(livre1);
        } catch (PanierPleinException e){
            System.out.println(e.getMessage());
        }
*/
        //19 Afficher le panier (il doit contenir 10 articles)

       // System.out.println(panier);








    }
}
