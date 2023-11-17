package tugas2;

import javax.swing.JOptionPane;
public class Authenticator2{
    public static void main(String[] args){
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");
        if ( username != null && password != null
                && (
                (username.equals("vandi") && password.equals("123")) ||
                        (username.equals("abbas") && password.equals("456"))
        )
        )
        {
            JOptionPane.showMessageDialog(null, "Kamu berhasil masuk");
        }	else {
            JOptionPane.showMessageDialog(null, "Penyusup");
        }
    }
}
