public class Rectangle {

    int largeur;
    int longueur;

    Rectangle(int nvlarg, int nvlong){
        largeur= nvlarg;
        longueur= nvlong;


    }

    int calculerAire(){
        return largeur*longueur;

    }

    int calculerPerimetre(){
        return 2*(largeur + longueur);
    }

    public String toString() {
        return "le rectangle de largeur" + largeur + "et de longueur" + longueur;
    }
}
