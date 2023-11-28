package Es1;

public class Es1 {
    //Punto 1
    public static boolean strEvenOdd (String str) {
        return str.length() % 2 == 0;
    }

    //Punto 2
    public static boolean leapYear (int year){
        if(year % 4 == 0) {
            if (year % 100 == 0){
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        String str = "frase a caso";
        System.out.println("il numero di caratteri di " + str + " è " + (strEvenOdd(str) ? "pari" : "dispari"));

        int year = 2023;
        int nextYear= 2024;
        System.out.println("L'anno " + year + " è bisestile?" + leapYear(year));
        System.out.println("L'anno " + nextYear + " è bisestile?" + leapYear(nextYear));
    }
}