import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {

     public static void main(String[] args) {

            while(true) {

            String name = JOptionPane.showInputDialog(null, "What is your name?");

            int choice = JOptionPane.showConfirmDialog(null, "Do you want to display your name?");

            if (choice == JOptionPane.YES_NO_OPTION) {

                JOptionPane.showMessageDialog(null, "Hello, " + name);
                break;
            }
         }

     }
    
}
