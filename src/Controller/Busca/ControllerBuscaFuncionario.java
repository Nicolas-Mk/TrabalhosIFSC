package Controller.Busca;


import Controller.Cadastro.ControllerCadastroFuncionario;
import static Model.DAO.Persiste.funcionarioList;
import Model.Funcionario;
import View.Busca.BuscaFuncionario;
import View.Cadastro.CadastroFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicolas Kuffner
 */
public class ControllerBuscaFuncionario implements ActionListener {

    // Criando um objeto global do tipo da tela que será controlada. 
    BuscaFuncionario buscaFuncionario;
    int contador;

    //Passando a tela que será controlada como parametro de invocação.
    public ControllerBuscaFuncionario(BuscaFuncionario buscaFuncionario) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.buscaFuncionario = buscaFuncionario;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.buscaFuncionario.getButtonCancel().addActionListener(this);
        this.buscaFuncionario.getButtonLoad().addActionListener(this);
        this.buscaFuncionario.getButtonFilter().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.buscaFuncionario.getButtonCancel()) {
            buscaFuncionario.dispose();
        }
        
        if (e.getSource() == this.buscaFuncionario.getButtonFilter()) {
            //Criando/Carregando uma instância da classe "singleton" de dados.
            Model.DAO.Persiste.getInstance();
            contador++;
            if(contador == 1){
            //Criando uma objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.buscaFuncionario.getTable().getModel();
            for (Funcionario funcionarioAtual : funcionarioList) {
                tabela.addRow(new Object[]{funcionarioAtual.getId(), funcionarioAtual.getNome(), funcionarioAtual.getFone(), funcionarioAtual.getFone2(),
                   funcionarioAtual.getUsuario(), funcionarioAtual.getCpf(), funcionarioAtual.getEmail(), funcionarioAtual.getComplementoEndereco(), funcionarioAtual.getEndereco().getCep()
                });
                }
            }
        }
        if (e.getSource() == this.buscaFuncionario.getButtonLoad()) {
            
            CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
            ControllerCadastroFuncionario controllerCadastroFuncionario = new ControllerCadastroFuncionario(cadastroFuncionario);
            
            Utilities.Utilities.ativa(false, cadastroFuncionario.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, cadastroFuncionario.getPanelMid());
            cadastroFuncionario.getIdTF().setEnabled(false);
            
            cadastroFuncionario.setVisible(true);
            Controller.Cadastro.ControllerCadastroFuncionario.codigo = (int) this.buscaFuncionario.getTable().getValueAt
            (this.buscaFuncionario.getTable().getSelectedRow(), 0);
           
            
            cadastroFuncionario.getIdTF().setText(this.buscaFuncionario.getTable().getValueAt(this.buscaFuncionario.getTable().getSelectedRow(), 0).toString());
            cadastroFuncionario.getNomeTF().setText(this.buscaFuncionario.getTable().getValueAt(this.buscaFuncionario.getTable().getSelectedRow(), 1).toString());
            cadastroFuncionario.getFone1TF().setText(this.buscaFuncionario.getTable().getValueAt(this.buscaFuncionario.getTable().getSelectedRow(), 2).toString());
            cadastroFuncionario.getFone2TF().setText(this.buscaFuncionario.getTable().getValueAt(this.buscaFuncionario.getTable().getSelectedRow(), 3).toString());
            cadastroFuncionario.getUsuarioTF().setText((String)(this.buscaFuncionario.getTable().getValueAt(this.buscaFuncionario.getTable().getSelectedRow(), 4)));
            cadastroFuncionario.getCpfTF().setText((String)(this.buscaFuncionario.getTable().getValueAt(this.buscaFuncionario.getTable().getSelectedRow(), 5)));
            cadastroFuncionario.getEmailTF().setText((String)(this.buscaFuncionario.getTable().getValueAt(this.buscaFuncionario.getTable().getSelectedRow(), 6)));
            cadastroFuncionario.getComplementoEnderecoTF().setText((String)(this.buscaFuncionario.getTable().getValueAt(this.buscaFuncionario.getTable().getSelectedRow(), 7)));
            cadastroFuncionario.getCepTF().setText((String)(this.buscaFuncionario.getTable().getValueAt(this.buscaFuncionario.getTable().getSelectedRow(), 8)));
            
            
            this.buscaFuncionario.dispose();
            }
        
    }

}
