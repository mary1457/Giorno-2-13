package esercizio1;

public class Main {
    public static void main(String[] args) {

        System.out.println(stringaPariDispari("Mario"));
        System.out.println(annoBisestile(2023));
    }

    public static boolean stringaPariDispari(String str) {

        return str.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {

        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);

    }
}