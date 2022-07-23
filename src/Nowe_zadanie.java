import java.util.Objects;
import java.util.Scanner;
public class Nowe_zadanie {
    public static void main(String[] args) {
        /*
          1.chce aby w programie było pytanie o imię, nazwisko, wiek
          2.chce zeby po zapytaniu o wiek była petla sprawdzajaca czy osoba jest pelnoletnia czy nie
         */
        String[] wygrani = new String[]{"Ania", "Zosia", "Magda", "Piotrek", "Adam"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Imie:");
        String Imie = scanner.next();
        System.out.println("Podaj Nazwisko:");
        String Nazwisko = scanner.next();
        System.out.println("Podaj Wiek:");
        int Wiek = scanner.nextInt();
        if (Wiek > 18) {
            System.out.println("Zapraszamy: ");
            for (String wygrany : wygrani) {
                if (Objects.equals(Imie, wygrany)) {
                    System.out.println("Darmowy shot dla ciebie!");
                }
            }
        }
        else System.out.println("Spierdalaj smarku");


    }
}
