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

        Familie f3 = new Familie(Familie.Familienmitglied.Mutter, "Sofia");
        f3.addKind("Nico");
        System.out.println("Vater:  " + f3.getMitglied(Familie.Familienmitglied.Vater));
        System.out.println("Mutter: " + f3.getMitglied(Familie.Familienmitglied.Mutter));
        System.out.println("Kinder: " + f3.getMitglied(Familie.Familienmitglied.Kinder));

        for (String name : f3) {
            System.out.println(name);
        }

        for (String name : f1) {
            System.out.println(name);
        }
    }


}
