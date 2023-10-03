import java.util.Scanner;


public class Esercizio1IfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        esercizio1a(input);

        System.out.println("-----------------------");

        esercizio1b(input);

        input.close();


    }


    private static void esercizio1a(Scanner input) {

        System.out.println("inserire un numero");

        String str1Es1a = input.nextLine();

        System.out.println(stringaPariDispari(str1Es1a));
    }




    /* ------------------------------------------------*/

    private static boolean stringaPariDispari(String a) {

        int val1Es1a = Integer.parseInt(a);

        if (val1Es1a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*------------------------------------------------------------------------*/

    private static void esercizio1b(Scanner input) {

        System.out.println("inserisci un'anno per vedere se bisestile");


        if (input.hasNextInt()) {
            int val1Es1b = input.nextInt();
            System.out.println(annoBisestile(val1Es1b));
        } else {
            System.out.println("non è un numero");

        }
    }

    private static boolean annoBisestile(int a) {

        if (a % 4 == 0 && (a % 100 == 0 && a % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }
}