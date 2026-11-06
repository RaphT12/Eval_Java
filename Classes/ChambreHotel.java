package Classes;

public class ChambreHotel extends Hebergement{
    double supplementPetitDejeuner;

    public ChambreHotel(String reference, double tarifJournalier,double supplementPetitDejeuner) {
        super(reference, tarifJournalier);
        this.supplementPetitDejeuner = supplementPetitDejeuner;
    }

    @Override 
    public void calculerPrixSejour(int nbNuits){
        int TarifTotal = 0;
        TarifTotal =(int)((this.tarifJournalier + supplementPetitDejeuner) * nbNuits);
        System.out.println("Tarif : " + TarifTotal);
    }
}
