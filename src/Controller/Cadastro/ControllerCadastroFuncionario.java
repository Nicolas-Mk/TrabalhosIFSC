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
import Service.FuncionarioService;
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
            funcionario.setSenha(this.cadastroFuncionario.getSenhaTF().getText());
            funcionario.setCpf(this.cadastroFuncionario.getCpfTF().getText());
            funcionario.setRg(this.cadastroFuncionario.getRgTF().getText());
            funcionario.setEmail(this.cadastroFuncionario.getEmailTF().getText());
            funcionario.setComplementoEndereco(this.cadastroFuncionario.getComplementoEnderecoTF().getText());
            funcionario.getEndereco().setCep(this.cadastroFuncionario.getCepTF().getText());
            funcionario.setStatus(this.cadastroFuncionario.getStatusCB().getSelectedItem().toString());
            
             if(this.cadastroFuncionario.getIdTF().getText().equalsIgnoreCase("")){
                    FuncionarioService.create(funcionario);
                    }else{
                    funcionario.setId(Integer.parseInt(this.cadastroFuncionario.getIdTF().getText()));
                    FuncionarioService.update(funcionario);
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
               funcionario = FuncionarioService.retrieve(codigo);
               Utilities.Utilities.ativa(false, this.cadastroFuncionario.getPanelBottom());
               Utilities.Utilities.limpaComponentes(true, this.cadastroFuncionario.getPanelMid());
               this.cadastroFuncionario.getIdTF().setText(funcionario.getId() +"");
               this.cadastroFuncionario.getNomeTF().setText(funcionario.getNome());
               this.cadastroFuncionario.getFone1TF().setText(funcionario.getFone());
               this.cadastroFuncionario.getFone2TF().setText(funcionario.getFone2());
               this.cadastroFuncionario.getUsuarioTF().setText(funcionario.getUsuario());
               this.cadastroFuncionario.getSenhaTF().setText(funcionario.getSenha());
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
