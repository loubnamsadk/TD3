package EX3;

public class TestCentreCercle {
    public static void main(String[] args) {
        // Création d'un objet Centre
        Centre centre = new Centre(1, 2, 'A');

        // Affichage des coordonnées et du nom du centre
        centre.affiche();

        // Création d'un objet Cercle
        Cercle cercle = new Cercle(3, 4, 'B', 5.0);

        // Affichage des coordonnées, du nom et du rayon du cercle
        cercle.affiche();
    }
}
