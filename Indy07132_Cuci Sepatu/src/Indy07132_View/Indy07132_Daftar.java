package Indy07132_View;
import Indy07132_Entity.Indy07132_customer;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Indy07132_Daftar {
        JFrame Daftar = new JFrame();
        JButton back, daftar;
        JTextField nama1,alamat1,merksepatu1,jenis1,harga1;
        JLabel daftarcust,nama,alamat,merksepatu,harga,jenis;
        JComboBox jeniss;
        String[] isi = {"Fast Clean", "Deep Clean", "Unyellowing"};
    public Indy07132_Daftar(){
        Daftar.setSize(720, 600);
        Daftar.setLayout(null);
        Daftar.getContentPane().setBackground(Color.PINK);
        daftarcust = new JLabel("Pendaftaran Customer");
        daftarcust.setBounds(160, 10, 600, 50);
        daftarcust.setFont(new Font("Times New Roman",Font.BOLD,40));
        Daftar.add(daftarcust);
        nama = new JLabel("Nama Customer");
        nama.setBounds(160,70, 600, 18);
        nama.setFont(new Font("Times New Roman",Font.BOLD,18));
        Daftar.add(nama);
        nama1 = new JTextField();
        nama1.setBounds (160,90,200,18);
        Daftar.add(nama1);
        alamat = new JLabel("Alamat Customer");
        alamat.setBounds(160, 110, 600, 18);
        alamat.setFont(new Font("Times New Roman",Font.BOLD,18));
        Daftar.add(alamat);
        alamat1 =new JTextField();
        alamat1.setBounds(160, 130, 200, 18);
        Daftar.add(alamat1);
        merksepatu = new JLabel("Merk Sepatu");
        merksepatu.setBounds(160, 150, 600, 18);
        merksepatu.setFont(new Font("Times New Roman",Font.BOLD,18));
        Daftar.add(merksepatu);
        merksepatu1 =new JTextField();
        merksepatu1.setBounds(160, 170, 200, 18);
        Daftar.add(merksepatu1);
        jenis = new JLabel("Jenis Cuci");
        jenis.setBounds(160, 190, 600, 18);
        jenis.setFont(new Font("Times New Roman",Font.BOLD,18));
        Daftar.add(jenis);
        jeniss =new JComboBox(isi);
        jeniss.setBounds(160, 210, 200, 18);
        Daftar.add(jeniss);
        harga = new JLabel("Harga Cuci");
        harga.setBounds(160, 230, 600, 18);
        harga.setFont(new Font("Times New Roman",Font.BOLD,18));
        Daftar.add(harga);
        harga1 =new JTextField("15000");
        harga1.setBounds(160, 250, 200, 18);
        Daftar.add(harga1);
        daftar = new JButton("Daftar");
        daftar.setBounds (160, 290, 200, 40);
        daftar.setBackground(Color.GREEN);
        Daftar.add(daftar);
        back = new JButton("Selesai");
        back.setBounds (160, 340, 200, 40);
        back.setBackground(Color.ORANGE);
        Daftar.add(back);
        Daftar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Daftar. setVisible(true);
        Daftar.setLocationRelativeTo(null);
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae){
            Indy07132_Beranda men = new Indy07132_Beranda();
            Daftar.dispose();
            }
        });
        daftar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){ 
            String nama = nama1.getText();
            String alamat = alamat1.getText();
            String merksepatu = merksepatu1.getText();
            String jeniscuci = jeniss.getSelectedItem().toString();
            String harga = harga1.getText();
            Indy07132_Allobjectrl.home.inputdata(new Indy07132_customer
                (nama,alamat,merksepatu,jeniscuci,harga));
            JOptionPane.showMessageDialog(null,"Registrasi Sukses", 
                    "information", JOptionPane. INFORMATION_MESSAGE);
                kosong();
            }
        });
        jeniss.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JComboBox comboBox = (JComboBox) event.getSource();

                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("Fast Clean"))
                    harga1.setText("15000");
                else if(selected.toString().equals("Deep Clean"))
                    harga1.setText("25000");
                else if(selected.toString().equals("Unyellowing"))
                    harga1.setText("20000");
            }
        });
    }
    
    void kosong(){
        nama1.setText(null);
        alamat1.setText(null);
        merksepatu1.setText(null);
        jeniss.setSelectedIndex(0);
        harga1.setText("15000");
    }
}
