import java.awt.*;
import javax.swing.*;

public class Frames {
   private JFrame frame;
   private JPanel p1;
   private JPanel p2;
   private JPanel p3;
   private JPanel p4;
   private JPanel p5;
   private JButton yes;
   private JButton no;
   private JLabel title;
   private JLabel word;
   private int xSize, ySize;
   private Toolkit tk;
   private Font f1;
   private Font f2;
   private Board board;
   
   public Frames() {
      board = HangmanMain.board;
      f1 = new Font("Garamond", Font.PLAIN, 50);
      f2 = new Font("Times New Roman", Font.PLAIN, 50);
      Color c1 = new Color(204, 229, 255);
      frame = new JFrame();
      frame.setSize(800, 600);
      frame.setLayout(new BorderLayout(10, 10));
      frame.getContentPane().setBackground(new Color(153, 204, 255));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //frame.setExtendedState(Frame.MAXIMIZED_BOTH);
      
      p1 = new JPanel();
      p2 = new JPanel();
      p3 = new JPanel();
      word = new JLabel(board.toString());
      title = new JLabel("Hangman");
      word.setFont(f2);
      title.setFont(f1);
      
      p3.setSize(50, 50);
      
      GridBagConstraints c = new GridBagConstraints();
      
      Insets insets = new Insets(0, 0, 0, 0);
      insets.set(3, 0, 3, 0);//top, left, botton, right
      c.insets = insets;
      p1.add(title);
      p2.add(word);
      
      p1.setBackground(c1);
      p2.setBackground(c1);
      p3.setBackground(Color.WHITE);
      
      frame.add(p1, BorderLayout.NORTH);
      frame.add(p2, BorderLayout.SOUTH);
      frame.add(p3, BorderLayout.CENTER);
      
      p4 = new JPanel();
      p5 = new JPanel();
      p4.setBackground(new Color(153, 204, 255));
      p5.setBackground(new Color(153, 204, 255));
      p4.add(new JLabel("                    "));
      p5.add(new JLabel("                    "));
      frame.add(p4, BorderLayout.WEST);
      frame.add(p5, BorderLayout.EAST);
      frame.setVisible(true);
   }
}