package Classes;

public class AppareilConnecte {
    String piece = "";

    public AppareilConnecte(String piece){
        this.piece = piece;
    }

    public void diagnostiquer(){
        System.out.println("L'appareil situé dans " + this.piece +" fonctionne normalement.");
    }
}

