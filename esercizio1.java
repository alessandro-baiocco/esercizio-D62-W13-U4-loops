import java.util.Scanner;


public class esercizio1 {

   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       esercizio1a(input);


   }



   private static void esercizio1a(Scanner input){
       System.out.println("inserire un numero");
       String str1Es1a = input.nextLine();
       System.out.println(stringaPariDispari(str1Es1a));
   }




   private static boolean stringaPariDispari(String a){
       int val1Es1a = Integer.parseInt(a);
       if(val1Es1a % 2 == 0){
           return true;
       }else {
           return false;
       }
   }
}
