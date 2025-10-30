public class Program {
    public static void main(String[] args) {


        Familie f1 = new Familie("Max", "Anna");
        f1.addKind("Tomas");
        f1.addKind("Jessica");
        f1.addKind("Albert");

        System.out.println("Vater:  " + f1.getMitglied(Familie.Familienmitglied.Vater));
        System.out.println("Mutter: " + f1.getMitglied(Familie.Familienmitglied.Mutter));
        System.out.println("Kinder: " + f1.getMitglied(Familie.Familienmitglied.Kinder));


        Familie f2 = new Familie("Alex", "Eva");

        System.out.println("Vater:  " + f2.getMitglied(Familie.Familienmitglied.Vater));
        System.out.println("Mutter: " + f2.getMitglied(Familie.Familienmitglied.Mutter));
        System.out.println("Kinder: " + f2.getMitglied(Familie.Familienmitglied.Kinder));
        System.out.println();

        try {
            new Familie("", "Mia");
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }


}
