package UAS;

import javax.swing.*;

public class RunButton {
    public static void main(String[] args) {
        JFrame data = new JFrame();
        data.setContentPane(new BUTTON().getMain());
        data.setVisible(true);
        data.setSize(1920,1080);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setLocationRelativeTo(null);
    }
}
