package tugas8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class mahasiswaform extends JFrame{
    private JTextArea textAreaNama;
    private JTextArea textAreaTL;
    private JTextArea textAreaAlamat;
    private JTextArea textAreaUsia;
    private JComboBox tgl;
    private JComboBox bln;
    private JComboBox thn;
    private JTextField tfnama;
    private JButton bproses;
    private JTextField tfalamat;
    private JLabel nama;
    private JPanel panelutama;

    public mahasiswaform() {
        this.setContentPane(panelutama);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        bproses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tfnama.getText();
                int tlTanggal = Integer.parseInt((String) tgl.getSelectedItem());
                int tlBulan = bln.getSelectedIndex() + 1;
                int tlTahun = Integer.parseInt ((String) thn.getSelectedItem());
                String alamat = tfalamat.getText();

                textAreaNama.setText("Nama          :" + " " + nama);
                textAreaTL.setText("Tanggal Lahir           :" + " " + tlTanggal + " " + bln.getSelectedItem() + " " + tlTahun);
                textAreaAlamat.setText("Alamat          :" + " " + alamat);

                LocalDate birthdate = LocalDate.of(tlTahun, tlBulan, tlTanggal);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(birthdate, currentDate);

                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();

                textAreaUsia.setText("Usia          :" + " " + years + " tahun, " + months + " bulan, " + days + " hari");
            }
        });
    }

    public static void main(String[] args) {
        mahasiswaform mahasiswaform = new mahasiswaform();
        mahasiswaform.setVisible(true);
    }
}
