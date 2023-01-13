public class TestSite {
    public static void main(String[] args) {
        //Scenario 1

        try {
            Film mauvaisEndgame = new Film("Avengers Endgame", "SuperHeros", 181, 279800000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //scenario 2
        Site superContent = new Site("www.supercontent.com");
        Film engame = new Film("Avengers: Endgame", "Action", 181, 279800000);
        Serie bigbang = new Serie("The Big Bang Theory", "Comedie", 279);
        Film avengers = new Film("The Avengers", "Action", 143, 0);

        System.out.println();
        //scenario 3

        superContent.ajouter(engame);
        superContent.ajouter(bigbang);
        superContent.ajouter(avengers);

        System.out.println(superContent);


    }
}
