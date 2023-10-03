import java.util.Objects;
import java.util.Scanner;

public class Esercizio3While {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        esercizio3(input);
        input.close();
    }

    private static void esercizio3(Scanner input){
        while(true){
            String str1Es3 = input.next();
            if(Objects.equals(str1Es3, ":p"))break;
            System.out.println(str1Es3);
        }
    }

}
