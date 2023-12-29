package EX7;

abstract class Employe {
    protected String nom;
    protected String prenom;

    public Employe() {
        this.nom = "Nom";
        this.prenom = "Prenom";
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public abstract double gains();

    @Override
    public String toString() {
        return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
    }
}

class Patron extends Employe {
    private double salaire;

    public Patron() {
        super();
        this.salaire = 0.0;
    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public double gains() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Patron [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
    }
}

class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission() {
        super();
        this.salaire = 0.0;
        this.commission = 0.0;
        this.quantite = 0;
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
        this.quantite = 0;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public double gains() {
        return salaire + commission * quantite;
    }

    @Override
    public String toString() {
        return "TravailleurCommission [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire
                + ", commission=" + commission + ", quantite=" + quantite + "]";
    }
}

class TravailleurHoraire extends Employe {
    private double retribution;
    private int heures;

    public TravailleurHoraire() {
        super();
        this.retribution = 0.0;
        this.heures = 0;
    }

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
        this.heures = 0;
    }

    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire [nom=" + nom + ", prenom=" + prenom + ", retribution=" + retribution
                + ", heures=" + heures + "]";
    }
}



