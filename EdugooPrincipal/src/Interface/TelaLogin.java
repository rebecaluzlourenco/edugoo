package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;
import Conexoes.MySQL;
import java.sql.Connection;

public class TelaLogin extends javax.swing.JFrame {
    MySQL conectar = new MySQL();

    private Connection conn;
        public TelaLogin() {
        initComponents(); 
        jPanel1.setFocusable(true);
    }            
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campousuario = new javax.swing.JTextField();
        camposenha = new javax.swing.JPasswordField();
        bntLogin = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1260, 794));
        setSize(new java.awt.Dimension(1260, 794));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(380, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(237, 237, 237));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuario1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadeado1.png"))); // NOI18N

        campousuario.setBackground(new java.awt.Color(237, 237, 237));
        campousuario.setFont(new java.awt.Font("Gadugi", 2, 24)); // NOI18N
        campousuario.setForeground(new java.awt.Color(204, 204, 204));
        campousuario.setText("Usuário");
        campousuario.setToolTipText("");
        campousuario.setBorder(null);
        campousuario.setCaretColor(new java.awt.Color(102, 153, 255));
        campousuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        campousuario.setName(""); // NOI18N
        campousuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campousuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campousuarioFocusLost(evt);
            }
        });
        campousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campousuarioActionPerformed(evt);
            }
        });

        camposenha.setBackground(new java.awt.Color(237, 237, 237));
        camposenha.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        camposenha.setForeground(new java.awt.Color(204, 204, 204));
        camposenha.setText("**********");
        camposenha.setBorder(null);
        camposenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                camposenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                camposenhaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(camposenha, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(camposenha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 640, -1));

        bntLogin.setBackground(new java.awt.Color(255, 153, 0));
        bntLogin.setFont(new java.awt.Font("Fredoka One", 0, 20)); // NOI18N
        bntLogin.setForeground(new java.awt.Color(255, 255, 255));
        bntLogin.setText("ENTRAR");
        bntLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bntLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLoginActionPerformed(evt);
            }
        });
        jPanel1.add(bntLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, 220, 52));

        btnNovo.setBackground(new java.awt.Color(0, 0, 102));
        btnNovo.setFont(new java.awt.Font("Fredoka One", 0, 20)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO");
        jPanel1.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 220, 50));

        jPanel2.setBackground(new java.awt.Color(121, 38, 180));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ICONE1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 790));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EDUGOO.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 340, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BORDA1.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, -20, 430, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLoginActionPerformed
        this.conectar.conectaBanco();
        
        
    }//GEN-LAST:event_bntLoginActionPerformed

    private void campousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campousuarioActionPerformed

    }//GEN-LAST:event_campousuarioActionPerformed

    private void campousuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campousuarioFocusLost
        if (campousuario.getText().equals("")){
            campousuario.setText("Usuário");
            campousuario.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_campousuarioFocusLost

    private void campousuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campousuarioFocusGained
        if (campousuario.getText().equals("Usuário")){
            campousuario.setText("");
            campousuario.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_campousuarioFocusGained

    private void camposenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_camposenhaFocusLost
        if (camposenha.getText().equals("")){
            camposenha.setText("**********");
            camposenha.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_camposenhaFocusLost

    private void camposenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_camposenhaFocusGained
        if (camposenha.getText().equals("**********")){
            camposenha.setText("");
            camposenha.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_camposenhaFocusGained

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntLogin;
    private javax.swing.JButton btnNovo;
    private javax.swing.JPasswordField camposenha;
    private javax.swing.JTextField campousuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
