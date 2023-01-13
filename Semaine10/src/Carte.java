import java.util.ArrayList;

public class Carte {

    private ArrayList<Boisson> boissons;



    public Carte(){
        boissons = new ArrayList<Boisson>();
    }


    public boolean ajouter(Boisson boisson) {
        if(this.contient(boisson)) return false;
        return boissons.add(boisson);


    }

    public boolean retirer(Boisson boisson){
        return boissons.remove(boisson);

    }

    public boolean contient(Boisson boisson){

        return boissons.contains(boisson);

    }

    public int nombreDeBoissons(){
        return boissons.size();
    }

    @Override
    public String toString() {
        String texte = "Carte: " ;

        for (Boisson boisson : boissons) {

            texte += "\n" + boisson.toString();

        }
        return texte;
    }
}
