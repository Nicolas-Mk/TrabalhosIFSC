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
import Service.ClienteService;
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

    // Criando um objeto global do tipo da tela que será controlada.
    CadastroCliente cadastroCliente;
    public static int codigo;
    public static boolean puxaEnderecoCliente = false;

    //Passando a tela que será controlada como parametro de invocação.
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
            cliente.setRg(this.cadastroCliente.getRgTF().getText());
            cliente.setFone(this.cadastroCliente.getFone1TF().getText());
            cliente.setFone2(this.cadastroCliente.getFone2TF().getText());
            cliente.setEmail(this.cadastroCliente.getEmailTF().getText());
            cliente.setMatricula(this.cadastroCliente.getMatriculaTF().getText());
            cliente.getEndereco().setCep(this.cadastroCliente.getCepTF().getText());
            cliente.setComplementoEndereco(this.cadastroCliente.getComplementoEnderecoTF().getText());
            cliente.setDataNascimento(this.cadastroCliente.getDataNascimentoTF().getText().replace("-", ""));
            cliente.getEndereco().setCep(this.cadastroCliente.getCepTF().getText());
            cliente.setStatus(this.cadastroCliente.getStatusCB().getSelectedItem().toString());
            
            if(this.cadastroCliente.getIdTF().getText().equalsIgnoreCase("")){
                    ClienteService.create(cliente);
                    }else{
                    cliente.setId(Integer.parseInt(this.cadastroCliente.getIdTF().getText()));
                    ClienteService.update(cliente);
                        }

            Utilities.Utilities.limpaComponentes(false, this.cadastroCliente.getPanelMid());
        } else if (e.getSource() == this.cadastroCliente.getButtonSearch()) {
             BuscaCliente buscaCliente = new BuscaCliente();
             ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(buscaCliente);
             buscaCliente.setVisible(true);
             this.cadastroCliente.dispose();
           
           codigo = 0;
            
             if (codigo != 0){
               Cliente cliente = new Cliente();
               cliente = ClienteService.retrieve(codigo);
               Utilities.Utilities.ativa(false, this.cadastroCliente.getPanelBottom());
               Utilities.Utilities.limpaComponentes(true, this.cadastroCliente.getPanelMid());
               this.cadastroCliente.getIdTF().setText(cliente.getId() +"");
               this.cadastroCliente.getNomeTF().setText(cliente.getNome());
               this.cadastroCliente.getCpfTF().setText(cliente.getCpf());
               this.cadastroCliente.getFone1TF().setText(cliente.getFone());
               this.cadastroCliente.getFone2TF().setText(cliente.getFone2());
               this.cadastroCliente.getMatriculaTF().setText(cliente.getMatricula());
               this.cadastroCliente.getEmailTF().setText(cliente.getEmail());
               this.cadastroCliente.getComplementoEnderecoTF().setText(cliente.getComplementoEndereco());
               this.cadastroCliente.getDataNascimentoTF().setText(cliente.getDataNascimento().replace("/", ""));
               this.cadastroCliente.getCepTF().setText(cliente.getEndereco().getCep());
               this.cadastroCliente.getStatusCB().setSelectedItem(cliente.getStatus());
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
