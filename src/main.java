import java.util.Scanner;
import java.util.Random;


public class main {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        gioco Gioco = new gioco();
        int valore_carta_trovata, valore_totale;
        int continua, asso, sconfitte = 0, vittorie = 0, partita = 1;

        System.out.println("\n Benvenuto in black jack!");

        while (partita == 1) {

            valore_totale = Gioco.trova_carta();
            System.out.println("\nil tuo valore totale è: ");
            System.out.println(valore_totale);
            System.out.println("\nvuoi continuare? digita 1 per si e 0 per no.");
            continua = scanner.nextInt();
            while (continua == 1) {
                valore_carta_trovata = Gioco.trova_carta();

                valore_totale = valore_totale + valore_carta_trovata;
                System.out.println("\nil tuo valore totale è: " + valore_totale);


                if (valore_totale == 21) {
                    System.out.println("\nComplimenti! hai vitno!");
                    vittorie = vittorie +1;
                    continua = 0;
                } else if (valore_totale > 21) {
                    System.out.println("\n Hai perso! ");
                    sconfitte = sconfitte +1;
                    continua = 0;
                } else {
                    System.out.println("\nvuoi continuare? digita 1 per si e 0 per no.");
                    continua = scanner.nextInt();
                }
            }
            System.out.println("\nHai vinto: " + vittorie + " partite e hai perso: " + sconfitte + " partite.");
            System.out.println("\n vuoi fare una nuova partita? digita 1 per si e 0 per no.");
            partita = scanner.nextInt();

        }
        return;
    }
}
