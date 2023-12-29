package EX3;

class Centre extends Point {
    private char nom;

    // Constructeur
    public Centre(int x, int y, char nom) {
        super(x, y); // Appelle le constructeur de la classe de base (Point)
        this.nom = nom;
    }

    // Méthode pour afficher le nom
    public void affNom() {
        System.out.println("Nom : " + nom);
    }

    // Méthode redéfinie pour afficher les coordonnées et le nom
    @Override
    public void affiche() {
        super.affiche(); // Appelle la méthode affiche de la classe de base (Point)
        affNom();
    }
}

class Cercle extends Centre {
    private double rayon;

    // Constructeur
    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom); // Appelle le constructeur de la classe de base (Centre)
        this.rayon = rayon;
    }

    // Méthode redéfinie pour afficher les coordonnées, le nom et le rayon du cercle
    @Override
    public void affiche() {
        super.affiche(); // Appelle la méthode affiche de la classe de base (Centre)
        System.out.println("Rayon : " + rayon);
    }
}
