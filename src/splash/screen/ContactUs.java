/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splash.screen;

import java.awt.Color;

/**
 *
 * @author SSJ Shreyas
 */
public class ContactUs extends javax.swing.JFrame {

    /**
     * Creates new form ContactUs
     */
    public ContactUs() {
        initComponents();
        field.setBackground(new Color(0,0,0,64));
        
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);
        scroll.setViewportBorder(null);
        
        area.setBorder(null);
        area.setBackground(new Color(0,0,0,64));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        field = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        field.setEditable(false);
        field.setBackground(new java.awt.Color(0, 0, 0));
        field.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        field.setForeground(new java.awt.Color(255, 255, 255));
        field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field.setText("CONTACT US");
        getContentPane().add(field, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 30));

        area.setBackground(new java.awt.Color(0, 0, 0));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        area.setForeground(new java.awt.Color(255, 255, 255));
        area.setRows(5);
        area.setText("Technical Support\n\nBETHESDA SOFTWORKS GAMES\n  help.bethesda.net \n\nFOR QUESTIONS SPECIFIC TO THE ELDER SCROLLS ONLINE\nhelp.elderscrollsonline.com Additional Questions\n\nPRESS INQUIRIES\n  press@bethsoft.com\n\nGENERAL INFO\n  BETHESDA SOFTWORKS LLC\n  1370 Piccard Drive\n  Rockville, MD 20850\n  info@bethsoft.com");
        scroll.setViewportView(area);

        getContentPane().add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 420, 320));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splash/screen/map-bg3.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JTextField field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
