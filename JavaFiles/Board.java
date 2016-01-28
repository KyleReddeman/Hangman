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
   
   public Board() {
      this("");
   }
   
   public void set(String s) {
      s = s.trim();
      char c = s.charAt(0);
      c = Character.toLowerCase(c);
      for(int i = 0; i < length; i++) {
         if(c == Character.toLowerCase(word.charAt(i))) {
            boardLetters[i] = word.charAt(i);
         }
      }
   }
   
   public boolean won() {
      return word.equalsIgnoreCase(toString());
   }
   
   public boolean contains(String s) { 
      s = s.trim();
      char c = s.charAt(0);
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
      for(int i = 0; i < length; i++) {
         s += boardLetters[i] + " ";
      }
      return s;
   }
}