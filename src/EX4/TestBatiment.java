package EX4;

public class TestBatiment {
    public static void main(String[] args) {
        // Test de la classe Batiment
        Batiment batiment1 = new Batiment();
        Batiment batiment2 = new Batiment("123 Rue de la Ville");

        System.out.println(batiment1);
        System.out.println(batiment2);

        // Test de la classe Maison
        Maison maison1 = new Maison();
        Maison maison2 = new Maison("456 Rue du Quartier", 3);

        System.out.println(maison1);
        System.out.println(maison2);

        // Test de la classe Immeuble
        Immeuble immeuble1 = new Immeuble();
        Immeuble immeuble2 = new Immeuble("789 Rue de l'Immeuble", 10);

        System.out.println(immeuble1);
        System.out.println(immeuble2);
    }
}


