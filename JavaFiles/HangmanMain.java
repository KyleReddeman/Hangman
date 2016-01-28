import java.util.*;

public class HangmanMain {
   
   public static Board board;
   public static void main(String[] args) {
      board = new Board("hello");
      /*System.out.println("Welcome to hangman!");
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
      }*/
      Frames frame = new Frames();
      
   }
}