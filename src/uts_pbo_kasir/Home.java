/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pbo_kasir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Home extends javax.swing.JFrame {
    /**
     * Creates new form Home
     */
    String nol_jam = "";
    String nol_menit = "";
    String nol_detik = "";
    
    public Home() {
        initComponents();
        setTanggal();
        setJam();
        setKasir();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        lblJam = new javax.swing.JLabel();
        kasir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Hrg_mkn = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Hrg_mnm = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        item_mnm = new javax.swing.JTextField();
        item_mkn = new javax.swing.JTextField();
        diskon = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mkn = new javax.swing.JLabel();
        mkn1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tData = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        print = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        kembali = new javax.swing.JTextField();
        btotal = new javax.swing.JButton();
        bbayar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        minum = new javax.swing.JLabel();
        makan = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        jLabel17.setText("Rp. 20000");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resto zZz ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 90, 22);

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Best Resto");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 50, 160, 15);
        jPanel2.add(tanggal);
        tanggal.setBounds(640, 60, 110, 20);
        jPanel2.add(lblJam);
        lblJam.setBounds(790, 60, 100, 20);
        jPanel2.add(kasir);
        kasir.setBounds(480, 60, 100, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1180, 90);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Daftar Menu");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 10, 90, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nasgor Batak    Rp.25000,00  ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 60, 170, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Roti bakar        Rp.10000,00");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 90, 170, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nasi campur     Rp.20000,00");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 160, 170, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Mie Godok       Rp.15000,00");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 120, 170, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Makanan");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel18);
        jLabel18.setBounds(10, 40, 60, 14);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Sogem               Rp.25000,00");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(180, 60, 180, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Teh anget          Rp.10000,00");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(180, 90, 180, 15);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Milk Shake Coklat  Rp.20000,00");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(180, 160, 180, 20);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Kopi                   Rp.15000,00");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(180, 120, 180, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Minuman");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel27);
        jLabel27.setBounds(180, 40, 60, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(820, 90, 360, 330);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Pesan");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 20, 90, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Makanan");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 120, 80, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Harga");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 170, 60, 20);

        Hrg_mkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hrg_mknActionPerformed(evt);
            }
        });
        jPanel3.add(Hrg_mkn);
        Hrg_mkn.setBounds(110, 160, 100, 30);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Minuman");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(20, 220, 80, 20);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Harga");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(20, 270, 60, 20);

        Hrg_mnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hrg_mnmActionPerformed(evt);
            }
        });
        jPanel3.add(Hrg_mnm);
        Hrg_mnm.setBounds(110, 260, 100, 30);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Id_Transaksi");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(20, 60, 80, 20);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel3.add(id);
        id.setBounds(110, 60, 130, 30);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear);
        clear.setBounds(470, 290, 70, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Makanan yang mau dipesan--", "Nasgor Batak", "Roti Bakar", "Mie Godok", "Nasi Campur" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(110, 120, 200, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Minuman yang mau dipesan--", "Sogem", "Teh Anget", "Kopi", "Milk Shake Coklat" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(110, 210, 210, 30);

        item_mnm.setText("1");
        jPanel3.add(item_mnm);
        item_mnm.setBounds(340, 210, 30, 30);

        item_mkn.setText("1");
        item_mkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_mknActionPerformed(evt);
            }
        });
        jPanel3.add(item_mkn);
        item_mkn.setBounds(340, 120, 30, 30);
        jPanel3.add(diskon);
        diskon.setBounds(460, 70, 0, 0);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel9.setText("Jml");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(340, 190, 20, 13);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel12.setText("Jml");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(340, 100, 20, 13);

        mkn.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(mkn);
        mkn.setBounds(390, 20, 80, 30);

        mkn1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(mkn1);
        mkn1.setBounds(390, 20, 80, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 90, 560, 330);

        tData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Kasir", "Makanan", "Harga makanan", "Minuman", "Harga minnuman", "Total", "Bayar", "Kembali"
            }
        ));
        tData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tData);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(150, 430, 960, 190);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(null);

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel5.add(save);
        save.setBounds(20, 20, 90, 30);

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel5.add(refresh);
        refresh.setBounds(20, 60, 90, 30);

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel5.add(print);
        print.setBounds(20, 110, 90, 30);

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel5.add(delete);
        delete.setBounds(20, 160, 90, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 420, 140, 210);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(null);

        jLabel31.setText("Total");
        jPanel4.add(jLabel31);
        jLabel31.setBounds(30, 30, 50, 14);

        total.setEditable(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel4.add(total);
        total.setBounds(30, 50, 130, 30);

        jLabel32.setText("Bayar");
        jPanel4.add(jLabel32);
        jLabel32.setBounds(30, 90, 70, 14);
        jPanel4.add(bayar);
        bayar.setBounds(30, 110, 130, 30);

        jLabel33.setText("Kembali");
        jPanel4.add(jLabel33);
        jLabel33.setBounds(30, 150, 120, 14);

        kembali.setEditable(false);
        jPanel4.add(kembali);
        kembali.setBounds(30, 170, 130, 30);

        btotal.setText("Total");
        btotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btotalActionPerformed(evt);
            }
        });
        jPanel4.add(btotal);
        btotal.setBounds(20, 220, 73, 30);

        bbayar.setText("Bayar");
        bbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbayarActionPerformed(evt);
            }
        });
        jPanel4.add(bbayar);
        bbayar.setBounds(120, 220, 70, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(580, 90, 230, 330);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(null);

        minum.setBackground(new java.awt.Color(204, 204, 255));
        minum.setForeground(new java.awt.Color(204, 204, 255));
        jPanel6.add(minum);
        minum.setBounds(0, 120, 0, 0);

        makan.setBackground(new java.awt.Color(204, 204, 255));
        makan.setForeground(new java.awt.Color(204, 204, 255));
        jPanel6.add(makan);
        makan.setBounds(0, 100, 0, 0);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(560, 90, 20, 330);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setLayout(null);
        getContentPane().add(jPanel7);
        jPanel7.setBounds(810, 90, 10, 330);

        setSize(new java.awt.Dimension(1201, 669));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Hrg_mknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hrg_mknActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hrg_mknActionPerformed

    private void Hrg_mnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hrg_mnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hrg_mnmActionPerformed

    private void tDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDataMouseClicked
        // TODO add your handling code here:
       
   
    }//GEN-LAST:event_tDataMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
         if ("".equals(id.getText()) || "".equals(Hrg_mkn.getText()) || "".equals(Hrg_mnm.getText()) || "".equals(bayar.getText()) || kembali.equals("") || "".equals(total.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data","ERROR", JOptionPane.WARNING_MESSAGE);
        } else {
            String SQL = "INSERT INTO tb_harga (id,kasir,makanan,hrg_makan,minum,hrg_minum,bayar,kembali,total) " + "VALUES('"+id.getText()+"','"+kasir.getText()+"','"+mkn.getText()+"','"+Hrg_mkn.getText()+"','"+mkn1.getText()+"','"+Hrg_mnm.getText()+"','"+bayar.getText()+"','"+kembali.getText()+"','"+total.getText()+"')";                    
            int status = KoneksiDB.execute(SQL);
        if (status == 1) {
            JOptionPane.showMessageDialog(this,"Data berhasil ditambahkan","Sukses",JOptionPane.INFORMATION_MESSAGE);
            selectData();
        }
        else{
            JOptionPane.showMessageDialog(this,"Data gagal ditambahkan","Gagal",JOptionPane.WARNING_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_saveActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        id.setText("");
        Hrg_mkn.setText("");
        Hrg_mnm.setText("");
        bayar.setText("");
        total.setText("");
        kembali.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
         MessageFormat header = new MessageFormat("Biodata Siswa SMK TELKOM MALANG");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)");
        
        try {
            tData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        }catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot Print %s%n", e.getMessage());
        }
                                           

    }//GEN-LAST:event_printActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String mnm;Double hsl = 0.0;       
        Double a ;
        a = Double.parseDouble(item_mnm.getText().toString());
         
        if (jComboBox2.getSelectedItem().equals("Sogem")){
            mnm = "Sogem";
            mkn1.setText("Sogem");
            Hrg_mnm.setText("25000");
            hsl = 25000 * a;
            Hrg_mnm.setText(hsl.toString());
           }
        else
        if( jComboBox2.getSelectedItem().equals("Teh Anget")){
             mnm = ("Teh Anget");
             mkn1.setText("Teh Anget");
             Hrg_mnm.setText("10000");
             hsl = 10000 * a;
             Hrg_mnm.setText(hsl.toString());
        }
        else
        if( jComboBox2.getSelectedItem().equals("Kopi")){
            mnm=("Kopi ");
            mkn1.setText("Kopi");
            Hrg_mnm.setText("15000");       
            hsl = 15000 * a;
            Hrg_mnm.setText(hsl.toString());
        }
         else
        if( jComboBox2.getSelectedItem().equals("Milk Shake Coklat")){
            mnm =("Milk Shake Coklat");
            mkn1.setText("Milk Shake Coklat");
            Hrg_mnm.setText("20000");       
            hsl = 20000 * a;
            Hrg_mnm.setText(hsl.toString());
        }else {
            mnm = null;
                    }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String Makanan;
        Double hsl = 0.0;       
        Double a ;
        a = Double.parseDouble(item_mkn.getText().toString());
       
        if (jComboBox1.getSelectedItem().equals("Nasgor Batak")){
            Makanan = "Nasgor Batak";
            mkn.setText("Nasgor Batak");
            Hrg_mkn.setText("25000");
            hsl = 25000 * a;
            Hrg_mkn.setText(hsl.toString());
           }
        else
        if( jComboBox1.getSelectedItem().equals("Roti Bakar")){
            Makanan = ("Roti Bakar");
            mkn.setText("Roti Bakar");
            Hrg_mkn.setText("10000");
            hsl = 10000 * a;
            Hrg_mkn.setText(hsl.toString());
        }
        else
        if( jComboBox1.getSelectedItem().equals("Mie Godok")){
            Makanan=("Mie Godok ");
             Makanan=("Mie Godok ");
            Hrg_mkn.setText("15000");   
            hsl = 15000 * a;
            Hrg_mkn.setText(hsl.toString());
        }
         else
        if( jComboBox1.getSelectedItem().equals("Nasi Campur")){
            Makanan=("Nasi Campur ");
            mkn.setText("Nasi Campur");
            Hrg_mkn.setText("20000");    
            hsl = 20000 * a;
            Hrg_mkn.setText(hsl.toString());
        }else {
            Makanan = null;
                    }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_refreshActionPerformed

    private void btotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btotalActionPerformed
        // TODO add your handling code here:
         Double hsl,hsi,hso = 0.00;
        Double a1,a2,a3,a4;
        a1 = Double.parseDouble(Hrg_mkn.getText().toString());
        a2 = Double.parseDouble(Hrg_mnm.getText().toString());
        hsl = a1+a2;
        
           if (hsl > 200000) {
            diskon.setText("Anda Mendapatkan Diskon 10% \n dengan harga asli = Rp. "+ hsl);
            hsi = (hsl * 10) / 100;
            hso = hsl - hsi;
            total.setText("Rp. "+hso.toString()+"0");
        }else if(hsl < 200000){
            diskon.setText("Anda belanja masih di bawah Rp. 200.000 ");
            total.setText("Rp. "+hsl.toString()+"0");
        }else{
            JOptionPane.showMessageDialog(this, "Data belum di tambahkan", "Warning!!!", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
       
    }//GEN-LAST:event_btotalActionPerformed

    private void item_mknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_mknActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_mknActionPerformed

    private void bbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbayarActionPerformed
        // TODO add your handling code here:
         Double hsl = 0.00;
        Double a, b, c ;
        a = Double.parseDouble(Hrg_mkn.getText().toString());
        b = Double.parseDouble(Hrg_mnm.getText().toString());
        c = Double.parseDouble(bayar.getText().toString());
        
        hsl = c - (a + b) ;
        kembali.setText("RP. "+hsl.toString()+"0");
        bayar.setText("RP. "+c+"0");
    }//GEN-LAST:event_bbayarActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int baris = tData.getSelectedRow();
        if(baris != -1){
            String Id = tData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_harga WHERE id='"+Id+"'";
            int status = KoneksiDB.execute(SQL);
            if (status == 1){
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus","SUSES",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Data GAGAL Dihapus","GAGAL",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Terlebih Dahulu","ERROR",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hrg_mkn;
    private javax.swing.JTextField Hrg_mnm;
    private javax.swing.JTextField bayar;
    private javax.swing.JButton bbayar;
    private javax.swing.JButton btotal;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JLabel diskon;
    private javax.swing.JTextField id;
    private javax.swing.JTextField item_mkn;
    private javax.swing.JTextField item_mnm;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel kasir;
    private javax.swing.JTextField kembali;
    private javax.swing.JLabel lblJam;
    private javax.swing.JLabel makan;
    private javax.swing.JLabel minum;
    private javax.swing.JLabel mkn;
    private javax.swing.JLabel mkn1;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JTable tData;
    private javax.swing.JLabel tanggal;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
       String kolom[] = {"ID","Kasir","Makanan","Harga Makanan","Minuman","Harga Minuman","Bayar","Kembali","Total"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_harga";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        
        try
        {
            rs = KoneksiDB.executeQuery(SQL);
            while(rs.next())
            {
                String id = rs.getString(1);
                String kasir = rs.getString(2);
                String makanan = rs.getString(3);
                String hrg_makan = rs.getString(4);
                String minum = rs.getString(5);
                String hrg_minum = rs.getString(6);
                String bayar = rs.getString(7);
                String kembali = rs.getString(8);
                String total = rs.getString(9);
                
                String data[] = {id,kasir,makanan,hrg_makan,minum,hrg_minum,bayar,kembali,total};
                dtm.addRow(data);
            }
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        tData.setModel(dtm); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTanggal() {
       java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new
        java.text.SimpleDateFormat("dd/MM/yyyy");
        tanggal.setText(kal.format(skrg));
    }

    private void setJam() {
       ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if (nilai_jam <= 9) {
                    nol_jam = "0";
                }
                if (nilai_menit <=9) {
                    nol_menit = "0";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "0";
                }
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                lblJam.setText("Jam "+jam+ ":" + menit +":"+detik);
            }
        };
    new Timer(100, taskPerformer).start();
    }

    private void setKasir() {
         String SQL = "SELECT * FROM tb_akun";
        ResultSet result = KoneksiDB.executeQuery(SQL);
        try {
            while(result.next()){
                String namaKasir = result.getString(1);
                kasir.setText(namaKasir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
