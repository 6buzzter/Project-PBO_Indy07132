package Indy07132_View;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public final class Indy07132_Lihat {
    String col[] = {"nama", "alamat", "merk sepatu" ,"jenis cuci" ,"harga"};
    JFrame Lihat = new JFrame();
    JButton back,update;
    JTextArea area = new JTextArea();
    DefaultTableModel tblee = new DefaultTableModel(col,0);
    JTable table = new JTable(tblee);
    JScrollPane Scroll = new JScrollPane();
    JTextField nama, alamat, merksepatu, harga;
    JComboBox jeniscuci;
    JLabel nama1,alamat1,merksepatu1,jeniscuci1,harga1;
    String[] isi = {"Fast Clean", "Deep Clean", "Unyellowing"};
    int selectedRowIndex;
    
    public Indy07132_Lihat(){
        
        ambils();
        Lihat.setSize(720, 600);
        Lihat.setLayout(null);
        Lihat.getContentPane().setBackground(Color.PINK);
        back = new JButton("Selesai");
        nama1 = new JLabel("Nama Customer");
        nama1.setBounds(460,90, 600, 18);
        nama1.setFont(new Font("Times New Roman",Font.BOLD,18));
        Lihat.add(nama1);
        nama = new JTextField();
        nama.setEditable(false);
        nama.setBounds (460,110,200,18);
        Lihat.add(nama);
        alamat1 = new JLabel("Alamat Customer");
        alamat1.setBounds(460,130, 600, 18);
        alamat1.setFont(new Font("Times New Roman",Font.BOLD,18));
        Lihat.add(alamat1);
        alamat = new JTextField();
        alamat.setEditable(false);
        alamat.setBounds (460,150,200,18);
        Lihat.add(alamat);
        merksepatu1 = new JLabel("Merk Sepatu");
        merksepatu1.setBounds(460,170, 600, 18);
        merksepatu1.setFont(new Font("Times New Roman",Font.BOLD,18));
        Lihat.add(merksepatu1);
        merksepatu = new JTextField();
        merksepatu.setBounds (460,190,200,18);
        merksepatu.setEditable(false);
        Lihat.add(merksepatu);
        jeniscuci1 = new JLabel("Jenis Cuci");
        jeniscuci1.setBounds(460,210, 600, 18);
        jeniscuci1.setFont(new Font("Times New Roman",Font.BOLD,18));
        Lihat.add(jeniscuci1);
        jeniscuci = new JComboBox(isi);
        jeniscuci.setEditable(false);
        jeniscuci.setEnabled(false);
        jeniscuci.setBounds (460,230,200,18);
        Lihat.add(jeniscuci);
        harga1 = new JLabel("Harga Cuci");
        harga1.setBounds(460,250, 600, 18);
        harga1.setFont(new Font("Times New Roman",Font.BOLD,18));
        Lihat.add(harga1);
        harga = new JTextField();
        harga.setEditable(false);
        harga.setBounds (460,270,200,18);
        Lihat.add(harga);
        back.setBounds (160, 400, 200, 40);
        back.setBackground(Color.ORANGE);
        Lihat.add(back);
        update = new JButton("Update");
        update.setEnabled(false);
        update.setBounds (460, 340, 200, 40);
        update.setBackground(Color.ORANGE);
        Lihat.add(update);
        Scroll.setViewportView(table);
        Scroll.setBounds (30, 90, 400, 300);
        Lihat.add(Scroll);
        Lihat.setVisible(true);
        Lihat.setLocationRelativeTo(null);
        Lihat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jeniscuci.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JComboBox comboBox = (JComboBox) event.getSource();
                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("Fast Clean"))
                    harga.setText("15000");
                else if(selected.toString().equals("Deep Clean"))
                    harga.setText("25000");
                else if(selected.toString().equals("Unyellowing"))
                    harga.setText("20000");
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                selectedRowIndex = table.getSelectedRow();
                nama.setText(model.getValueAt(selectedRowIndex, 0).toString());
                nama.setEditable(true);
                alamat.setText(model.getValueAt(selectedRowIndex, 1).toString());
                alamat.setEditable(true);
                merksepatu.setText(model.getValueAt(selectedRowIndex, 2).toString());
                merksepatu.setEditable(true);
                int i=0;
                while(true){
                    if(!jeniscuci.getItemAt(i).toString()
                            .equals(model.getValueAt(selectedRowIndex, 3).toString()))
                        i++;
                    else {
                        jeniscuci.setEnabled(true);
                        jeniscuci.setSelectedIndex(i);
                        break;
                    }
                }
                harga.setText(model.getValueAt(selectedRowIndex, 4).toString());
                update.setEnabled(true);
            }
        });
        back.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed (ActionEvent ae){
                Indy07132_Beranda men = new Indy07132_Beranda();
                Lihat.dispose();
                }
            });
        update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
                Indy07132_Allobjectrl.home.lihat().get(selectedRowIndex).setNama(nama.getText());
                Indy07132_Allobjectrl.home.lihat().get(selectedRowIndex).setAlamat(alamat.getText());
                Indy07132_Allobjectrl.home.lihat().get(selectedRowIndex).setMerksepatu(merksepatu.getText());
                Indy07132_Allobjectrl.home.lihat().get(selectedRowIndex).setJeniscuci(jeniscuci.getSelectedItem().toString());
                Indy07132_Allobjectrl.home.lihat().get(selectedRowIndex).setHarga(harga.getText());
                tblee.setRowCount(0);
                ambils();
                Scroll.setViewportView(table);
                kosong();
            }
        });
    }
    public void ambils(){
        for (int i = 0; i < Indy07132_Allobjectrl.home.lihat().size(); i++){
            String nama2 = Indy07132_Allobjectrl.home.lihat().get(i).getNama();
            String alamat2 = Indy07132_Allobjectrl.home.lihat().get(i).getAlamat();
            String merkspatu2 = Indy07132_Allobjectrl.home.lihat().get(i).getMerksepatu();
            String jeniscuci2 = Indy07132_Allobjectrl.home.lihat().get(i).getJeniscuci();
            String harga2 = Indy07132_Allobjectrl.home.lihat().get(i).getHarga();
            Object[] data = {nama2,alamat2,merkspatu2,jeniscuci2,harga2};
    
            tblee.addRow((Object[]) data);
        }
    }
    public void kosong(){
        nama.setText(null);
        nama.setEditable(false);
        alamat.setText(null);
        alamat.setEditable(false);
        merksepatu.setText(null);
        alamat.setEditable(false);
        jeniscuci.setSelectedIndex(0);
        jeniscuci.setEditable(false);
        jeniscuci.setEnabled(false);
        harga.setText("15000");
        update.setEnabled(false);
        
    }
}
