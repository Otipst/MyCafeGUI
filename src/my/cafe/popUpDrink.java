/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nural
 */
public class popUpDrink extends javax.swing.JFrame {
    public menu Menu = null;
    public String item = null;
    public String price = null;
//    public popUpDrink popupdrink = null;

    /**
     * Creates new form popUpDrink
     */
    DefaultTableModel model;
    public popUpDrink() {
        
        initComponents();
        String [] judul ={"id","name","price","type"};
        model = new DefaultTableModel(judul,0);
        tblDrink.setModel(model);
        tampilkan();
           /*         
           try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/mycafe","root","");   
            String sql = "SELECT * FROM tbitem WHERE type LIKE 'Drink'";
            java.sql.Statement stat = cn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("id");
                String b = hasil.getString("name");
                String c = hasil.getString("price");
                String d = hasil.getString("type");

                
                String[] data={a,b,c,d};
                model.addRow(data);
                        }
                    } catch (Exception e) {
                }
        
        tampilkan();*/
    }
    
    private void tampilkan() {
        int row = tblDrink.getRowCount();
        for(int a=0; a < row; a++) {
            model.removeRow(0);
        }
        try {
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/mycafe","root","");
           ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM tbitem WHERE type LIKE 'Drink'");
           while(rs.next()) {
               String data []={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
               model.addRow(data);
           }
        } catch (SQLException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDrink = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(253, 203, 110));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDrink.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDrink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDrinkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDrink);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 197));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 600, 260));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DRINK MENU");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDrinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDrinkMouseClicked
        // TODO add your handling code here:
        /*int i = tabel1.getSelectedRow();
         new menu(model.getValueAt(i, 1).toString(), model.getValueAt(i, 2).toString());
        //newMenu.setVisible(true);*/
        //this.dispose();
        /*
        int Pilih = tblDrink.getSelectedRow();
        menu.id= tblDrink.getValueAt(Pilih, 0).toString();
        Menu.tahunajaran = tblDrink.getValueAt(Pilih, 1).toString();
        Menu.itemTerpilih();*/
        
        int i = tblDrink.getSelectedRow();
        item = (tblDrink.getValueAt(i,1).toString());
        price = (tblDrink.getValueAt(i,2).toString());
        
       // LItem.setText((tblDrink.getValueAt(i,1).toString()));
       // LPrice.setText((tblDrink.getValueAt(i,2).toString()));
        Menu.tItemName.setText(item);
        Menu.tPrice.setText(price);
        this.dispose();
        
    }//GEN-LAST:event_tblDrinkMouseClicked

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
            java.util.logging.Logger.getLogger(popUpDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popUpDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popUpDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popUpDrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new popUpDrink().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDrink;
    // End of variables declaration//GEN-END:variables
}