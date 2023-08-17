/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Busca;


import Controller.Cadastro.ControllerCadastroCliente;
import static Controller.Cadastro.ControllerCadastroCliente.puxaEnderecoCliente;
import static Controller.Cadastro.ControllerCadastroFuncionario.puxaEnderecoFuncionario;
import static Controller.Cadastro.ControllerCadastroFornecedor.puxaEndecoFornecedor;
import Controller.Cadastro.ControllerCadastroFuncionario;
import Controller.Cadastro.ControllerCadastroFornecedor;
import static Model.DAO.Persiste.enderecoList;
import Model.Endereco;
import View.Busca.BuscaEndereco;
import View.Cadastro.CadastroCliente;
import View.Cadastro.CadastroEndereco;
import View.Cadastro.CadastroFornecedor;
import View.Cadastro.CadastroFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class ControllerBuscaEndereco implements ActionListener {

    // Criando um objeto global do tipo da tela que iremos controlar.
    BuscaEndereco buscaEndereco;
    int contador;

    //Passando a tela que iremos controlar como parametro de invocação.
    public ControllerBuscaEndereco(BuscaEndereco buscaEndereco) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.buscaEndereco = buscaEndereco;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.buscaEndereco.getButtonCancel().addActionListener(this);
        this.buscaEndereco.getButtonLoad().addActionListener(this);
        this.buscaEndereco.getButtonFilter().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.buscaEndereco.getButtonCancel()) {
            buscaEndereco.dispose();
        }
        if (e.getSource() == this.buscaEndereco.getButtonFilter()) {
            //Criando/Carregando uma instância da classe "singleton" de dados.
            Model.DAO.Persiste.getInstance();
            contador++;
            if(contador == 1){
            //Criando uma objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.buscaEndereco.getTable().getModel();
            for (Endereco enderecoAtual : enderecoList) {
                tabela.addRow(new Object[]{enderecoAtual.getId(), enderecoAtual.getCep(), enderecoAtual.getLogradouro(), enderecoAtual.getCidade().getDescricao(),
                    enderecoAtual.getBairro().getDescricao(), enderecoAtual.getStatus()});
                }
            }
    }
        if (e.getSource() == this.buscaEndereco.getButtonLoad()) {
         
            //CRIA AS TELAS E CONTROLLERS QUE PODEM SER USADAS
            CadastroCliente cadastroCliente = new CadastroCliente();
            ControllerCadastroCliente controllerCadastroCliente = new ControllerCadastroCliente(cadastroCliente);
            
            CadastroFornecedor cadastroFornecedor = new CadastroFornecedor();
            ControllerCadastroFornecedor controllerCadastroFornecedor = new ControllerCadastroFornecedor(cadastroFornecedor);
            
            CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
            ControllerCadastroFuncionario controllerCadastroFuncionario = new ControllerCadastroFuncionario(cadastroFuncionario);
            
            CadastroEndereco cadastroEndereco = new CadastroEndereco();
            Controller.Cadastro.ControllerCadastroEndereco controllerCadastroEndereco = new Controller.Cadastro.ControllerCadastroEndereco(cadastroEndereco);
            //ESCOLHE COM BASE NOS VALORES BOOLEAN EM QUAL TELA IRÁ RECEBER OS DADOS
            if (puxaEndecoFornecedor == true){
                
            Utilities.Utilities.ativa(false, cadastroFornecedor.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, cadastroFornecedor.getPanelMid());
            
            //DESABILITA BOTÕES NOVAMENTE
            cadastroFornecedor.getIdTF().setEnabled(false);
            cadastroFornecedor.getCepTF().setEnabled(false);
            cadastroFornecedor.getBairroTF().setEnabled(false);
            cadastroFornecedor.getCidadeTF().setEnabled(false);
            
            //PUXA DADOS PARA VOLTAR PARA A TELA FORNECEDOR
            cadastroFornecedor.getCidadeTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 3).toString());
            cadastroFornecedor.getCepTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 1).toString());
            cadastroFornecedor.getBairroTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 4).toString());
            
            this.buscaEndereco.dispose();
            cadastroFornecedor.setVisible(true);
  
            puxaEndecoFornecedor = false;
            }else if (puxaEnderecoFuncionario == true){
            Utilities.Utilities.ativa(false, cadastroFuncionario.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, cadastroFuncionario.getPanelMid());
            
            //DESABILITA BOTÕES NOVAMENTE
            cadastroFuncionario.getIdTF().setEnabled(false);
            cadastroFuncionario.getCepTF().setEnabled(false);
            cadastroFuncionario.getBairroTF().setEnabled(false);
            cadastroFuncionario.getCidadeTF().setEnabled(false);
            
            //PUXA DADOS PARA VOLTAR PARA A TELA FUNCIONARIO
            cadastroFuncionario.getCidadeTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 3).toString());
            cadastroFuncionario.getCepTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 1).toString());
            cadastroFuncionario.getBairroTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 4).toString());
            
            this.buscaEndereco.dispose();
            cadastroFuncionario.setVisible(true);
  
            puxaEnderecoFuncionario = false;
            }else if (puxaEnderecoCliente == true){
            Utilities.Utilities.ativa(false, cadastroCliente.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, cadastroCliente.getPanelMid());
            
            //DESABILITA BOTÕES NOVAMENTE
            cadastroCliente.getIdTF().setEnabled(false);
            cadastroCliente.getCepTF().setEnabled(false);
            cadastroCliente.getBairroTF().setEnabled(false);
            cadastroCliente.getCidadeTF().setEnabled(false);
            
            //PUXA DADOS PARA VOLTAR PARA A TELA CLIENTE
            cadastroCliente.getCidadeTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 3).toString());
            cadastroCliente.getCepTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 1).toString());
            cadastroCliente.getBairroTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 4).toString());
            
            this.buscaEndereco.dispose();
            cadastroCliente.setVisible(true);
  
            puxaEnderecoCliente = false;
            }else{
            Utilities.Utilities.ativa(false, cadastroEndereco.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, cadastroEndereco.getPanelMid());
            cadastroEndereco.getIdTF().setEnabled(false);
            
            cadastroEndereco.setVisible(true);
            Controller.Cadastro.ControllerCadastroEndereco.codigo = (int) this.buscaEndereco.getTable().getValueAt
            (this.buscaEndereco.getTable().getSelectedRow(), 0);
            
            cadastroEndereco.getIdTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 0).toString());
            cadastroEndereco.getCepTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 1).toString());
            cadastroEndereco.getLogradouroTF().setText(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 2).toString());
            cadastroEndereco.getCidadeCB().setSelectedItem(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 3));
            cadastroEndereco.getBairroCB().setSelectedItem(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 4));
            cadastroEndereco.getStatusCB().setSelectedItem(this.buscaEndereco.getTable().getValueAt(this.buscaEndereco.getTable().getSelectedRow(), 5));
            this.buscaEndereco.dispose();
            } 
                
                
                
                
            
            }
            
            
            }

    }
    

