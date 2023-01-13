import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Livre> livres;

    public Catalogue() {
        livres = new ArrayList<Livre>();
    }

    public Livre chercherLivre(String isbn){
       for(Livre livre:livres){
           if(isbn.equals(livre.getIsbn())){
               return livre;
           }

        }
       return null;
    }

    public boolean contient(Livre livre) {

        return livres.contains(livre);
    }

    public boolean ajouter(Livre livre) {
        if (this.contient(livre)) return false;
        return livres.add(livre);
    }

    public boolean retirer(Livre livre){
        return livres.remove(livre);
    }

    public int nombreDeLivres(){
        return livres.size();
    }

    public boolean estVide(){
        return livres.isEmpty();
    }

    @Override
    public String toString() {

        String texte = "Liste des livres : ";

        for (Livre livre : livres) {

            texte += ("\n" + livre.toString());


        }
        return texte ;
    }
}

