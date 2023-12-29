package EX5;

class Avion extends Vehicule {
    private int nbMoteur;

    // Question 4
    // Constructeur avec un seul paramètre nbP
    public Avion(int nbP) {
        super(nbP); // Utilisation du constructeur de la classe de base
    }

    // Constructeur avec deux paramètres nbP et nbM
    public Avion(int nbP, int nbM) {
        this(nbP); // Appel du constructeur avec un seul paramètre
        nbMoteur = nbM;}}