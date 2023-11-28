package Es3;

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci qui il testo (:q per uscire):");
            String text = input.nextLine();

            if(":q".equals(text)){
                System.out.println("Esco dal programma!");
                break;
            }else{
                String result = text.replaceAll(" ", "").replaceAll("",",");
                result = result.substring(1, result.length() -1); // mi serve per eliminare il primo e l'ultimo carattere che in questo caso vengono trascritte come virgole
                System.out.println(result);
            }
        }
        input.close();
    }
}
