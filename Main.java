import Classes.*;

public class Main {
    public static void main(String[] args) {

        // Exercice 1
        ArticleStock Article1 = new ArticleStock("Clavier mécanique");
        Article1.apprivisionner(15);
        Article1.getQuantite();
        Article1.expedier(6);
        Article1.expedier(12);
        Article1.getQuantite();

        // Exercice 2
        AppareilConnecte Appareil1 = new AppareilConnecte("Couloir");
        Thermostat Therm1 = new Thermostat("Salon");
        CameraSecurite Cam1 = new CameraSecurite("Entrée");
        Appareil1.diagnostiquer();
        Therm1.diagnostiquer();
        Cam1.diagnostiquer();
        Therm1.activerModeEco();

        // Exercice 3
        ChambreHotel Chambre1 = new ChambreHotel("CH-101", 85.0, 12.5);
        AppartementLocatif Appart1 = new AppartementLocatif("APT-4B", 110.0, 50.0);
        Chambre1.decrire();
        Chambre1.calculerPrixSejour(4);
        Appart1.decrire();
        Appart1.calculerPrixSejour(4);

        // Exercice 4
        Smartphone Telephone = new Smartphone("Pixel Pro", 5000);
        Telephone.obtenirFicheTechnique();

    }
}
