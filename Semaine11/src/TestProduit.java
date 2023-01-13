public class TestProduit {

    public static void main(String[] args) {
        Panier panier = new Panier();
        CD cd1 = new CD("449655-TYU-55",36,"Billie Jean","Michael Jackson",17);
        CD cd2 = new CD("1005111-54",45,"My world","Jul",15);
        DVD dvd1 = new DVD("184244-421-AZE",80,"Spiderman","Jon Watts");
        Livre livre1 = new Livre("171154-GYEI-15",30,"L'Art de la guerre","Sun Tzu",354);


        panier.ajouter(cd1);
        panier.ajouter(dvd1);
        panier.ajouter(livre1);
        panier.ajouter(cd2);


        System.out.println(panier);
        System.out.println();
        System.out.println("Total du panier : " + panier.calculerPrix());

        System.out.println("Nombre de produit dans le panier : " + panier.nombreDeProduit());
        System.out.println();

        System.out.println( "recherche de 171154-GYEI-15" + panier.trouverReference("171154-GYEI-15"));

    }
}
