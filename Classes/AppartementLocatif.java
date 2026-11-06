package Classes;

public class AppartementLocatif extends Hebergement{
    private double fraisMenageFixes;

    public AppartementLocatif(String reference, double tarifJournalier, double fraisMenageFixes) {
        super(reference, tarifJournalier);
        this.fraisMenageFixes = fraisMenageFixes;
    }

    @Override 
    public void calculerPrixSejour(int nbNuits){
        int TarifTotal = 0;
        TarifTotal = (int)((this.tarifJournalier + fraisMenageFixes) * nbNuits);
        System.out.println("Tarif : " + TarifTotal);
    }
}
