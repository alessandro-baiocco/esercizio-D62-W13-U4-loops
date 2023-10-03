import java.util.Scanner;

public class Esercizio4For {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    esercizio4(input);

    input.close();
}


private static void esercizio4(Scanner input){

    System.out.println("inserire un numero");

        int num1Es4 = Math.abs(Integer.parseInt(input.nextLine()));

        for(int i = num1Es4; i >= 0 ; i--){
            System.out.println(i);
        }

}
}