/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cadastro;

import Controller.Busca.ControllerBuscaEndereco;
import Controller.Busca.ControllerBuscaFuncionario;
import static Model.DAO.Persiste.funcionarioList;
import Model.Funcionario;
import View.Busca.BuscaEndereco;
import View.Busca.BuscaFuncionario;
import View.Cadastro.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controller.Cadastro.ControllerCadastroFuncionario;
import Model.Endereco;
/**
 *
 * @author aluno
 */
public class ControllerCadastroFuncionario implements ActionListener {

    // Criando um objeto global do tipo da tela que será controlada.
    CadastroFuncionario cadastroFuncionario;
    public static int codigo;
    public static boolean puxaEnderecoFuncionario = false;

    //Passando a tela que será controlada como parametro de invocação.
    public ControllerCadastroFuncionario(CadastroFuncionario cadastroFuncionario) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.cadastroFuncionario = cadastroFuncionario;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.cadastroFuncionario.getButtonNew().addActionListener(this);
        this.cadastroFuncionario.getButtonExit().addActionListener(this);
        this.cadastroFuncionario.getButtonCancel().addActionListener(this);
        this.cadastroFuncionario.getButtonGravar().addActionListener(this);
        this.cadastroFuncionario.getButtonSearch().addActionListener(this);
        this.cadastroFuncionario.getButtonCliente().addActionListener(this);
        

        Utilities.Utilities.ativa(true, this.cadastroFuncionario.getPanelBottom());
        Utilities.Utilities.limpaComponentes(false, this.cadastroFuncionario.getPanelMid());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.cadastroFuncionario.getButtonNew()) {
            Utilities.Utilities.ativa(false, this.cadastroFuncionario.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, this.cadastroFuncionario.getPanelMid());
            this.cadastroFuncionario.getIdTF().setEnabled(false);
            this.cadastroFuncionario.getCepTF().setEnabled(false);
            this.cadastroFuncionario.getBairroTF().setEnabled(false);
            this.cadastroFuncionario.getCidadeTF().setEnabled(false);
        } else if (e.getSource() == this.cadastroFuncionario.getButtonExit()) {
            this.cadastroFuncionario.dispose();
        } else if (e.getSource() == this.cadastroFuncionario.getButtonCancel()) {
            Utilities.Utilities.ativa(true, this.cadastroFuncionario.getPanelBottom());
            Utilities.Utilities.limpaComponentes(false, this.cadastroFuncionario.getPanelMid());
        } else if (e.getSource() == this.cadastroFuncionario.getButtonGravar()) {
            Utilities.Utilities.ativa(true, this.cadastroFuncionario.getPanelBottom());
            
            String id = this.cadastroFuncionario.getIdTF().getText();
            Funcionario funcionario = new Funcionario();
            Endereco endereco = new Endereco();
            funcionario.setEndereco(endereco);
            funcionario.setId((funcionarioList.size()+1));
            funcionario.setNome((this.cadastroFuncionario.getNomeTF().getText()));
            funcionario.setFone(this.cadastroFuncionario.getFone1TF().getText());
            funcionario.setFone2(this.cadastroFuncionario.getFone2TF().getText());
            funcionario.setUsuario(this.cadastroFuncionario.getUsuarioTF().getText());
            funcionario.setCpf(this.cadastroFuncionario.getCpfTF().getText());
            funcionario.setRg(this.cadastroFuncionario.getRgTF().getText());
            funcionario.setEmail(this.cadastroFuncionario.getEmailTF().getText());
            funcionario.setComplementoEndereco(this.cadastroFuncionario.getComplementoEnderecoTF().getText());
            funcionario.getEndereco().setCep(this.cadastroFuncionario.getCepTF().getText());
            funcionario.setStatus(this.cadastroFuncionario.getStatusCB().getSelectedItem().toString());
            
            if(this.cadastroFuncionario.getIdTF().getText().equalsIgnoreCase("")){
                      Model.DAO.Persiste.funcionarioList.add(funcionario);
                    }else if (funcionarioList.size() > 0) {
                        
                if (!funcionarioList.get(Integer.parseInt(id) - 1).getNome().equals(this.cadastroFuncionario.getNomeTF())) {
                    funcionarioList.get(Integer.parseInt(id) - 1).setNome(this.cadastroFuncionario.getNomeTF().getText());
                }
                if (!funcionarioList.get(Integer.parseInt(id) - 1).getFone().equals(this.cadastroFuncionario.getFone1TF())) {
                    funcionarioList.get(Integer.parseInt(id) - 1).setFone(this.cadastroFuncionario.getFone1TF().getText());
                }
                if (!funcionarioList.get(Integer.parseInt(id) - 1).getFone2().equals(this.cadastroFuncionario.getFone2TF())) {
                    funcionarioList.get(Integer.parseInt(id) - 1).setFone2(this.cadastroFuncionario.getFone2TF().getText());
                }
                if (!funcionarioList.get(Integer.parseInt(id) - 1).getUsuario().equals(this.cadastroFuncionario.getUsuarioTF())) {
                    funcionarioList.get(Integer.parseInt(id) - 1).setUsuario(this.cadastroFuncionario.getUsuarioTF().getText());
                }
                if (!funcionarioList.get(Integer.parseInt(id) - 1).getCpf().equals(this.cadastroFuncionario.getCpfTF())) {
                    funcionarioList.get(Integer.parseInt(id) - 1).setCpf(this.cadastroFuncionario.getCpfTF().getText());
                }
                if (!funcionarioList.get(Integer.parseInt(id) - 1).getEmail().equals(this.cadastroFuncionario.getEmailTF())) {
                    funcionarioList.get(Integer.parseInt(id) - 1).setEmail(this.cadastroFuncionario.getEmailTF().getText());
                }
                if (!funcionarioList.get(Integer.parseInt(id) - 1).getComplementoEndereco().equals(this.cadastroFuncionario.getComplementoEnderecoTF())) {
                    funcionarioList.get(Integer.parseInt(id) - 1).setComplementoEndereco(this.cadastroFuncionario.getComplementoEnderecoTF().getText());
                }
                if (!funcionarioList.get(Integer.parseInt(id) - 1).getEndereco().getCep().equals(this.cadastroFuncionario.getCepTF())) {
                    funcionarioList.get(Integer.parseInt(id) - 1).getEndereco().setCep(this.cadastroFuncionario.getCepTF().getText());
                }
                    }
            
            Utilities.Utilities.limpaComponentes(false, this.cadastroFuncionario.getPanelMid());
        } else if (e.getSource() == this.cadastroFuncionario.getButtonSearch()) {
            BuscaFuncionario buscaFuncionario = new BuscaFuncionario();
            ControllerBuscaFuncionario controllerBuscaFuncionario = new ControllerBuscaFuncionario(buscaFuncionario);
            buscaFuncionario.setVisible(true);
            this.cadastroFuncionario.dispose();
           
           codigo = 0;
            
             if (codigo != 0){
               Funcionario funcionario = new Funcionario();
               funcionario = Model.DAO.Persiste.funcionarioList.get(codigo -1);
               Utilities.Utilities.ativa(false, this.cadastroFuncionario.getPanelBottom());
               Utilities.Utilities.limpaComponentes(true, this.cadastroFuncionario.getPanelMid());
               this.cadastroFuncionario.getIdTF().setText(funcionario.getId() +"");
               this.cadastroFuncionario.getNomeTF().setText(funcionario.getNome());
               this.cadastroFuncionario.getFone1TF().setText(funcionario.getFone());
               this.cadastroFuncionario.getFone2TF().setText(funcionario.getFone2());
               this.cadastroFuncionario.getUsuarioTF().setText(funcionario.getUsuario());
               this.cadastroFuncionario.getCpfTF().setText(funcionario.getCpf());
               this.cadastroFuncionario.getEmailTF().setText(funcionario.getEmail());
               this.cadastroFuncionario.getComplementoEnderecoTF().setText(funcionario.getComplementoEndereco());
               this.cadastroFuncionario.getCepTF().setText(funcionario.getEndereco().getCep());
               this.cadastroFuncionario.getStatusCB().setSelectedItem(funcionario.getStatus());
               this.cadastroFuncionario.getIdTF().setEnabled(false);
             }
        }else if (e.getSource() == this.cadastroFuncionario.getButtonCliente()) {
             BuscaEndereco buscaEndereco = new BuscaEndereco();
             ControllerBuscaEndereco controllerBuscaCliente = new ControllerBuscaEndereco(buscaEndereco);
             puxaEnderecoFuncionario = true;
             buscaEndereco.setVisible(true);
             this.cadastroFuncionario.dispose();
        }
    }

}
