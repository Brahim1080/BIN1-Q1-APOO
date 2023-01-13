public class TestPersonneAdresse {

    public static void main(String args[]) {

        Adresse adresse = new Adresse("Rue de la gare", "34", "5000", "Namur");
        Date dateNaissance1 = new Date(6, 2, 1968);
        Personne personne1 = new Personne("Schmidt", "Paul", dateNaissance1, adresse);
        Date dateDeNaissance2 = new Date(7,3,1970);
        Personne personne2 = new Personne("Gobert", "Valérie", dateDeNaissance2, adresse);

        System.out.println(personne1);
        System.out.println(personne2);
        System.out.println(adresse.getRue());



    }


}
