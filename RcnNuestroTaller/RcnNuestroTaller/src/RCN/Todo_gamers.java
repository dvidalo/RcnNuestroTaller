/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RCN;

import javax.swing.JButton;

/**
 *
 * @author diego vidal
 */
public class Todo_gamers extends javax.swing.JFrame {

    /**
     * Creates new form TodoGamer2
     */
    public Todo_gamers() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Boton_Superlike = new javax.swing.JButton();
        Boton_Programas1 = new javax.swing.JButton();
        Boton_Deportes = new javax.swing.JButton();
        Boton_Noticias = new javax.swing.JButton();
        Boton_TodoGamer = new javax.swing.JButton();
        Envivo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1028, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1028, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1028, 768));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRESENTACION PARA VIDEO (1).gif"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo verde.jpg"))); // NOI18N

        Boton_Superlike.setBackground(new java.awt.Color(0, 0, 0));
        Boton_Superlike.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Boton_Superlike.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Superlike.setText("SuperLike");
        Boton_Superlike.setBorder(null);
        Boton_Superlike.setBorderPainted(false);
        Boton_Superlike.setOpaque(false);
        Boton_Superlike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SuperlikeActionPerformed(evt);
            }
        });

        Boton_Programas1.setBackground(new java.awt.Color(0, 0, 0));
        Boton_Programas1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Boton_Programas1.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Programas1.setText("Programas");
        Boton_Programas1.setBorder(null);
        Boton_Programas1.setBorderPainted(false);
        Boton_Programas1.setOpaque(false);
        Boton_Programas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Programas1ActionPerformed(evt);
            }
        });

        Boton_Deportes.setBackground(new java.awt.Color(0, 0, 0));
        Boton_Deportes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Boton_Deportes.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Deportes.setText("Deportes");
        Boton_Deportes.setBorder(null);
        Boton_Deportes.setBorderPainted(false);
        Boton_Deportes.setOpaque(false);
        Boton_Deportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_DeportesActionPerformed(evt);
            }
        });

        Boton_Noticias.setBackground(new java.awt.Color(0, 0, 0));
        Boton_Noticias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Boton_Noticias.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Noticias.setText("Noticias");
        Boton_Noticias.setBorder(null);
        Boton_Noticias.setBorderPainted(false);
        Boton_Noticias.setOpaque(false);
        Boton_Noticias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_NoticiasActionPerformed(evt);
            }
        });

        Boton_TodoGamer.setBackground(new java.awt.Color(0, 0, 0));
        Boton_TodoGamer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Boton_TodoGamer.setForeground(new java.awt.Color(255, 255, 255));
        Boton_TodoGamer.setText("TodoGamers");
        Boton_TodoGamer.setBorder(null);
        Boton_TodoGamer.setBorderPainted(false);
        Boton_TodoGamer.setOpaque(false);
        Boton_TodoGamer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_TodoGamerActionPerformed(evt);
            }
        });

        Envivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/envivo.png"))); // NOI18N
        Envivo.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addComponent(Boton_Programas1)
                .addGap(18, 18, 18)
                .addComponent(Boton_Superlike)
                .addGap(18, 18, 18)
                .addComponent(Boton_Deportes)
                .addGap(18, 18, 18)
                .addComponent(Boton_Noticias)
                .addGap(18, 18, 18)
                .addComponent(Boton_TodoGamer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Envivo)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton_Programas1)
                            .addComponent(Boton_Superlike)
                            .addComponent(Boton_Deportes)
                            .addComponent(Boton_Noticias)
                            .addComponent(Boton_TodoGamer)
                            .addComponent(Envivo))))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_SuperlikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SuperlikeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_SuperlikeActionPerformed

    private void Boton_Programas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Programas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_Programas1ActionPerformed

    private void Boton_DeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_DeportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_DeportesActionPerformed

    private void Boton_NoticiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_NoticiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_NoticiasActionPerformed

    private void Boton_TodoGamerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_TodoGamerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_TodoGamerActionPerformed

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
            java.util.logging.Logger.getLogger(Todo_gamers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Todo_gamers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Todo_gamers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Todo_gamers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JButton miBoton = new JButton();

            miBoton.setBackground(java.awt.Color.BLACK);
                new Todo_gamers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Deportes;
    private javax.swing.JButton Boton_Noticias;
    private javax.swing.JButton Boton_Programas1;
    private javax.swing.JButton Boton_Superlike;
    private javax.swing.JButton Boton_TodoGamer;
    private javax.swing.JLabel Envivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
