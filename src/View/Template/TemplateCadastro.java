/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Template;

/**
 *
 * @author aluno
 */
public class TemplateCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TemplateCadastro
     */
    public TemplateCadastro() {
        initComponents();
        Utilities.Utilities.ativa(true, panelBottom);
        Utilities.Utilities.limpaComponentes(false, panelMid);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelBottom = new javax.swing.JPanel();
        buttonNew = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        buttonGravar = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        panelMid = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTop.setBackground(new java.awt.Color(221, 221, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Título");
        panelTop.add(jLabel1);

        getContentPane().add(panelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        panelBottom.setBackground(new java.awt.Color(221, 221, 221));

        buttonNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Create.png"))); // NOI18N
        buttonNew.setText(" Novo");
        buttonNew.setActionCommand("0");
        buttonNew.setPreferredSize(new java.awt.Dimension(120, 50));
        buttonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewActionPerformed(evt);
            }
        });
        panelBottom.add(buttonNew);

        buttonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Cancel.png"))); // NOI18N
        buttonCancel.setText(" Cancelar");
        buttonCancel.setActionCommand("1");
        buttonCancel.setPreferredSize(new java.awt.Dimension(120, 50));
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        panelBottom.add(buttonCancel);

        buttonGravar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Next track.png"))); // NOI18N
        buttonGravar.setText(" Gravar");
        buttonGravar.setActionCommand("1");
        buttonGravar.setPreferredSize(new java.awt.Dimension(120, 50));
        buttonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGravarActionPerformed(evt);
            }
        });
        panelBottom.add(buttonGravar);

        buttonSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Find.png"))); // NOI18N
        buttonSearch.setText(" Buscar");
        buttonSearch.setActionCommand("0");
        buttonSearch.setPreferredSize(new java.awt.Dimension(120, 50));
        panelBottom.add(buttonSearch);

        buttonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Exit.png"))); // NOI18N
        buttonExit.setText(" Sair");
        buttonExit.setActionCommand("0");
        buttonExit.setPreferredSize(new java.awt.Dimension(120, 50));
        panelBottom.add(buttonExit);

        getContentPane().add(panelBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 60));

        javax.swing.GroupLayout panelMidLayout = new javax.swing.GroupLayout(panelMid);
        panelMid.setLayout(panelMidLayout);
        panelMidLayout.setHorizontalGroup(
            panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panelMidLayout.setVerticalGroup(
            panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(panelMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
        Utilities.Utilities.ativa(false, panelBottom);
        Utilities.Utilities.limpaComponentes(true, panelMid);
    }//GEN-LAST:event_buttonNewActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        Utilities.Utilities.ativa(true, panelBottom);
        Utilities.Utilities.limpaComponentes(false, panelMid);
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGravarActionPerformed
        Utilities.Utilities.ativa(true, panelBottom);
        Utilities.Utilities.limpaComponentes(false, panelMid);
    }//GEN-LAST:event_buttonGravarActionPerformed

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
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemplateCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonGravar;
    private javax.swing.JButton buttonNew;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JPanel panelMid;
    private javax.swing.JPanel panelTop;
    // End of variables declaration//GEN-END:variables
}
