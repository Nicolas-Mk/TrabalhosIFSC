package Controller.Busca;

import static Controller.Busca.ControllerBuscaBairro.filtroGlobal;
import Controller.Cadastro.ControllerCadastroCarteirinha;
import static Controller.Cadastro.ControllerCadastroCarteirinha.telaResultado;
import Controller.Cadastro.ControllerCadastroCliente;
import static Model.DAO.Persiste.clienteList;
import Model.Cliente;
import Service.ClienteService;
import View.Busca.BuscaCliente;
import View.Cadastro.CadastroCarteirinha;
import View.Cadastro.CadastroCliente;
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
public class ControllerBuscaCliente implements ActionListener {

    // Criando um objeto global do tipo da tela que será controlada. 
    BuscaCliente buscaCliente;
    int contador;

    //Passando a tela que será controlada como parametro de invocação.
    public ControllerBuscaCliente(BuscaCliente buscaCliente) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.buscaCliente = buscaCliente;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.buscaCliente.getButtonCancel().addActionListener(this);
        this.buscaCliente.getButtonLoad().addActionListener(this);
        this.buscaCliente.getButtonFilter().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.buscaCliente.getButtonCancel()) {
            buscaCliente.dispose();
        }
        if (e.getSource() == this.buscaCliente.getButtonFilter()) {
            if (this.buscaCliente.getSearchTF().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atenção!\n Filtro vazio!");
                this.buscaCliente.getSearchTF().requestFocus();
            } else {
                List<Cliente> clienteList = new ArrayList<>();

                if (this.buscaCliente.getEscolhaCB().getSelectedIndex() == 0) {
                    clienteList.add(ClienteService.retrieve(Integer.parseInt(this.buscaCliente.getSearchTF().getText())));
                }else{
                    clienteList = (ClienteService.retrieve(this.buscaCliente.getSearchTF().getText().trim()));
                    filtroGlobal = this.buscaCliente.getEscolhaCB().getSelectedItem().toString().trim();
                    
                }
                
                DefaultTableModel tabela = (DefaultTableModel) this.buscaCliente.getTable().getModel();
                tabela.setRowCount(0);
                for (Cliente clienteAtual : clienteList) {
                    tabela.addRow(new Object[]{clienteAtual.getId(), clienteAtual.getNome(), clienteAtual.getCpf(),
                        clienteAtual.getFone(), clienteAtual.getFone2(), clienteAtual.getMatricula(),
                        clienteAtual.getEmail(), clienteAtual.getComplementoEndereco(),
                        clienteAtual.getDataNascimento(), clienteAtual.getEndereco().getCep(), clienteAtual.getStatus()});
                }
            }
        }
        if (e.getSource() == this.buscaCliente.getButtonLoad()) {

            CadastroCliente cadastroCliente = new CadastroCliente();
            ControllerCadastroCliente controllerCadastroCliente = new ControllerCadastroCliente(cadastroCliente);

            CadastroCarteirinha cadastroCarteirinha = new CadastroCarteirinha();
            ControllerCadastroCarteirinha controllerCadastroCarteirinha = new ControllerCadastroCarteirinha(cadastroCarteirinha);

            if (telaResultado == true) {

                Utilities.Utilities.ativa(false, cadastroCarteirinha.getPanelBottom());
                Utilities.Utilities.limpaComponentes(true, cadastroCarteirinha.getPanelMid());

                cadastroCarteirinha.getIdTF().setEnabled(false);
                cadastroCarteirinha.getNomeTF().setEnabled(false);
                cadastroCarteirinha.getDatadeNascimentoTF().setEnabled(false);
                cadastroCarteirinha.getCpfTF().setEnabled(false);
                cadastroCarteirinha.getMatriculaTF().setEnabled(false);

                cadastroCarteirinha.getNomeTF().setText(this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 1).toString());
                cadastroCarteirinha.getCpfTF().setText(this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 2).toString());
                cadastroCarteirinha.getMatriculaTF().setText(this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 5).toString());
                cadastroCarteirinha.getDatadeNascimentoTF().setText((String) (this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 8)));

                JOptionPane.showMessageDialog(null, this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 8));

                this.buscaCliente.dispose();
                cadastroCarteirinha.setVisible(true);

                telaResultado = false;
            } else {

                Utilities.Utilities.ativa(false, cadastroCliente.getPanelBottom());
                Utilities.Utilities.limpaComponentes(true, cadastroCliente.getPanelMid());
                cadastroCliente.getIdTF().setEnabled(false);
                cadastroCliente.getIdTF().setEnabled(false);
                cadastroCliente.getCepTF().setEnabled(false);
                cadastroCliente.getBairroTF().setEnabled(false);
                cadastroCliente.getCidadeTF().setEnabled(false);

                cadastroCliente.setVisible(true);
                Controller.Cadastro.ControllerCadastroCliente.codigo = (int) this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 0);

                cadastroCliente.getIdTF().setText(this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 0).toString());
                cadastroCliente.getNomeTF().setText(this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 1).toString());
                cadastroCliente.getCpfTF().setText(this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 2).toString());
                cadastroCliente.getFone1TF().setText(this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 3).toString());
                cadastroCliente.getFone2TF().setText(this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 4).toString());
                cadastroCliente.getMatriculaTF().setText(this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 5).toString());
                cadastroCliente.getEmailTF().setText((String) (this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 6)));
                cadastroCliente.getComplementoEnderecoTF().setText((String) (this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 7)));
                cadastroCliente.getDataNascimentoTF().setText(this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 8).toString());
                cadastroCliente.getCepTF().setText((String) this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 9));
                cadastroCliente.getStatusCB().setSelectedItem(this.buscaCliente.getTable().getValueAt(this.buscaCliente.getTable().getSelectedRow(), 10));
                this.buscaCliente.dispose();
            }
        }

    }
}
