package EX2;

class PointNom extends Point {
  public char nom;

    // Constructeur
    public PointNom(int x, int y, char nom) {
        super(); // Appelle le constructeur de la classe de base (Point)
        setPointNom(x, y, nom);
    }

    // Méthode pour définir les coordonnées et le nom
    public void setPointNom(int x, int y, char nom) {
        super.Point(x, y); // Appelle la méthode Point de la classe de base pour définir les coordonnées
        this.nom = nom;
    }

    // Méthode pour définir seulement le nom
    public void setNom(char nom) {
        this.nom = nom;
    }

    // Méthode pour afficher les coordonnées et le nom
    public void affCoordNom() {
        System.out.println("Coordonnees : " + super.x+ " " + super.y + ", Nom : " + nom);
    }
}

