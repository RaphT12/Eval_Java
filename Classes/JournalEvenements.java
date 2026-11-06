package Classes;

public class JournalEvenements {
    private static JournalEvenements INSTANCE;
    String niveauAlerte = "INFO";
    
    private JournalEvenements() {        
    }

    public static JournalEvenements getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new JournalEvenements();
        }
        
        return INSTANCE;
    }

    public void getNiveauAlerte(){
    };

    public void setNiveauAlerte(int niveau){

    };

}
