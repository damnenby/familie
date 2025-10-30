import java.util.ArrayList;

public class Familie {

    private ArrayList<String> mitglieder = new ArrayList<>();

    private void check(String s) {
        if (s == null || s.trim().isEmpty()) {
            throw new IllegalArgumentException("Die Familie ist leer");
        }
    }

    public Familie(String vater, String mutter) {
        check(vater);
        check(mutter);
        mitglieder.add(vater);
        mitglieder.add(mutter);
    }

    public void addKind(String kind) {
        check(kind);
        mitglieder.add(kind);

    }

    public enum Familienmitglied {
        Vater,
        Mutter,
        Kinder
    }

    public String getMitglied(Familienmitglied f) {
        if (f == Familienmitglied.Vater) {
            if (mitglieder.size() > 0) {
                return mitglieder.get(0);
            } else {
                return "";
            }
        } else if (f == Familienmitglied.Mutter) {
            if (mitglieder.size() > 1) {
                return mitglieder.get(1);
            } else {
                return "";
            }
        }

        if (f == Familienmitglied.Kinder) {
            if (mitglieder.size() <= 2) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 2; i < mitglieder.size(); i++) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(mitglieder.get(i));
            }
            return sb.toString();
        }
        return "";
    }
}
