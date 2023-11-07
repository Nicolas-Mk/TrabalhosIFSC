/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Busca;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class BuscaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TemplateCadastro
     */
    public BuscaFuncionario() {
        initComponents();
    }

    public JTable getTable() {
        return Table;
    }

    public JComboBox<String> getEscolhaCB() {
        return escolhaCB;
    }

    public void setEscolhaCB(JComboBox<String> escolhaCB) {
        this.escolhaCB = escolhaCB;
    }
    
    


    public JButton getButtonCancel() {
        return buttonCancel;
    }

    public JButton getButtonFilter() {
        return buttonFilter;
    }

    public JButton getButtonLoad() {
        return buttonLoad;
    }

    public JLabel getFindIcon() {
        return findIcon;
    }

    public JPanel getPanelBottom() {
        return panelBottom;
    }

    public JScrollPane getPanelMid() {
        return panelMid;
    }

    public JPanel getPanelSearch() {
        return panelSearch;
    }

    public JPanel getPanelTop() {
        return panelTop;
    }

    public JTextField getSearchTF() {
        return searchTF;
    }

    public void setTable(JTable Table) {
        this.Table = Table;
    }

    public void setTitle(JLabel Title) {
        this.Title = Title;
    }

    public void setButtonCancel(JButton buttonCancel) {
        this.buttonCancel = buttonCancel;
    }

    public void setButtonFilter(JButton buttonFilter) {
        this.buttonFilter = buttonFilter;
    }

    public void setButtonLoad(JButton buttonLoad) {
        this.buttonLoad = buttonLoad;
    }

    public void setFindIcon(JLabel findIcon) {
        this.findIcon = findIcon;
    }

    public void setPanelBottom(JPanel panelBottom) {
        this.panelBottom = panelBottom;
    }

    public void setPanelMid(JScrollPane panelMid) {
        this.panelMid = panelMid;
    }

    public void setPanelSearch(JPanel panelSearch) {
        this.panelSearch = panelSearch;
    }

    public void setPanelTop(JPanel panelTop) {
        this.panelTop = panelTop;
    }

    public void setSearchTF(JTextField searchTF) {
        this.searchTF = searchTF;
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
        Title = new javax.swing.JLabel();
        panelBottom = new javax.swing.JPanel();
        buttonLoad = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        panelSearch = new javax.swing.JPanel();
        buttonFilter = new javax.swing.JButton();
        findIcon = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        escolhaCB = new javax.swing.JComboBox<>();
        panelMid = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelTop.setBackground(new java.awt.Color(221, 221, 221));

        Title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Title.setText("Busca Funcionario");
        panelTop.add(Title);

        panelBottom.setBackground(new java.awt.Color(221, 221, 221));

        buttonLoad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Down.png"))); // NOI18N
        buttonLoad.setText("Carregar");
        buttonLoad.setPreferredSize(new java.awt.Dimension(120, 50));
        buttonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoadActionPerformed(evt);
            }
        });
        panelBottom.add(buttonLoad);

        buttonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Exit.png"))); // NOI18N
        buttonCancel.setText("Sair");
        buttonCancel.setPreferredSize(new java.awt.Dimension(120, 50));
        panelBottom.add(buttonCancel);

        panelSearch.setBackground(new java.awt.Color(221, 221, 221));
        panelSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonFilter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Filter.png"))); // NOI18N
        buttonFilter.setText("Filtrar");
        buttonFilter.setPreferredSize(new java.awt.Dimension(120, 50));
        buttonFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFilterActionPerformed(evt);
            }
        });
        panelSearch.add(buttonFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, -1));

        findIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens_rob/Find.png"))); // NOI18N
        panelSearch.add(findIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 30, 30));
        panelSearch.add(searchTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 880, 30));

        escolhaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "nome", "cpf" }));
        panelSearch.add(escolhaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "fone1", "fone2", "usuario", "cpf", "email", "complemento endereco", "cep", "status"
            }
        ));
        panelMid.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setMinWidth(30);
            Table.getColumnModel().getColumn(0).setMaxWidth(30);
            Table.getColumnModel().getColumn(1).setMinWidth(250);
            Table.getColumnModel().getColumn(1).setMaxWidth(250);
            Table.getColumnModel().getColumn(2).setMinWidth(125);
            Table.getColumnModel().getColumn(2).setMaxWidth(125);
            Table.getColumnModel().getColumn(3).setMinWidth(125);
            Table.getColumnModel().getColumn(3).setMaxWidth(125);
            Table.getColumnModel().getColumn(4).setMinWidth(125);
            Table.getColumnModel().getColumn(4).setMaxWidth(125);
            Table.getColumnModel().getColumn(5).setMinWidth(100);
            Table.getColumnModel().getColumn(5).setMaxWidth(100);
            Table.getColumnModel().getColumn(6).setMinWidth(120);
            Table.getColumnModel().getColumn(6).setMaxWidth(200);
            Table.getColumnModel().getColumn(7).setMinWidth(150);
            Table.getColumnModel().getColumn(7).setMaxWidth(250);
            Table.getColumnModel().getColumn(9).setMinWidth(80);
            Table.getColumnModel().getColumn(9).setMaxWidth(80);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMid)
            .addComponent(panelBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMid, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLoadActionPerformed

    private void buttonFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFilterActionPerformed

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
            java.util.logging.Logger.getLogger(BuscaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JLabel Title;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonFilter;
    private javax.swing.JButton buttonLoad;
    private javax.swing.JComboBox<String> escolhaCB;
    private javax.swing.JLabel findIcon;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JScrollPane panelMid;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JPanel panelTop;
    private javax.swing.JTextField searchTF;
    // End of variables declaration//GEN-END:variables
}
