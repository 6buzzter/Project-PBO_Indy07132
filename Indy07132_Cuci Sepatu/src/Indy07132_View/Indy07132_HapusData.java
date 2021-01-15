package Indy07132_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Indy07132_HapusData {
    JFrame Hapus = new JFrame();
    JButton back, hapus;
    JTextField nama1,merk1;
    JLabel ambil,nama,merk;
    public Indy07132_HapusData(){
        Hapus.setSize(720, 600);
        Hapus.setLayout(null);
        Hapus.getContentPane().setBackground(Color.ORANGE);
        ambil = new JLabel("Pengambilan Sepatu");
        ambil.setBounds(160, 10, 600, 50);
        ambil.setFont(new Font("Times New Roman",Font.BOLD,40));
        Hapus.add(ambil);
        nama = new JLabel("Nama Customer");
        nama.setBounds(160,70, 600, 30);
        nama.setFont(new Font("Times New Roman",Font.BOLD,18));
        Hapus.add(nama);
        nama1 = new JTextField();
        nama1.setBounds (160,100,200,30);
        Hapus.add(nama1);
        merk = new JLabel("Sepatu Customer");
        merk.setBounds(160, 140, 600, 30);
        merk.setFont(new Font("Times New Roman",Font.BOLD,18));
        Hapus.add(merk);
        merk1 =new JTextField();
        merk1.setBounds(160, 170, 200, 30);
        Hapus.add(merk1);
        hapus =new JButton("Ambil");
        hapus.setBounds(160, 210, 200, 40);
        Hapus.add(hapus);
        back = new JButton("Selesai");
        back.setBounds (160, 270, 200, 40);
        back.setBackground(Color.GREEN);
        Hapus.add(back);
        Hapus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hapus.setVisible(true);
        Hapus.setLocationRelativeTo(null);
        back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent ae){
            Indy07132_Beranda men = new Indy07132_Beranda();
            Hapus.dispose();
            }
        });
        hapus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
                try{  
            String nama = nama1.getText();
            String merksepatu = merk1.getText();
            Indy07132_Allobjectrl.home.ambil(nama, merksepatu);
            JOptionPane.showMessageDialog(null,"Sukses", "information", 
                    JOptionPane. INFORMATION_MESSAGE);
                kosong();
        }catch(Exception exception) {
        JOptionPane.showMessageDialog(null, "Data Salah", 
                "Pengambilan Gagal",JOptionPane. INFORMATION_MESSAGE);
            }
            }
        });
    }void kosong(){
        nama.setText(null);
        merk.setText(null);
    }
    }
