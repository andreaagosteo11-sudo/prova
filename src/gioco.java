import java.util.Random;
import java.util.Scanner;

public class gioco {

    public int trova_carta () {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int x;
        int asso;
        x = rand.nextInt(2,10);
        if (x == 10) {
            System.out.println("\nHai trovato un asso! digita 0 per farlo valere uno e 1 per farlo valere undici.");
            asso = scanner.nextInt();
            if (asso == 0) {
                x = 1;
            } else {
                x = 11;
            }
        }
        return x;

    }
}
