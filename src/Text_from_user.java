import java.util.Scanner;

public class Text_from_user {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Imię:");
        String Imie = scanner.nextLine();
        System.out.println("Podaj Nazwisko:");
        String Nazwisko = scanner.nextLine();
        System.out.println("Podaj wiek:");
        int Wiek = scanner.nextInt();
        System.out.println("Witaj " + Imie +" "+ Nazwisko +" "+ Wiek);
    }
}
