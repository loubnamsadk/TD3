package EX4;

class Batiment {
    private String adresse;

    // Constructeurs
    public Batiment() {
        this.adresse = "Adresse inconnue";
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    // Accesseurs et mutateurs
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Batiment [adresse=" + adresse + "]";
    }
}

class Maison extends Batiment {
    private int nbChambres;

    // Constructeurs
    public Maison() {
        super();
        this.nbChambres = 0;
    }

    public Maison(String adresse, int nbChambres) {
        super(adresse);
        this.nbChambres = nbChambres;
    }

    // Accesseurs et mutateurs
    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Maison [adresse=" + getAdresse() + ", nbChambres=" + nbChambres + "]";
    }
}

class Immeuble extends Batiment {
    private int nbAppart;

    // Constructeurs
    public Immeuble() {
        super();
        this.nbAppart = 0;
    }

    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }

    // Accesseurs et mutateurs
    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Immeuble [adresse=" + getAdresse() + ", nbAppart=" + nbAppart + "]";
    }
}
