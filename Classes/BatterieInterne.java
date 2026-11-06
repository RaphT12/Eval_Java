package Classes;

public class BatterieInterne {
    int capaciteMah;

    public BatterieInterne(int capaciteMah){
        this.capaciteMah = capaciteMah;
    }

    public void getCapaciteMah(){
        System.out.println(this.capaciteMah);
    }
}
