/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kelas.category;
/**
 *
 * @author coldp
 */
public class FrameCategory extends javax.swing.JFrame {

    /**
     * Creates new form FrameCategory
     */
    public FrameCategory() {
        initComponents();
        autoID();
        loadTabel();
    }

    void loadTabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Category");
        model.addColumn("Nama Category");

        try {
            category cat = new category();
            ResultSet data = cat.tampilCategory();

            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("category_id"),
                    data.getString("category_name"),});

            }

        } catch (SQLException sQLException) {
        }

        tCategory.setModel(model);

    }
    
     void autoID(){
        
        try {
            category cat = new category();
            ResultSet id = cat.autoID();
            
            if(id.next()){
                int auto = id.getInt("ID") + 1;
                tidCategory.setText(String.valueOf(auto));
            } else {
                tidCategory.setText("1");
            }
            
            
        } catch (SQLException sQLException) {
        }        
    }



   

    void reset() {
        autoID();
        tNameCategory.setText(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bHapus = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCategory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tidCategory = new javax.swing.JTextField();
        tNameCategory = new javax.swing.JTextField();
        bTambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        tCategory.setModel(new javax.swing.table.DefaultTableModel(
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
        tCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCategory);

        jLabel1.setText("Category ID");

        jLabel2.setText("Category Name");

        tidCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidCategoryActionPerformed(evt);
            }
        });

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tidCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNameCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bHapus)
                            .addComponent(bTambah)
                            .addComponent(bUbah))))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tidCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tNameCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(bTambah)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus)
                        .addGap(18, 18, 18)
                        .addComponent(bUbah)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tidCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidCategoryActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        try {
            category category = new category();
            category.setCategory_id(Integer.parseInt(tidCategory.getText()));
            category.setCategory_name(tNameCategory.getText());

           
            category.tambahCategory();

        } catch (SQLException sQLException) {
        }
        loadTabel();
        reset();
    }//GEN-LAST:event_bTambahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        try {
            category cty = new category();
              int categoryId = Integer.parseInt(tidCategory.getText());  // Mengambil ID dari text field dan mengkonversi ke integer
        cty.setCategory_id(categoryId);  // Mengatur ID kategori
        cty.hapusCategory(); 
        } catch (SQLException sQLException) {
        }
        loadTabel(); 
        reset();
    }//GEN-LAST:event_bHapusActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        // TODO add your handling code here:
        try {
            category cat = new category();
            cat.setCategory_id(Integer.parseInt(tidCategory.getText()));
            cat.setCategory_name(tNameCategory.getText());
            cat.ubahCategory();
        } catch (SQLException sQLException) {
        }

        reset();
        loadTabel();
    }//GEN-LAST:event_bUbahActionPerformed

    private void tCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCategoryMouseClicked
        int baris = tCategory.rowAtPoint(evt.getPoint());
        String username = tCategory.getValueAt(baris, 0).toString();
        String nama = tCategory.getValueAt(baris, 1).toString();

        tidCategory.setText(username);
        tidCategory.setEditable(false);
        tidCategory.setVisible(true);
        tidCategory.setVisible(true);
        tNameCategory.setText(nama);
    }//GEN-LAST:event_tCategoryMouseClicked

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
            java.util.logging.Logger.getLogger(FrameCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tCategory;
    private javax.swing.JTextField tNameCategory;
    private javax.swing.JTextField tidCategory;
    // End of variables declaration//GEN-END:variables
}