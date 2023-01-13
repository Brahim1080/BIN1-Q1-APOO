import java.util.Objects;

public class Sphere implements Solide {
    private double rayon;

    public Sphere(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public double calculerVolume() {
        return 4 * Math.PI * (rayon * rayon * rayon) / 3;
    }

    @Override
    public double calculerSurface() {
        return 4* Math.PI * (rayon *  rayon );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(sphere.rayon, rayon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon);
    }

    @Override
    public String toString() {
        return "Sphere de rayon " + getRayon();
    }
}
