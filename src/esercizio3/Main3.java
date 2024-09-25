package esercizio3;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci una stringa (digita ':q' per uscire): ");
            String input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.println("Esci");
                break;
            }


            String[] caratteri = input.split("");
            String risultato = String.join(", ", caratteri);

            System.out.println(risultato);
        }

        scanner.close();
    }
}

