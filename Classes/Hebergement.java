package Classes;

abstract class Hebergement {
    protected String reference;
    protected double tarifJournalier;

    public Hebergement(String reference, double tarifJournalier){
        this.reference = reference;
        this.tarifJournalier = tarifJournalier;
    }

    public abstract void calculerPrixSejour(int nbNuits);

    public void decrire(){
        System.out.println("Hébergement " + this.reference + " - Tarif de base : " + this.tarifJournalier + " €/nuit"); 
    }
}    
