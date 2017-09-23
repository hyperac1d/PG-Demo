/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.postgres.app;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 *
 * @author XavierEricPapacoy
 */
public class Main extends javax.swing.JFrame {
    byte[] imgdata;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        UIC.DateChooser.setReadOnly(dcbday);
        //custom initialization
        PG.url = "jdbc:postgresql://localhost:5432/oten";
        PG.username = "postgres";
        PG.password = "123";
        PG.className = "org.postgresql.Driver";
        
        
        
        UIC.Frame.setDefault(this);
        
        String[] columns = {"ID","NAME","BIRTHDATE"};
        String whereClause = "1=1";
        String[][] records = PG.executeDQL("profile", columns, whereClause);
        UIC.Table.setModel(tblTask, records, columns);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        line_name = new javax.swing.JSeparator();
        txtname = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtcontact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dcbday = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTask = new javax.swing.JTable();
        lblIMAGE = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(925, 512));
        jPanel1.setMinimumSize(new java.awt.Dimension(925, 512));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 60, 110, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Birthdate");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 110, -1));

        line_name.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.add(line_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 118, 219, 10));

        txtname.setBackground(new java.awt.Color(240, 240, 240));
        txtname.setBorder(null);
        txtname.setOpaque(false);
        txtname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnameMouseClicked(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 87, 220, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 219, 30));

        jTextField3.setBackground(new java.awt.Color(240, 240, 240));
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 87, 220, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 219, 10));

        txtcontact.setBackground(new java.awt.Color(240, 240, 240));
        txtcontact.setBorder(null);
        txtcontact.setOpaque(false);
        jPanel1.add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 220, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Contact No.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, -1));

        dcbday.setDateFormatString("MM dd, yyyy");
        dcbday.setOpaque(false);
        jPanel1.add(dcbday, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 220, 30));

        tblTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTaskMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTask);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 410, 330));

        lblIMAGE.setBackground(new java.awt.Color(153, 153, 0));
        lblIMAGE.setOpaque(true);
        jPanel1.add(lblIMAGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 150, 120));

        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 80, -1));

        jButton2.setText("browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 80, -1));

        jButton3.setText("DELETE");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 80, -1));

        jButton4.setText("UPDATE");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setText("ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMouseClicked
        // TODO add your handling code here:
        line_name.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_txtnameMouseClicked
    
    //stackoverflow
    public Image stretchImage(String path,JLabel label)
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(path);
        Image scaledImage = image.getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_DEFAULT);
        return scaledImage;
    } 
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        
        //raw image to bytes
        File fimage = new File(filename);
        try{
            FileInputStream fis = new FileInputStream(fimage);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            imgdata = bos.toByteArray(); 
            
            //update JLabel to load image
            java.awt.Image image = stretchImage(filename,this.lblIMAGE);
            this.lblIMAGE.setIcon(new javax.swing.ImageIcon(image));
        }
        catch(Exception e){
            System.out.println("FileInputStream Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            String name = txtname.getText();
            String con = txtcontact.getText();
            String bday = UIC.DateChooser.getDate(dcbday);
            byte[] image = imgdata;
            
            
            Object[] values = {name, con, bday, image};
            String query = "INSERT INTO profile (name, contactno, birthdate, image) VALUES (?,?,?,?)";
            if(PG.executeDML(query, values)){
                javax.swing.JOptionPane.showMessageDialog(null, "New Profile has been created!");

                String[] columns = {"ID","NAME","CONTACTNO","BIRTHDATE"};
                String whereClause = "1=1";
                String[][] records = PG.executeDQL("profile", columns, whereClause);
                UIC.Table.setModel(tblTask, records, columns);            
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "An error occured while creating new task.");
            }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTaskMouseClicked
        // TODO add your handling code here:

        int id = UIC.Table.getSelectedRow(tblTask);
        
        String[] columns = {"ID","NAME","CONTACTNO", "BIRTHDATE", "IMAGE"};

        String whereClause = "id=" + id;
        String[][] records = PG.executeDQL("profile", columns, whereClause);

        lblID.setText(id+"");
        txtname.setText(records[0][1]);
        txtcontact.setText(records[0][2]);
        String date = records[0][3];
        try {
            java.util.Date date2 = new SimpleDateFormat("MM dd, yy").parse(date);
            dcbday.setDate(date2);
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try{
            byte[] in = PG.read("profile", "image", id, lblIMAGE);
            ImageIcon icon =new ImageIcon(in);

            //stretching image
            Image image = icon.getImage();
            Image scaledImage = image.getScaledInstance(lblIMAGE.getWidth(),lblIMAGE.getHeight(), Image.SCALE_DEFAULT);                                                                
            lblIMAGE.setIcon(new javax.swing.ImageIcon(scaledImage));  
        }
        catch(Exception e){
            System.out.println("Image Error: " + e.getMessage());
        }
       
    }//GEN-LAST:event_tblTaskMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dcbday;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIMAGE;
    private javax.swing.JSeparator line_name;
    private javax.swing.JTable tblTask;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
