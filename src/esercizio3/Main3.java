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


            StringBuilder risultato = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                risultato.append(input.charAt(i));
                if (i < input.length() - 1) {
                    risultato.append(", ");
                }
            }


            System.out.println("Caratteri separati da virgola: " + risultato);
        }


        scanner.close();
    }


}
