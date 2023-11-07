package Controller.Busca;

import static Controller.Busca.ControllerBuscaBairro.filtroGlobal;
import Controller.Cadastro.ControllerCadastroFornecedor;
import static Model.DAO.Persiste.fornecedorList;
import Model.Fornecedor;
import Service.FornecedorService;
import View.Busca.BuscaFornecedor;
import View.Cadastro.CadastroFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicolas Kuffner
 */
public class ControllerBuscaFornecedor implements ActionListener {

    // Criando um objeto global do tipo da tela que será controlada. 
    BuscaFornecedor buscaFornecedor;
    int contador;

    //Passando a tela que será controlada como parametro de invocação.
    public ControllerBuscaFornecedor(BuscaFornecedor buscaFornecedor) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.buscaFornecedor = buscaFornecedor;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.buscaFornecedor.getButtonCancel().addActionListener(this);
        this.buscaFornecedor.getButtonLoad().addActionListener(this);
        this.buscaFornecedor.getButtonFilter().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.buscaFornecedor.getButtonCancel()) {
            buscaFornecedor.dispose();
        }
        if (e.getSource() == this.buscaFornecedor.getButtonFilter()) {
            if (this.buscaFornecedor.getSearchTF().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atenção!\n Filtro vazio!");
                this.buscaFornecedor.getSearchTF().requestFocus();
            } else {
                List<Fornecedor> fornecedorList = new ArrayList<>();

                if (this.buscaFornecedor.getEscolhaCB().getSelectedIndex() == 0) {
                    fornecedorList.add(FornecedorService.retrieve(Integer.parseInt(this.buscaFornecedor.getSearchTF().getText())));
                } else{
                    fornecedorList = (FornecedorService.retrieve(this.buscaFornecedor.getSearchTF().getText().trim()));
                                        filtroGlobal = (this.buscaFornecedor.getEscolhaCB().getSelectedItem().toString());

                }
                DefaultTableModel tabela = (DefaultTableModel) this.buscaFornecedor.getTable().getModel();
                tabela.setRowCount(0);
                for (Fornecedor fornecedorAtual : fornecedorList) {
                    tabela.addRow(new Object[]{fornecedorAtual.getId(), fornecedorAtual.getNome(), fornecedorAtual.getFone(), fornecedorAtual.getFone2(),
                        fornecedorAtual.getCnpj(), fornecedorAtual.getInscricaoEstadual(), fornecedorAtual.getRazaoSocial(),
                        fornecedorAtual.getEmail(), fornecedorAtual.getComplementoEndereco(),
                        fornecedorAtual.getEndereco().getCep(), fornecedorAtual.getStatus()});
                }
            }

        }if (e.getSource() == this.buscaFornecedor.getButtonLoad()) {

            CadastroFornecedor cadastroFornecedor = new CadastroFornecedor();
            ControllerCadastroFornecedor controllerCadastroFornecedor = new ControllerCadastroFornecedor(cadastroFornecedor);

            Utilities.Utilities.ativa(false, cadastroFornecedor.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, cadastroFornecedor.getPanelMid());
            cadastroFornecedor.getIdTF().setEnabled(false);
            cadastroFornecedor.getIdTF().setEnabled(false);
            cadastroFornecedor.getCepTF().setEnabled(false);
            cadastroFornecedor.getBairroTF().setEnabled(false);
            cadastroFornecedor.getCidadeTF().setEnabled(false);

            cadastroFornecedor.setVisible(true);
            Controller.Cadastro.ControllerCadastroFornecedor.codigo = (int) this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 0);

            cadastroFornecedor.getIdTF().setText(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 0).toString());
            cadastroFornecedor.getNomeTF().setText(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 1).toString());
            cadastroFornecedor.getFone1TF().setText(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 2).toString());
            cadastroFornecedor.getFone2TF().setText(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 3).toString());
            cadastroFornecedor.getCnpjTF().setText((String) (this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 4)));
            cadastroFornecedor.getInscricaoEstadualTF().setText((String) (this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 5)));
            cadastroFornecedor.getRazaoSocialTF().setText((String) (this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 6)));
            cadastroFornecedor.getEmailTF().setText((String) (this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 7)));
            cadastroFornecedor.getComplementoEnderecoTF().setText((String) (this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 8)));
            cadastroFornecedor.getCepTF().setText((String) (this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 9)));
            cadastroFornecedor.getStatusCB().setSelectedItem(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 10));

            this.buscaFornecedor.dispose();
        }

    }

}
