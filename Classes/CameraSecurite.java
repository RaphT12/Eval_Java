package Classes;

public class CameraSecurite extends AppareilConnecte{
    public CameraSecurite(String piece){
        super(piece);
    }

    public void diagnostiquer(){
        System.out.println("La caméra de " + this.piece + " filme en haute définition.");
    }
}
