/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastro;

import View.Template.TemplateCadastro;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class CadastroCarteirinha extends javax.swing.JFrame {

    /**
     * Creates new form TemplateCadastro
     */
    public CadastroCarteirinha() {
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

    public JLabel getCodigoBarras() {
        return codigoBarras;
    }

    public JTextField getCodigoBarrasTF() {
        return codigoBarrasTF;
    }

    public JLabel getDataCancelamento() {
        return dataCancelamento;
    }

    public JFormattedTextField getDataCancelamentoTF() {
        return dataCancelamentoTF;
    }

    public JLabel getDataGeracao() {
        return dataGeracao;
    }

    public JFormattedTextField getDataGeracaoTF() {
        return dataGeracaoTF;
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

    public void setCodigoBarras(JLabel codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setCodigoBarrasTF(JTextField codigoBarrasTF) {
        this.codigoBarrasTF = codigoBarrasTF;
    }

    public void setDataCancelamento(JLabel dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public void setDataCancelamentoTF(JFormattedTextField dataCancelamentoTF) {
        this.dataCancelamentoTF = dataCancelamentoTF;
    }

    public void setDataGeracao(JLabel dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public void setDataGeracaoTF(JFormattedTextField dataGeracaoTF) {
        this.dataGeracaoTF = dataGeracaoTF;
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

    public JLabel getCpf() {
        return cpf;
    }

    public JFormattedTextField getCpfTF() {
        return cpfTF;
    }

    public JLabel getDataDeNascimento() {
        return dataDeNascimento;
    }

    public JFormattedTextField getDatadeNascimentoTF() {
        return datadeNascimentoTF;
    }

    public JLabel getMatricula() {
        return matricula;
    }

    public JTextField getMatriculaTF() {
        return matriculaTF;
    }

    public JLabel getNome() {
        return nome;
    }

    public JTextField getNomeTF() {
        return nomeTF;
    }

    public void setCpf(JLabel cpf) {
        this.cpf = cpf;
    }

    public void setCpfTF(JFormattedTextField cpfTF) {
        this.cpfTF = cpfTF;
    }

    public void setDataDeNascimento(JLabel dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setDatadeNascimentoTF(JFormattedTextField datadeNascimentoTF) {
        this.datadeNascimentoTF = datadeNascimentoTF;
    }

    public void setMatricula(JLabel matricula) {
        this.matricula = matricula;
    }

    public void setMatriculaTF(JTextField matriculaTF) {
        this.matriculaTF = matriculaTF;
    }

    public void setNome(JLabel nome) {
        this.nome = nome;
    }

    public void setNomeTF(JTextField nomeTF) {
        this.nomeTF = nomeTF;
    }

    public JButton getButtonCliente() {
        return buttonCliente;
    }

    public void setButtonCliente(JButton buttonCliente) {
        this.buttonCliente = buttonCliente;
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelMid = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        codigoBarras = new javax.swing.JLabel();
        dataGeracao = new javax.swing.JLabel();
        dataCancelamento = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        matricula = new javax.swing.JLabel();
        dataDeNascimento = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        codigoBarrasTF = new javax.swing.JTextField();
        dataCancelamentoTF = new javax.swing.JFormattedTextField();
        dataGeracaoTF = new javax.swing.JFormattedTextField();
        nomeTF = new javax.swing.JTextField();
        matriculaTF = new javax.swing.JTextField();
        datadeNascimentoTF = new javax.swing.JFormattedTextField();
        cpfTF = new javax.swing.JFormattedTextField();
        buttonCliente = new javax.swing.JButton();
        panelBottom = new javax.swing.JPanel();
        buttonNew = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        buttonGravar = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTop.setBackground(new java.awt.Color(221, 221, 221));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro Carteirinha");
        panelTop.add(jLabel1);

        getContentPane().add(panelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        panelMid.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setText("ID");
        panelMid.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 56, -1, -1));

        codigoBarras.setText("Codigo de Barras");
        panelMid.add(codigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 104, -1, -1));

        dataGeracao.setText("Data de geração");
        panelMid.add(dataGeracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 150, -1, -1));

        dataCancelamento.setText("Data de cancelamento");
        panelMid.add(dataCancelamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 150, -1, -1));

        nome.setText("Cliente");
        panelMid.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 56, -1, -1));

        matricula.setText("Matricula");
        panelMid.add(matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 104, -1, -1));

        dataDeNascimento.setText("Data de Nascimento");
        panelMid.add(dataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        cpf.setText("CPF");
        panelMid.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 104, -1, -1));

        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });
        panelMid.add(idTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 76, 100, -1));

        codigoBarrasTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoBarrasTFActionPerformed(evt);
            }
        });
        panelMid.add(codigoBarrasTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 124, 150, -1));

        try {
            dataCancelamentoTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelMid.add(dataCancelamentoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 170, 149, -1));

        try {
            dataGeracaoTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataGeracaoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataGeracaoTFActionPerformed(evt);
            }
        });
        panelMid.add(dataGeracaoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 170, 150, -1));

        nomeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTFActionPerformed(evt);
            }
        });
        panelMid.add(nomeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 76, 310, -1));

        matriculaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaTFActionPerformed(evt);
            }
        });
        panelMid.add(matriculaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 124, 149, -1));

        try {
            datadeNascimentoTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        datadeNascimentoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datadeNascimentoTFActionPerformed(evt);
            }
        });
        panelMid.add(datadeNascimentoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 150, -1));

        try {
            cpfTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelMid.add(cpfTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 124, 150, -1));

        buttonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Down.png"))); // NOI18N
        buttonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClienteActionPerformed(evt);
            }
        });
        panelMid.add(buttonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 74, 40, 22));

        getContentPane().add(panelMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 230));

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewActionPerformed

    }//GEN-LAST:event_buttonNewActionPerformed

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void codigoBarrasTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBarrasTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoBarrasTFActionPerformed

    private void dataGeracaoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataGeracaoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataGeracaoTFActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed

    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGravarActionPerformed

    }//GEN-LAST:event_buttonGravarActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
  
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void nomeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTFActionPerformed

    private void matriculaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaTFActionPerformed

    private void datadeNascimentoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datadeNascimentoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datadeNascimentoTFActionPerformed

    private void buttonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClienteActionPerformed

    
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
                new CadastroCarteirinha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonCliente;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonGravar;
    private javax.swing.JButton buttonNew;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel codigoBarras;
    private javax.swing.JTextField codigoBarrasTF;
    private javax.swing.JLabel cpf;
    private javax.swing.JFormattedTextField cpfTF;
    private javax.swing.JLabel dataCancelamento;
    private javax.swing.JFormattedTextField dataCancelamentoTF;
    private javax.swing.JLabel dataDeNascimento;
    private javax.swing.JLabel dataGeracao;
    private javax.swing.JFormattedTextField dataGeracaoTF;
    private javax.swing.JFormattedTextField datadeNascimentoTF;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel matricula;
    private javax.swing.JTextField matriculaTF;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JPanel panelMid;
    private javax.swing.JPanel panelTop;
    // End of variables declaration//GEN-END:variables
}
