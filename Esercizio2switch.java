import java.util.Scanner;

public class Esercizio2switch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(esercizio2(input));

    }

    private static String esercizio2(Scanner input){
        System.out.println("inserire un valore");
        int val1Es2 = Integer.parseInt(input.nextLine());
        switch (val1Es2){
            case 0:{
                return "il valore è 0";
            }
            case 1:{
                return "il valore è 1";
            }
            case 2:{
                return "il valore è 2";
            }
            case 3:{
                return "il valore è 3";
            }
            default:{
                return "il valore dato non è compreso tra 0 e 3 o non è un numero";
            }
        }
    }
}
