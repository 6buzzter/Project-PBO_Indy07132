package Indy07132_View;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Indy07132_Beranda {
    JFrame Beranda = new JFrame();
    JLabel judul,subjudul;
    JButton Daftar,Lihat,Hapus;
    
    public Indy07132_Beranda(){
        Beranda.setSize(720,720);
        Beranda.setLayout(null);
        Beranda.getContentPane().setBackground(Color.YELLOW);
        judul = new JLabel("Sunday Clean");
        judul.setBounds(230, 10, 600, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        Beranda.add(judul);
        Beranda.getContentPane().setBackground(Color.YELLOW);
        subjudul = new JLabel("Make Your Shoes Perfect");
        subjudul.setBounds(250, 50, 600, 50);
        subjudul.setFont(new Font("Times New Roman",Font.BOLD,18));
        Beranda.add(subjudul);
        Daftar = new JButton("Daftar");
        Daftar.setBounds (250, 100, 180, 40);
        Daftar.setBackground(Color.ORANGE);
        Beranda.add(Daftar);
        Lihat = new JButton("Lihat");
        Lihat.setBounds (250, 150, 180, 40);
        Lihat.setBackground(Color.ORANGE);
        Beranda.add(Lihat);
        Hapus = new JButton("Ambil Cucian");
        Hapus.setBounds (250, 200, 180, 40);
        Hapus.setBackground(Color.ORANGE);
        Beranda.add(Hapus);
        Beranda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Beranda. setVisible(true);
        Beranda.setLocationRelativeTo(null);
        Daftar.addActionListener(new ActionListener()
{
    @Override
    public void actionPerformed (ActionEvent ae){
        Indy07132_Daftar daftar = new Indy07132_Daftar();
        Beranda.dispose();
        }
    });
        Lihat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
                Indy07132_Lihat lihat = new Indy07132_Lihat();
                Beranda.dispose();
            }
        });
        Hapus.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent ae){
                Indy07132_HapusData men = new Indy07132_HapusData();
                Beranda.dispose();
            }
        });
    }
}
