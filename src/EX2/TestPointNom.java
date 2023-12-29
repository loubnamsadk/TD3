package EX2;

public class TestPointNom {
    public static void main(String[] args) {
        // Création d'un objet PointNom
        PointNom pointAvecNom = new PointNom(1, 2, 'A');

        // Affichage des coordonnées et du nom
        pointAvecNom.affCoordNom();

        // Déplacement du point
        pointAvecNom.deplace(3, 4);

        // Affichage des nouvelles coordonnées et du nom
        pointAvecNom.affCoordNom();

        // Modification du nom seulement
        pointAvecNom.setNom('B');

        // Affichage des coordonnées mises à jour et du nouveau nom
        pointAvecNom.affCoordNom();
    }
}