/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Mahesh
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuForm4 = new javax.swing.JMenu();
        mnuFrom1 = new javax.swing.JMenuItem();
        mnuForm2 = new javax.swing.JMenuItem();
        mnuForm3 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuFrom11 = new javax.swing.JMenuItem();
        mnuFrom12 = new javax.swing.JMenuItem();
        mnuFrom13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1079, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );

        jMenuBar1.setToolTipText("Hostel Management System");

        mnuForm4.setText("Master");

        mnuFrom1.setText("Addmission");
        mnuFrom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrom1ActionPerformed(evt);
            }
        });
        mnuForm4.add(mnuFrom1);

        mnuForm2.setText("Supplier");
        mnuForm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuForm2ActionPerformed(evt);
            }
        });
        mnuForm4.add(mnuForm2);

        mnuForm3.setText("Material");
        mnuForm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuForm3ActionPerformed(evt);
            }
        });
        mnuForm4.add(mnuForm3);

        jMenuItem3.setText("Rector");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuForm4.add(jMenuItem3);

        jMenuBar1.add(mnuForm4);

        jMenu1.setText("Trasaction");

        mnuFrom11.setText("All Student Record");
        mnuFrom11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrom11ActionPerformed(evt);
            }
        });
        jMenu1.add(mnuFrom11);

        mnuFrom12.setText("Deposit Fee Student");
        mnuFrom12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrom12ActionPerformed(evt);
            }
        });
        jMenu1.add(mnuFrom12);

        mnuFrom13.setText("Pending Fee Student ");
        mnuFrom13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFrom13ActionPerformed(evt);
            }
        });
        jMenu1.add(mnuFrom13);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Reports");
        jMenuBar1.add(jMenu4);

        jMenu2.setText("Tools");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Utility");
        jMenuBar1.add(jMenu3);

        mnuMenu.setText("Exit");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuMenu.add(jMenuItem1);

        jMenuBar1.add(mnuMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuForm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuForm2ActionPerformed
        // TODO add your handling code here:
        Frame2 f2 = new Frame2();
        desktop.add(f2);
        f2.setVisible(true);
    }//GEN-LAST:event_mnuForm2ActionPerformed

    private void mnuFrom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrom1ActionPerformed
        // TODO add your handling code here:
        Frame1 f1 = new Frame1();
        desktop.add(f1);
        f1.setVisible(true);
    }//GEN-LAST:event_mnuFrom1ActionPerformed

    private void mnuForm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuForm3ActionPerformed
        // TODO add your handling code here:
        Frame3 f3 = new Frame3();
        desktop.add(f3);
        f3.setVisible(true);
    }//GEN-LAST:event_mnuForm3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Frame4 f4 = new Frame4();
        desktop.add(f4);
        f4.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuFrom11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrom11ActionPerformed
        // TODO add your handling code here:
        Frame11 f11 = new Frame11();
        desktop.add(f11);
        f11.setVisible(true);
    }//GEN-LAST:event_mnuFrom11ActionPerformed

    private void mnuFrom12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrom12ActionPerformed
        // TODO add your handling code here:
        Frame12 f12 = new Frame12();
        desktop.add(f12);
        f12.setVisible(true);
    }//GEN-LAST:event_mnuFrom12ActionPerformed

    private void mnuFrom13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFrom13ActionPerformed
        // TODO add your handling code here:
        Frame13 f13 = new Frame13();
        desktop.add(f13);
        f13.setVisible(true);
    }//GEN-LAST:event_mnuFrom13ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mnuForm2;
    private javax.swing.JMenuItem mnuForm3;
    private javax.swing.JMenu mnuForm4;
    private javax.swing.JMenuItem mnuFrom1;
    private javax.swing.JMenuItem mnuFrom11;
    private javax.swing.JMenuItem mnuFrom12;
    private javax.swing.JMenuItem mnuFrom13;
    private javax.swing.JMenu mnuMenu;
    // End of variables declaration//GEN-END:variables
}
