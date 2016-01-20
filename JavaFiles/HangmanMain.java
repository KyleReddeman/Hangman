import java.util.*;

public class HangmanMain {
   public static void main(String[] args) {
      System.out.println("Welcome to hangman!");
      Board b = new Board("Zodiac");
      Scanner input = new Scanner(System.in);
      while(!b.won()) {
         System.out.print("Enter Guess: ");
         String s = input.next();
         if(b.contains(s)) {
            b.set(s);
         }
         else {
            System.out.println("NOPE");
         }
         System.out.println(b);
      }
   }
}