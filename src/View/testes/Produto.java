/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.testes;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Produto extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Produto() {
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
        jPanel3 = new javax.swing.JPanel();
        iconAdd = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        iconDelete = new javax.swing.JLabel();
        buttonDelete = new javax.swing.JButton();
        iconEdit = new javax.swing.JLabel();
        buttonEdit = new javax.swing.JButton();
        iconRefresh = new javax.swing.JLabel();
        buttonRefresh = new javax.swing.JButton();
        iconSearch = new javax.swing.JLabel();
        serchTF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(224, 224, 224));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Tabela de Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(235, 235, 235))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Create.png"))); // NOI18N
        iconAdd.setText("jLabel2");
        iconAdd.setPreferredSize(new java.awt.Dimension(40, 16));
        jPanel3.add(iconAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 20, 30));

        buttonAdd.setText("Adicionar");
        buttonAdd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAddMouseClicked(evt);
            }
        });
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        jPanel3.add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        iconDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Cancel.png"))); // NOI18N
        iconDelete.setText("jLabel2");
        iconDelete.setPreferredSize(new java.awt.Dimension(40, 16));
        jPanel3.add(iconDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 20, 30));

        buttonDelete.setText("Deletar");
        buttonDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 90, 30));

        iconEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Modify.png"))); // NOI18N
        iconEdit.setText("jLabel2");
        iconEdit.setPreferredSize(new java.awt.Dimension(40, 16));
        jPanel3.add(iconEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 20, 30));

        buttonEdit.setText("Editar");
        buttonEdit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        jPanel3.add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 90, 30));

        iconRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Diagram.png"))); // NOI18N
        iconRefresh.setText("jLabel2");
        iconRefresh.setPreferredSize(new java.awt.Dimension(40, 16));
        jPanel3.add(iconRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 20, 30));

        buttonRefresh.setText("Atualizar");
        buttonRefresh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(buttonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 90, 30));

        iconSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Find.png"))); // NOI18N
        jPanel3.add(iconSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 30, 20));
        jPanel3.add(serchTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 290, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "nome", "descrição", "status"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(1).setMinWidth(250);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(250);
            jTable1.getColumnModel().getColumn(2).setMinWidth(300);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(3).setMinWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddMouseClicked

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
       ProdutoAdicionar produtoAdicionar = new ProdutoAdicionar();
       produtoAdicionar.setVisible(true);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        JOptionPane.showConfirmDialog(rootPane, "Você deseja mesmo realizar essa ação?", "Confirmação", 1);
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        ProdutoEditar produtoEditar = new ProdutoEditar();
        produtoEditar.setVisible(true);
    }//GEN-LAST:event_buttonEditActionPerformed

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
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JLabel iconAdd;
    private javax.swing.JLabel iconDelete;
    private javax.swing.JLabel iconEdit;
    private javax.swing.JLabel iconRefresh;
    private javax.swing.JLabel iconSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField serchTF;
    // End of variables declaration//GEN-END:variables
}
