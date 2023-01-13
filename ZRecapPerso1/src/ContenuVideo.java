import java.util.Objects;

public abstract class ContenuVideo {
    private int id;
    private String titre;
    private String categorie;
    private static int idSuivant = 1;
    private final static String [] CATEGORIES_POSSIBLES = {"Action", "Science Fiction", "Drame", "Comedie", "Horreur", "Trilleur", "Documentaire", "Animation"};

    public ContenuVideo(String titre, String categorie) {
        if (titre == null || titre.equals(""))
            throw new IllegalArgumentException();
        this.titre = titre;

        if (categorie ==  null || categorie.equals(""))
            throw new IllegalArgumentException();
        for (String categoriesPossible : CATEGORIES_POSSIBLES) {
            if (categorie.equals(categoriesPossible)){
                this.categorie = categorie;
                break;
            }


        }
        if (this.categorie == null)
            throw new IllegalArgumentException("Categorie inexsitante ");
        this.id = idSuivant;
        idSuivant++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContenuVideo that = (ContenuVideo) o;
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
        if (titre == null || titre.equals(""))
            throw new IllegalArgumentException();
        this.titre = titre;
    }

    public void setCategorie(String categorie) {
        for (String categoriesPossible : CATEGORIES_POSSIBLES) {
            if (categorie.equals(categoriesPossible)){
                this.categorie = categorie;
                break;
            }

        }
        if (this.categorie == null)
            throw new IllegalArgumentException("Categorie inexsitante ");

    }
    public String toString() {
        return "[id=" + id +
                ", titre=" + titre +
                ", categorie= " + categorie;
    }
}
