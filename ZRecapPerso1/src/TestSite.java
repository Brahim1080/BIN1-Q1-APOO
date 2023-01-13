public class TestSite {
    public static void main(String[] args) {
        //Scenario 1
        try {
            Film  mauvaisEndgame = new Film("Avengers : Endgame","superheros",181,279800000);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Scenario 2

        Site superContent = new Site("www.supercontent.com");

        Film endgame = new Film("Avengers Endgame","Action",181,279800000);

        Serie bigbang= new Serie("The big bang Theory","Comedie",279);

        Film avengers = new Film("The avengers","Action",143);

        //Scenario 3
        superContent.ajouter(endgame);
        superContent.ajouter(bigbang);
        superContent.ajouter(avengers);
        System.out.println(superContent);
    }
}
