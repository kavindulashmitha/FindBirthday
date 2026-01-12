
package findbirthday;

import javax.swing.JFrame;
public class FindBirthday {

    
    public static void main(String[] args) {
        
       JFrame frame = new JFrame("FindBirthday");

        birthday birth = new birthday();
        frame.setContentPane(birth);

        frame.setSize(600,450);
        frame.setLocation(600, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
     
    }
    
}
