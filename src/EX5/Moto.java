package EX5;

class Moto extends Vehicule {
    private int nbRoues = 2;

    public Moto(int n) {
        super(n);
    }

    // Pas de constructeur explicite ici

    // Méthode toString redéfinie
    @Override
    public String toString() {
        return super.toString() + ", Nombre de roues : " + nbRoues;
    }
}
