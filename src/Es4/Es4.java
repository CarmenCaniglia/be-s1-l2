package Es4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Inserisci un numero");
        n = input.nextInt();

        for (int i = n; i >= 0; i--){
            System.out.println(i);
        }
        input.close();
    }
}
