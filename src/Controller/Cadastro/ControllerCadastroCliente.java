/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cadastro;


import Controller.Busca.ControllerBuscaCliente;
import Controller.Busca.ControllerBuscaEndereco;
import static Model.DAO.Persiste.clienteList;
import Model.Cliente;
import Model.Endereco;
import View.Busca.BuscaCliente;
import View.Busca.BuscaEndereco;
import View.Cadastro.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author aluno
 */
public class ControllerCadastroCliente implements ActionListener {

    // Criando um objeto global do tipo da tela que iremos controlar.
    CadastroCliente cadastroCliente;
    public static int codigo;
    public static boolean puxaEnderecoCliente = false;

    //Passando a tela que iremos controlar como parametro de invocação.
    public ControllerCadastroCliente(CadastroCliente cadastroCliente) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.cadastroCliente = cadastroCliente;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.cadastroCliente.getButtonNew().addActionListener(this);
        this.cadastroCliente.getButtonExit().addActionListener(this);
        this.cadastroCliente.getButtonCancel().addActionListener(this);
        this.cadastroCliente.getButtonGravar().addActionListener(this);
        this.cadastroCliente.getButtonSearch().addActionListener(this);
        this.cadastroCliente.getButtonCliente().addActionListener(this);

        Utilities.Utilities.ativa(true, this.cadastroCliente.getPanelBottom());
        Utilities.Utilities.limpaComponentes(false, this.cadastroCliente.getPanelMid());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.cadastroCliente.getButtonNew()) {
            Utilities.Utilities.ativa(false, this.cadastroCliente.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, this.cadastroCliente.getPanelMid());
            this.cadastroCliente.getIdTF().setEnabled(false);
            this.cadastroCliente.getCepTF().setEnabled(false);
            this.cadastroCliente.getBairroTF().setEnabled(false);
            this.cadastroCliente.getCidadeTF().setEnabled(false);
        } else if (e.getSource() == this.cadastroCliente.getButtonExit()) {
            this.cadastroCliente.dispose();
        } else if (e.getSource() == this.cadastroCliente.getButtonCancel()) {
            Utilities.Utilities.ativa(true, this.cadastroCliente.getPanelBottom());
            Utilities.Utilities.limpaComponentes(false, this.cadastroCliente.getPanelMid());
        } else if (e.getSource() == this.cadastroCliente.getButtonGravar()) {
            Utilities.Utilities.ativa(true, this.cadastroCliente.getPanelBottom());
            
            String id = this.cadastroCliente.getIdTF().getText();
            Cliente cliente = new Cliente();
            Endereco endereco = new Endereco();
            cliente.setEndereco(endereco);
            cliente.setId((clienteList.size()+1));
            cliente.setNome((this.cadastroCliente.getNomeTF().getText()));
            cliente.setCpf(this.cadastroCliente.getCpfTF().getText());
            cliente.setFone(this.cadastroCliente.getFone1TF().getText());
            cliente.setFone2(this.cadastroCliente.getFone2TF().getText());
            cliente.setEmail(this.cadastroCliente.getEmailTF().getText());
            cliente.setMatricula(this.cadastroCliente.getMatriculaTF().getText());
            cliente.getEndereco().setCep(this.cadastroCliente.getCepTF().getText());
            cliente.setComplementoEndereco(this.cadastroCliente.getComplementoEnderecoTF().getText());
            cliente.setDataNascimento(this.cadastroCliente.getDataNascimentoTF().getText());
            cliente.getEndereco().setCep(this.cadastroCliente.getCepTF().getText());
            
             if(this.cadastroCliente.getIdTF().getText().equalsIgnoreCase("")){
                      Model.DAO.Persiste.clienteList.add(cliente);
                    }else if (clienteList.size() > 0) {
                        
                if (!clienteList.get(Integer.parseInt(id) - 1).getNome().equals(this.cadastroCliente.getNomeTF())) {
                    clienteList.get(Integer.parseInt(id) - 1).setNome(this.cadastroCliente.getNomeTF().getText());
                }
                if (!clienteList.get(Integer.parseInt(id) - 1).getCpf().equals(this.cadastroCliente.getCpfTF())) {
                    clienteList.get(Integer.parseInt(id) - 1).setCpf(this.cadastroCliente.getCpfTF().getText());
                }
                if (!clienteList.get(Integer.parseInt(id) - 1).getFone().equals(this.cadastroCliente.getFone1TF())) {
                    clienteList.get(Integer.parseInt(id) - 1).setFone(this.cadastroCliente.getFone1TF().getText());
                }
                if (!clienteList.get(Integer.parseInt(id) - 1).getFone2().equals(this.cadastroCliente.getFone2TF())) {
                    clienteList.get(Integer.parseInt(id) - 1).setFone2(this.cadastroCliente.getFone2TF().getText());
                }
                if (!clienteList.get(Integer.parseInt(id) - 1).getEmail().equals(this.cadastroCliente.getEmailTF())) {
                    clienteList.get(Integer.parseInt(id) - 1).setEmail(this.cadastroCliente.getEmailTF().getText());
                }
                if (!clienteList.get(Integer.parseInt(id) - 1).getMatricula().equals(this.cadastroCliente.getMatriculaTF())) {
                    clienteList.get(Integer.parseInt(id) - 1).setMatricula(this.cadastroCliente.getMatriculaTF().getText());
                }
                if (!clienteList.get(Integer.parseInt(id) - 1).getComplementoEndereco().equals(this.cadastroCliente.getComplementoEnderecoTF())) {
                    clienteList.get(Integer.parseInt(id) - 1).setComplementoEndereco(this.cadastroCliente.getComplementoEnderecoTF().getText());
                }
                if (!clienteList.get(Integer.parseInt(id) - 1).getDataNascimento().equals(this.cadastroCliente.getDataNascimentoTF())) {
                    clienteList.get(Integer.parseInt(id) - 1).setDataNascimento(this.cadastroCliente.getDataNascimentoTF().getText());
                }
                if (!clienteList.get(Integer.parseInt(id) - 1).getEndereco().getCep().equals(this.cadastroCliente.getCepTF())) {
                    clienteList.get(Integer.parseInt(id) - 1).getEndereco().setCep(this.cadastroCliente.getCepTF().getText());
                }
   
                    }

            Utilities.Utilities.limpaComponentes(false, this.cadastroCliente.getPanelMid());
        } else if (e.getSource() == this.cadastroCliente.getButtonSearch()) {
             BuscaCliente buscaCliente = new BuscaCliente();
             ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(buscaCliente);
             buscaCliente.setVisible(true);
             this.cadastroCliente.dispose();
           
           codigo = 0;
            
             if (codigo != 0){
               Cliente Cliente = new Cliente();
               Cliente = Model.DAO.Persiste.clienteList.get(codigo -1);
               Utilities.Utilities.ativa(false, this.cadastroCliente.getPanelBottom());
               Utilities.Utilities.limpaComponentes(true, this.cadastroCliente.getPanelMid());
               this.cadastroCliente.getIdTF().setText(Cliente.getId() +"");
               this.cadastroCliente.getNomeTF().setText(Cliente.getNome());
               this.cadastroCliente.getCpfTF().setText(Cliente.getCpf());
               this.cadastroCliente.getFone1TF().setText(Cliente.getFone());
               this.cadastroCliente.getFone2TF().setText(Cliente.getFone2());
               this.cadastroCliente.getMatriculaTF().setText(Cliente.getMatricula());
               this.cadastroCliente.getEmailTF().setText(Cliente.getEmail());
               this.cadastroCliente.getComplementoEnderecoTF().setText(Cliente.getComplementoEndereco());
               this.cadastroCliente.getDataNascimentoTF().setText(Cliente.getDataNascimento());
               this.cadastroCliente.getCepTF().setText(Cliente.getEndereco().getCep());
               this.cadastroCliente.getIdTF().setEnabled(false);
             }
        }else if (e.getSource() == this.cadastroCliente.getButtonCliente()) {
             BuscaEndereco buscaEndereco = new BuscaEndereco();
             ControllerBuscaEndereco controllerBuscaCliente = new ControllerBuscaEndereco(buscaEndereco);
             puxaEnderecoCliente = true;
             buscaEndereco.setVisible(true);
             this.cadastroCliente.dispose();
        }

    }
}
