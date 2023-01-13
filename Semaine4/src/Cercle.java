public class Cercle {
    private double rayon;
    private Point centre;


    Cercle(double nRayon, Point nCentre){
        rayon= nRayon;
        centre= nCentre;
    }

    public double getRayon() {
        return rayon;
    }
    public void setRayon(double nrayon) {
        rayon = nrayon;
    }

    public Point getCentre() {
        return centre;
    }
    public void setCentre(Point nCentre){
        centre = nCentre;
    }

    public String toString() {
        return "le rayon est de"+ rayon +
                "et son centre se trouve aux cordonnées suivante :  " + centre;
    }
}
