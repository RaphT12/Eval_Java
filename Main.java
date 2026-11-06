import Classes.*;

public class Main {
    public static void main(String[] args) {

        // Exercice 1
        ArticleStock Article1 = new ArticleStock("Clavier mécanique");
        Article1.apprivisionner(15);
        Article1.getQuantite();
        Article1.expedier(6);
        Article1.expedier(12);
        Article1.getQuantite();

    }
}
