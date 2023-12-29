package EX6;

abstract class Figure {
    protected String nom;

    public Figure() {
        this.nom = "Figure";
    }

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString() {
        return "Figure [nom=" + nom + "]";
    }
}

class Disque extends Figure {
    private Point centre;
    private double rayon;

    public Disque() {
        super("Disque");
        this.centre = new Point(0, 0);
        this.rayon = 1.0;
    }

    public Disque(Point centre, double rayon) {
        super("Disque");
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disque(Point centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getArea() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return "Disque [nom=" + nom + ", centre=" + centre + ", rayon=" + rayon + "]";
    }
}

class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle() {
        super("Rectangle");
        this.longueur = 1.0;
        this.largeur = 1.0;
    }

    public Rectangle(double longueur, double largeur) {
        super("Rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getArea() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle [nom=" + nom + ", longueur=" + longueur + ", largeur=" + largeur + "]";
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
