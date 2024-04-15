package Jsva;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println(
                    "Inserisci gli ingredienti pubblici separati da spazio (IngredientePubblico1 IngredientePubblico2):");
            String[] ingredienti = scanner.nextLine().split(" ");
            PiattoSpeciale piatto = new PiattoSpeciale(ingredienti);

            System.out.println("Il prezzo totale del piatto è: " + piatto.getPrezzoTotale() + " euro");

            System.out.println("Desideri ordinare un altro piatto? (si/no)");
            String risposta = scanner.nextLine();
            if (!risposta.equalsIgnoreCase("si")) {
                break;
            }
        }

    }
}
