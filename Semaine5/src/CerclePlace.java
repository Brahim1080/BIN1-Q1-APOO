
public class CerclePlace {
	private double rayon;
	private Point centre;
	
	public CerclePlace(double nRayon, Point nCentre) {
		rayon = nRayon;
		centre = nCentre;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double nRayon) {
		rayon = nRayon;
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point nCentre) {
		centre = nCentre;
	}
	
	public String toString() {
		return "Cercle de rayon : " + rayon + " de centre " + centre;
	}
	

}
