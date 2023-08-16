/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastro;

import View.Template.TemplateCadastro;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class CadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form TemplateCadastro
     */
    public CadastroProduto() {
        initComponents();
    }

    public JButton getButtonCancel() {
        return buttonCancel;
    }

    public JButton getButtonExit() {
        return buttonExit;
    }

    public JButton getButtonGravar() {
        return buttonGravar;
    }

    public JButton getButtonNew() {
        return buttonNew;
    }

    public JButton getButtonSearch() {
        return buttonSearch;
    }

    public JLabel getCodigodeBarras() {
        return codigodeBarras;
    }

    public JTextField getCodigodeBarrasTF() {
        return codigodeBarrasTF;
    }

    public JLabel getDescricao() {
        return descricao;
    }

    public JTextField getDescricaoTF() {
        return descricaoTF;
    }

    public JLabel getId() {
        return id;
    }

    public JTextField getIdTF() {
        return idTF;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JPanel getPanelBottom() {
        return panelBottom;
    }

    public JPanel getPanelMid() {
        return panelMid;
    }

    public JPanel getPanelTop() {
        return panelTop;
    }

    public JLabel getStatus() {
        return status;
    }

    public JComboBox<String> getStatusCB() {
        return statusCB;
    }

    public void setButtonCancel(JButton buttonCancel) {
        this.buttonCancel = buttonCancel;
    }

    public void setButtonExit(JButton buttonExit) {
        this.buttonExit = buttonExit;
    }

    public void setButtonGravar(JButton buttonGravar) {
        this.buttonGravar = buttonGravar;
    }

    public void setButtonNew(JButton buttonNew) {
        this.buttonNew = buttonNew;
    }

    public void setButtonSearch(JButton buttonSearch) {
        this.buttonSearch = buttonSearch;
    }

    public void setCodigodeBarras(JLabel codigodeBarras) {
        this.codigodeBarras = codigodeBarras;
    }

    public void setCodigodeBarrasTF(JTextField codigodeBarrasTF) {
        this.codigodeBarrasTF = codigodeBarrasTF;
    }

    public void setDescricao(JLabel descricao) {
        this.descricao = descricao;
    }

    public void setDescricaoTF(JTextField descricaoTF) {
        this.descricaoTF = descricaoTF;
    }

    public void setId(JLabel id) {
        this.id = id;
    }

    public void setIdTF(JTextField idTF) {
        this.idTF = idTF;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setPanelBottom(JPanel panelBottom) {
        this.panelBottom = panelBottom;
    }

    public void setPanelMid(JPanel panelMid) {
        this.panelMid = panelMid;
    }

    public void setPanelTop(JPanel panelTop) {
        this.panelTop = panelTop;
    }

    public void setStatus(JLabel status) {
        this.status = status;
    }

    public void setStatusCB(JComboBox<String> statusCB) {
        this.statusCB = statusCB;
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
        id = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        codigodeBarras = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        descricaoTF = new javax.swing.JTextField();
        codigodeBarrasTF = new javax.swing.JTextField();
        statusCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTop.setBackground(new java.awt.Color(221, 221, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro Produto");
        panelTop.add(jLabel1);

        getContentPane().add(panelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

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
        buttonCancel.setEnabled(false);
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
        buttonGravar.setEnabled(false);
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
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        panelBottom.add(buttonSearch);

        buttonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Exit.png"))); // NOI18N
        buttonExit.setText(" Sair");
        buttonExit.setActionCommand("0");
        buttonExit.setPreferredSize(new java.awt.Dimension(120, 50));
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        panelBottom.add(buttonExit);

        getContentPane().add(panelBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 800, 60));

        id.setText("ID");

        descricao.setText("Descrição");

        codigodeBarras.setText("Código de barras");

        status.setText("Status");

        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });

        descricaoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoTFActionPerformed(evt);
            }
        });

        codigodeBarrasTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigodeBarrasTFActionPerformed(evt);
            }
        });

        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        javax.swing.GroupLayout panelMidLayout = new javax.swing.GroupLayout(panelMid);
        panelMid.setLayout(panelMidLayout);
        panelMidLayout.setHorizontalGroup(
            panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMidLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descricao)
                    .addComponent(id)
                    .addComponent(idTF)
                    .addComponent(descricaoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigodeBarras)
                    .addComponent(status)
                    .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigodeBarrasTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        panelMidLayout.setVerticalGroup(
            panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMidLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(codigodeBarras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigodeBarrasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricao)
                    .addComponent(status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(panelMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed
       
    }//GEN-LAST:event_buttonNewActionPerformed

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void descricaoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoTFActionPerformed

    private void codigodeBarrasTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigodeBarrasTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigodeBarrasTFActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
      
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGravarActionPerformed
     
    }//GEN-LAST:event_buttonGravarActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
       
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
      
    }//GEN-LAST:event_buttonSearchActionPerformed

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
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonGravar;
    private javax.swing.JButton buttonNew;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel codigodeBarras;
    private javax.swing.JTextField codigodeBarrasTF;
    private javax.swing.JLabel descricao;
    private javax.swing.JTextField descricaoTF;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JPanel panelMid;
    private javax.swing.JPanel panelTop;
    private javax.swing.JLabel status;
    private javax.swing.JComboBox<String> statusCB;
    // End of variables declaration//GEN-END:variables
}
