/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cadastro;

import Controller.Busca.ControllerBuscaBairro;
import Controller.Busca.ControllerBuscaCidade;
import Controller.Busca.ControllerBuscaEndereco;
import static Model.DAO.Persiste.enderecoList;
import Model.Bairro;
import Model.Cidade;
import Model.Endereco;
import View.Busca.BuscaBairro;
import View.Busca.BuscaCidade;
import View.Busca.BuscaEndereco;
import View.Cadastro.CadastroEndereco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aluno
 */
public class ControllerCadastroEndereco implements ActionListener {

    // Criando um objeto global do tipo da tela que será controlada.
    CadastroEndereco cadastroEndereco;
    public static int codigo;
    public static boolean puxaBairroEndereco;
    public static boolean puxaCidadeEndereco;
    public static boolean reset = true;

    //Passando a tela que será controlada como parametro de invocação.
    public ControllerCadastroEndereco(CadastroEndereco cadastroEndereco) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.cadastroEndereco = cadastroEndereco;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.cadastroEndereco.getButtonNew().addActionListener(this);
        this.cadastroEndereco.getButtonExit().addActionListener(this);
        this.cadastroEndereco.getButtonCancel().addActionListener(this);
        this.cadastroEndereco.getButtonGravar().addActionListener(this);
        this.cadastroEndereco.getButtonSearch().addActionListener(this);
        this.cadastroEndereco.getButtonBairro().addActionListener(this);
        this.cadastroEndereco.getButtonCidade().addActionListener(this);
        
        if (reset == true){

        Utilities.Utilities.ativa(true, this.cadastroEndereco.getPanelBottom());
        Utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getPanelMid());
        }
    } 
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.cadastroEndereco.getButtonNew()) {
            Utilities.Utilities.ativa(false, this.cadastroEndereco.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, this.cadastroEndereco.getPanelMid());
            this.cadastroEndereco.getIdTF().setEnabled(false);
            this.cadastroEndereco.getCidadeTF().setEnabled(false);
            this.cadastroEndereco.getBairroTF().setEnabled(false);
        } else if (e.getSource() == this.cadastroEndereco.getButtonExit()) {
            this.cadastroEndereco.dispose();
            puxaBairroEndereco = false;
            puxaCidadeEndereco = false;
        } else if (e.getSource() == this.cadastroEndereco.getButtonCancel()) {
            Utilities.Utilities.ativa(true, this.cadastroEndereco.getPanelBottom());
            Utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getPanelMid());
        } else if (e.getSource() == this.cadastroEndereco.getButtonGravar()) {
            Utilities.Utilities.ativa(true, this.cadastroEndereco.getPanelBottom());
            
            String id = this.cadastroEndereco.getIdTF().getText();
            Endereco endereco = new Endereco();
            Cidade cidade = new Cidade();
            Bairro bairro = new Bairro();
            endereco.setCidade(cidade);
            endereco.setBairro(bairro);

            endereco.setId((enderecoList.size()+1));
            endereco.setCep(this.cadastroEndereco.getCepTF().getText());
            endereco.setLogradouro(this.cadastroEndereco.getLogradouroTF().getText());
          //  endereco.getCidade().setDescricao(this.cadastroEndereco
          //  endereco.getBairro().setDescricao(this.cadastroEndereco       
            endereco.setStatus(this.cadastroEndereco.getStatusCB().getSelectedItem().toString());
             
            if(this.cadastroEndereco.getIdTF().getText().equalsIgnoreCase("")){
                      Model.DAO.Persiste.enderecoList.add(endereco);
                    }else if (enderecoList.size() > 0) {
                        
                if (!enderecoList.get(Integer.parseInt(id) - 1).getCep().equals(this.cadastroEndereco.getCepTF())) {
                    enderecoList.get(Integer.parseInt(id) - 1).setCep(this.cadastroEndereco.getCepTF().getText());
                }
                if (!enderecoList.get(Integer.parseInt(id) - 1).getLogradouro().equals(this.cadastroEndereco.getLogradouroTF())) {
                    enderecoList.get(Integer.parseInt(id) - 1).setLogradouro(this.cadastroEndereco.getCepTF().getText());
                }
                if (!enderecoList.get(Integer.parseInt(id) - 1).getCidade().getDescricao().equals(this.cadastroEndereco.getCidadeTF())) {
                    enderecoList.get(Integer.parseInt(id) - 1).getCidade().setDescricao(this.cadastroEndereco.getCidadeTF().getText());
                }
                if (!enderecoList.get(Integer.parseInt(id) - 1).getBairro().getDescricao().equals(this.cadastroEndereco.getBairroTF())) {
                    enderecoList.get(Integer.parseInt(id) - 1).getBairro().setDescricao(this.cadastroEndereco.getBairroTF().getText());
                }
                if (!enderecoList.get(Integer.parseInt(id) - 1).getStatus().equals(this.cadastroEndereco.getStatusCB().getSelectedItem().toString())) {
                    enderecoList.get(Integer.parseInt(id) - 1).setStatus(this.cadastroEndereco.getStatusCB().getSelectedItem().toString());
                }
                        
                    }
        
           
            
            Utilities.Utilities.limpaComponentes(false, this.cadastroEndereco.getPanelMid());
        } else if (e.getSource() == this.cadastroEndereco.getButtonSearch()) {
            BuscaEndereco buscaEndereco = new BuscaEndereco();
            ControllerBuscaEndereco controllerBuscaEndereco = new ControllerBuscaEndereco(buscaEndereco);
            buscaEndereco.setVisible(true);
            this.cadastroEndereco.dispose();
           
           codigo = 0;
            
             if (codigo != 0){
               Endereco endereco = new Endereco();
               endereco = Model.DAO.Persiste.enderecoList.get(codigo -1);
               Utilities.Utilities.ativa(false, this.cadastroEndereco.getPanelBottom());
               Utilities.Utilities.limpaComponentes(true, this.cadastroEndereco.getPanelMid());
               this.cadastroEndereco.getIdTF().setText(endereco.getId() +"");
               this.cadastroEndereco.getCepTF().setText(endereco.getCep());
               this.cadastroEndereco.getLogradouroTF().setText(endereco.getLogradouro());
               this.cadastroEndereco.getCidadeTF().setText(endereco.getCidade().getDescricao());
               this.cadastroEndereco.getBairroTF().setText(endereco.getBairro().getDescricao());
               this.cadastroEndereco.getStatusCB().setSelectedItem(endereco.getStatus());        
               
               this.cadastroEndereco.getIdTF().setEnabled(false);
             }
        }else if (e.getSource() == this.cadastroEndereco.getButtonCidade()) {
            BuscaCidade buscaCidade = new BuscaCidade();
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(buscaCidade);
            this.cadastroEndereco.dispose();
            buscaCidade.setVisible(true);
            puxaCidadeEndereco = true;
            
        }else if (e.getSource() == this.cadastroEndereco.getButtonBairro()){
            BuscaBairro buscaBairro = new BuscaBairro();
            ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(buscaBairro);
            this.cadastroEndereco.dispose();
            buscaBairro.setVisible(true);
            puxaBairroEndereco = true;
        }

    }

}
