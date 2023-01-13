public class TestCompteEnBanque {
    public static void main(String args[]) {
        Adresse domicile = new Adresse("Rue Taziaux", "17", "1080", "Bruxelles");
        Date dateDeNaissance = new Date(1965, 2, 18);
        Personne lecompte = new Personne("Leconte", "Yves", dateDeNaissance, domicile);
        Date dateDeValidite = new Date(2025, 4, 28);
        Date dateDOuverture = new Date(2017, 10, 10);
        CompteEnBanque client = new CompteEnBanque(lecompte, dateDeValidite, dateDOuverture, 1200, "000-000000089-89");

        System.out.println(client);

        client.deposer(100);

        System.out.println(client);
    }
}
