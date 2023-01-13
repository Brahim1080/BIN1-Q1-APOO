import java.util.Objects;

public abstract class ContenueVideo{

    private int id;
    private String titre;
    private String categorie;
    private static int idSuivant = 1;
    private static final String[] CATEGORIE_POSSIBLES = {"Action", "Science Fiction", "Drame", "Comedie", "Horreur", "Trilleur", "Documentaire", "Animation"};

    public ContenueVideo(String titre, String categorie) {
        if (titre == null || titre.equals(""))
            throw new IllegalArgumentException();
        if (categorie == null || categorie.equals(""))
            throw new IllegalArgumentException();

        this.titre = titre;

        for (String categoriePossible : CATEGORIE_POSSIBLES) {
            if (categorie.equals(categoriePossible)) {
                this.categorie = categorie;
                break;
            }
        }


        if (this.categorie == null)
            throw new IllegalArgumentException("Catégorie inexistante");

        //pour que l'id est 1 au debut et augmente à chaque appel de constructeur
        this.id = idSuivant;
        idSuivant++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContenueVideo that = (ContenueVideo) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getCategorie() {

        return categorie;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setCategorie(String categorie) {
        for (String categoriePossible : CATEGORIE_POSSIBLES) {
            if (categorie.equals(categoriePossible)) {
                this.categorie = categorie;
                break;
            }

        }
        if (this.categorie == null)
            throw new IllegalArgumentException("Catégorie inexistante");

    }

    @Override
    public String toString() {
        return "[id=" + id +
                ", titre=" + titre +
                ", categorie= " + categorie;
    }
}
