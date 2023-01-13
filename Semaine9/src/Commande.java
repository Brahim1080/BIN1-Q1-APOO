import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class Commande {
	private ArrayList<Article> articles;
	private LocalDate date;
	
	public Commande(){
		date = LocalDate.now();
		articles = new ArrayList<Article>();
	}


	public void ajouter(Article article){
		if(article==null) throw new IllegalArgumentException("l'article ne peut pas être null");;
		this.articles.add(article);

	}

	public double calculerPrixTotal(){
		double prixTotal = 0;
		for (Article article : articles) {
			prixTotal+= article.calculerPrixTVAComprise();

		}
		return prixTotal;
	}

	public LocalDate getDate() {
		return date;
	}

	public String toString(){
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String resultat = date.format(formatter)+" \n";

		//TODO ajouter la liste des articles à la chaîne (avec un passeage à la ligne entre chaque article) de caractères.

		for (Article article : articles) {
			resultat += "\n"+ article.toString() + "\n"+ "Prix Total : " + calculerPrixTotal()  ;
		}
		//TODO ajouter le prix total à la chaîne de caractères après la liste des article.

		
		return resultat;
	}
}
