import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("---Willkommen bei der Umsatzzahlenstatistik---");

        int anzahlZahlen = 100; // Anzahl der zufällig generierten Umsatzzahlen
        double[] umsaetze = new double[anzahlZahlen];

        // Zufällige Umsatzzahlen generieren
        for (int i = 0; i < anzahlZahlen; i++) {
            umsaetze[i] = random.nextDouble() * 5000; // Generiert eine Zahl zwischen 0 und 5000
        }

        // Umsatzzahlen tabellarisch ausgeben
        printUmsaetze(umsaetze);

        // Min und Max berechnen und ausgeben
        double minWert = findMin(umsaetze);
        double maxWert = findMax(umsaetze);

        System.out.printf("Der Maximalwert der Umsatzzahlen beträgt: %.2f%n", maxWert);
        System.out.printf("Der Minimalwert beträgt: %.2f%n", minWert);
    }

    public static double findMin(double[] umsaetze) {
        double min = umsaetze[0];
        for (int i = 0; i < umsaetze.length; i++) {
            if (umsaetze[i] < min) {
                min = umsaetze[i];

            }
        }
        return min;
    }

    public static double findMax(double[] umsaetze) {
        // Setze den ersten Wert im Array als das aktuelle Maximum
        double max = umsaetze[0];

        // Durchlaufe das Array ab dem zweiten Element (Index 1)
        for (int i = 1; i < umsaetze.length; i++) {
            // Vergleiche jedes Element mit dem aktuellen Maximum
            if (umsaetze[i] > max) {
                // Wenn ein größerer Wert gefunden wird, setze ihn als neues Maximum
                max = umsaetze[i];
            }
        }

        // Gib das gefundene Maximum zurück
        return max;
    }

    // Methode zur Ausgabe der Umsatzzahlen in tabellarischer Form
    public static void printUmsaetze(double[] umsaetze) {
        int count = 0;
        for (int i = 0; i < umsaetze.length; i++) {
            System.out.printf("%10.2f", umsaetze[i]); // Formatierte Ausgabe
            count++;
            if (count == 10) { // Nach 10 Zahlen einen Zeilenumbruch machen
                System.out.println();
                count = 0;
            }
        }
    }
}


