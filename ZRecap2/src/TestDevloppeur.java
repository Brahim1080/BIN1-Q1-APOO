public class TestDevloppeur {
    public static void main(String[] args) {
        //Scenario 1
        Projet projet1 = new Projet("Site Stages");
        Developpeur olivier = new Developpeur("Olivier","infra",3500.0);
        DeveloppeurStagiare zoe = new DeveloppeurStagiare("Zoe","back end",100,"IPL");
        Developpeur loic = new Developpeur("Loic",3000);
        Projet projet2 = new Projet("Test");
        //Scenario 2

        projet1.ajouter(olivier);
        projet1.ajouter(zoe);
        projet1.ajouter(loic);
        projet1.retirer(loic);
        // Scenario 3
        projet1.terminer();
        System.out.println(projet1);

        System.out.println(projet2);
    }
}
