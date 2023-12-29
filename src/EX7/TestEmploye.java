package EX7;

public class TestEmploye {
    public static void main(String[] args) {
        Patron patron = new Patron("Dupont", "Jean", 5000.0);
        System.out.println(patron);
        System.out.println("Salaire du patron: " + patron.gains());

        TravailleurCommission tc = new TravailleurCommission("Martin", "Marie", 2000.0, 0.1);
        tc.setQuantite(100);
        System.out.println(tc);
        System.out.println("Salaire du travailleur à la commission: " + tc.gains());

        TravailleurHoraire th = new TravailleurHoraire("Tremblay", "Paul", 15.0);
        th.setHeures(80);
        System.out.println(th);
        System.out.println("Salaire du travailleur horaire: " + th.gains());
    }}
