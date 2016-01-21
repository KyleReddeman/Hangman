import java.awt.*;
import javax.swing.*;

public class Frames {
   private JFrame frame;
   private JButton yes;
   private JButton no;
   private JLabel title;
   private JLabel info;
   private int xSize, ySize;
   private Toolkit tk;
   
   public Frames() {
      tk = Toolkit.getDefaultToolkit();
      xSize = ((int) tk.getScreenSize().getWidth());
      ySize = ((int) tk.getScreenSize().getWidth());
      frame = new JFrame();
      frame.setSize(xSize, ySize);
      frame.setExtendedState(Frame.MAXIMIZED_BOTH);
      //frame.setUndecorated(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      title = new JLabel("Hangman");
      
      frame.add(title);
      
      frame.setVisible(true);
   }
}