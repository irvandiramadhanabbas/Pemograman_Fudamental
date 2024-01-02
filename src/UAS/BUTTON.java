package UAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BUTTON {
    private JButton button1;
    private JTextArea textArea1;
    private JPanel main;
    private JTextArea textArea2;

    public JPanel getMain(){return main;}

    public BUTTON() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonsetget abcd = new buttonsetget();
                textArea1.setText(String.valueOf(abcd.getUrutan()));
                textArea2.setText(String.valueOf(abcd.getTotal()));
            }
        });
    }
}
