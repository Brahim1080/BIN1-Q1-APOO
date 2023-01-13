public class Creature extends Carte {

    private String nom;
    private int pointsDeDegats;
    private int PointsDeVie;
    private final static int pointDevieParDefaut = 0, pointDeDegatsParDefaut = 0;

    public Creature(int cout, String nom, int pointsDeDegats, int pointsDeVie) {
        super(cout);
        this.nom = nom;
        this.pointsDeDegats = pointsDeDegats;
        PointsDeVie = pointsDeVie;
    }

    public Creature(int cout , String nom ){

        this(cout,nom,pointDeDegatsParDefaut,pointDevieParDefaut);
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeDegats() {
        return pointsDeDegats;
    }

    public int getPointsDeVie() {
        return PointsDeVie;
    }

    public String fournirDetails(){
        return "Creature - " +super.fournirDetails() + " nom : " + getNom() + "(" + getPointsDeDegats() + "/" + getPointsDeVie() + ")";
    }
}