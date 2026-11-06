// On peut traduire cela en utilisant le mot cle private pour la class batterie pour qu'il ne puisse etre utiliser que dans la class smartphone

package Classes;

public class Smartphone {
    String modele;
    BatterieInterne batterie;

    public Smartphone(String modele, int batterie){
        this.modele = modele;
        this.batterie = new BatterieInterne(batterie);
    }

    public void obtenirFicheTechnique(){
        System.out.println("Smartphone " + this.modele + " équipé d'une batterie scellée de " + this.batterie + " mAh.");
    }
}
