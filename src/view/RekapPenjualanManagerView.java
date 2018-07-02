package view;

import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author World
 */
public class RekapPenjualanManagerView extends javax.swing.JFrame {

    private Object[] header = {"No","ID Pesanan", "ID Produk", "Nama Produk", "Qty", "Total Harga"};
    DefaultTableModel tableModel = new DefaultTableModel(null, header);
    
    public RekapPenjualanManagerView() {
        initComponents();
    }

    
    public JTable getTabelRekapnManager(JTable tabelRekapPenjualanManager) {
        return tabelRekapPenjualanManager;
    }

    public void addTableModel(DefaultTableModel model) {
        tabelRekapPenjualanManager.setModel(model);
    }

    public void tabelListener(MouseListener m) {
        tabelRekapPenjualanManager.addMouseListener(m);
    }
    
    public String getValueAt(int baris, int kolom) {
        return (String) this.tabelRekapPenjualanManager.getValueAt(baris, kolom);
    }
                                  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHomeManager = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRekapPenjualanManager = new javax.swing.JTable();
        Frame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHomeManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnHome.png"))); // NOI18N
        btnHomeManager.setBorder(null);
        btnHomeManager.setBorderPainted(false);
        btnHomeManager.setContentAreaFilled(false);
        btnHomeManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeManagerActionPerformed(evt);
            }
        });
        getContentPane().add(btnHomeManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 670, 140, 50));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabelRekapPenjualanManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "No.Outlet", "Nama Kasir", "Total Pembayaran"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelRekapPenjualanManager);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 720, 350));

        Frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/REKAP.png"))); // NOI18N
        getContentPane().add(Frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeManagerActionPerformed
 new HomeManagerView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeManagerActionPerformed

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
            java.util.logging.Logger.getLogger(RekapPenjualanManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RekapPenjualanManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RekapPenjualanManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RekapPenjualanManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RekapPenjualanManagerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Frame;
    private javax.swing.JButton btnHomeManager;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelRekapPenjualanManager;
    // End of variables declaration//GEN-END:variables

}
