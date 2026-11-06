package Classes;

public class Thermostat extends AppareilConnecte{
    public Thermostat(String piece){
        super(piece);
    }

    public void diagnostiquer(){
        System.out.println("Le Thermostat de " + this.piece +" régule la température à 20°C.");
    }

    public void activerModeEco(){
        System.out.println("Le Thermostat de " + this.piece +" passe en mode économique.");
    }
}
