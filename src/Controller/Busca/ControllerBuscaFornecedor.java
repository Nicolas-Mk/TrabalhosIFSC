package Controller.Busca;


import Controller.Cadastro.ControllerCadastroFornecedor;
import static Model.DAO.Persiste.fornecedorList;
import Model.Fornecedor;
import View.Busca.BuscaFornecedor;
import View.Cadastro.CadastroFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
            //Criando/Carregando uma instância da classe "singleton" de dados.
            Model.DAO.Persiste.getInstance();
            contador++;
            if(contador == 1){
            //Criando uma objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.buscaFornecedor.getTable().getModel();
            for (Fornecedor fornecedorAtual : fornecedorList) {
                tabela.addRow(new Object[]{fornecedorAtual.getId(), fornecedorAtual.getNome(), fornecedorAtual.getFone(), fornecedorAtual.getFone2(),
                   fornecedorAtual.getCnpj(), fornecedorAtual.getInscricaoEstadual(), fornecedorAtual.getRazaoSocial(),
                   fornecedorAtual.getEmail(), fornecedorAtual.getComplementoEndereco(),
                   fornecedorAtual.getEndereco().getCep(), fornecedorAtual.getStatus()});
                }
            }
        }
        if (e.getSource() == this.buscaFornecedor.getButtonLoad()) {
            
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
            Controller.Cadastro.ControllerCadastroFornecedor.codigo = (int) this.buscaFornecedor.getTable().getValueAt
            (this.buscaFornecedor.getTable().getSelectedRow(), 0);
           
            
            cadastroFornecedor.getIdTF().setText(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 0).toString());
            cadastroFornecedor.getNomeTF().setText(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 1).toString());
            cadastroFornecedor.getFone1TF().setText(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 2).toString());
            cadastroFornecedor.getFone2TF().setText(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 3).toString());
            cadastroFornecedor.getCnpjTF().setText((String)(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 4)));
            cadastroFornecedor.getInscricaoEstadualTF().setText((String)(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 5)));
            cadastroFornecedor.getRazaoSocialTF().setText((String)(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 6)));
            cadastroFornecedor.getEmailTF().setText((String)(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 7)));
            cadastroFornecedor.getComplementoEnderecoTF().setText((String)(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 8)));
            cadastroFornecedor.getCepTF().setText((String)(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 9)));
            cadastroFornecedor.getStatusCB().setSelectedItem(this.buscaFornecedor.getTable().getValueAt(this.buscaFornecedor.getTable().getSelectedRow(), 9));
            
            this.buscaFornecedor.dispose();
            }

    }
    
}
