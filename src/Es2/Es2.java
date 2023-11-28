package Es2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Inserisci un numero da 0 a 3: ");
        num = input.nextInt();

        switch (num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore, il numero deve essere compreso tra 0 e 3!");
                break;
        }
        input.close();
    }
}
