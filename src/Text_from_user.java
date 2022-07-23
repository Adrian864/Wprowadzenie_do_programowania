import java.util.Scanner;

public class Text_from_user {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Witaj " + userInput);
    }
}
