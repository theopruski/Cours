import java.util.Scanner;
public class pgcd {
    private static Scanner scanner = new Scanner(System.in);    
    public static void main(String[] arg) {
        System.out.println("Calcul du PGCD.");
        System.out.print("Entrez un nombre :  ");
        int nb1 = scanner.nextInt();
        System.out.print("Entrez un autre nombre :  ");
        int nb2 = scanner.nextInt();        
        int a = nb1;
        int b = nb2;
        int x = 0;
 
        while (b != 0) {
            if (a >= b) {
                x = a;
                a = b;
                b = x;
            }
            b = b - a;
        }
        System.out.println("Le plus grand diviseur commun de " + nb1 + " et " + nb2 + " est " + a);
    }
}
