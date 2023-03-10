import java.util.Objects;

public class Cylindre implements Solide {
    private double rayon;
    private double hauteur;

    public Cylindre(double rayon, double hauteur) {
        this.rayon = rayon;
        this.hauteur = hauteur;
    }

    public double getRayon() {
        return rayon;
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public double calculerVolume() {
        return Math.PI * (rayon * rayon ) * hauteur;
    }

    @Override
    public double calculerSurface() {
        return 2 * Math.PI * (rayon * rayon) + 2 * Math.PI * rayon * hauteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylindre cylindre = (Cylindre) o;
        return Double.compare(cylindre.rayon, rayon) == 0 && Double.compare(cylindre.hauteur, hauteur) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon, hauteur);
    }

    @Override
    public String toString() {
        return "Cylindre de rayon " + getRayon() + " et de hauteur "+ getHauteur();
    }
}
