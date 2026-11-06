package Classes;

public class ArticleStock {
    String name = "";
    int quantite = 0;

    public ArticleStock(String name, int quantite){
        this.name = name;
        this.quantite = quantite;
    }

    public ArticleStock(String name){
        this.name = name;
        this.quantite = 0;
    }

    public void getNom(){
        System.out.println("Nom : " + this.name);
    }

    public void getQuantite(){
        System.out.println("Quantite : " + this.quantite);
    }

    public void apprivisionner(int nb){
        if(nb > 0){
            this.quantite += nb;
        }else{
            System.out.println("Veuillez entrez un nombre positif");
        }
    }

    public void expedier(int nb){
        if(nb > this.quantite){
            System.out.println("Erreur : stock insuffisant pour expédier " + nb + " unités.");
        }else{
            this.quantite -= nb;
            System.out.println("Expédition de " + nb + " unités validée.");
        }
    }
}
