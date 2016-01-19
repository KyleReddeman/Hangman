public class Board {
   private char[] boardLetters;
   private int length;
   private String word;
   
   public Board(String word) {
      this.word = word;
      length = word.length();
      boardLetters = new char[length];
      for(int i = 0; i < length; i++) {
         char temp = word.charAt(i);
         if(temp != ' ') {
            boardLetters[i] = '_';      
         }
         else {
            boardLetters[i] = ' ';
         }
      }
   }
   
   public void set(char c) {
      c = Character.toLowerCase(c);
      for(int i = 0; i < length; i++) {
         if(c == Character.toLowerCase(word.charAt(i))) {
            boardLetters[i] = word.charAt(i);
         }
      }
   }
   
   public boolean contains(char c) { 
      c = Character.toLowerCase(c);
      for(int i = 0; i < length; i++) {
         if(c == Character.toLowerCase(word.charAt(i))) {
            return true;
         }
      }
      return false;
   }
   
   public String toString() {
      String s = "";
      for(int i = 0; i < 0; i++) {
         s += boardLetters[i];
      }
      return s;
   }
}