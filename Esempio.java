import java.util.Scanner;

public class Esempio {
    public static void main(String[] args) {

        // COMMENTO: sto provando lo scanner string con le condizioni
        Scanner myString = new Scanner(System.in);
        Scanner myInt = new Scanner(System.in);

        // prova pratica dello switch
        boolean i = true;
        String password;
        String nomeUtente;

        // Il mio software gira qui dentro
        while (i) {
            System.out.println("vuoi registrarti?  SI - NO");
            String risposta = myString.nextLine();
            if( risposta.equals("NO")){ i = false;}

            // qui andrò a fare il registratore FINITO E TESTATO
            while (i) {
                System.out.println("che password vuoi avere?");
                password = myString.nextLine();
                System.out.println("che Nome utente vuoi avere?");
                nomeUtente = myString.nextLine();
                System.out.println("Grazie sei registrato ");
            }

            // qui andrò a fare il loggin
            while (i) {






                // qui andrò a fare le altre scelte
                while (i) {


                    
                }

            }

        }

        myInt.close();
        myString.close();
    }
}
