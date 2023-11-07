/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cadastro;

import Controller.Busca.ControllerBuscaEndereco;
import Controller.Busca.ControllerBuscaFornecedor;
import static Model.DAO.Persiste.fornecedorList;
import Model.Endereco;
import Model.Fornecedor;
import Service.FornecedorService;
import View.Busca.BuscaEndereco;
import View.Busca.BuscaFornecedor;
import View.Cadastro.CadastroFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author aluno
 */
public class ControllerCadastroFornecedor implements ActionListener {

    public static boolean puxaEndecoFornecedor = false;

    // Criando um objeto global do tipo da tela que será controlada.
    CadastroFornecedor cadastroFornecedor;
    public static int codigo;


    //Passando a tela que será controlada como parametro de invocação.
    public ControllerCadastroFornecedor(CadastroFornecedor cadastroFornecedor) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.cadastroFornecedor = cadastroFornecedor;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.cadastroFornecedor.getButtonNew().addActionListener(this);
        this.cadastroFornecedor.getButtonExit().addActionListener(this);
        this.cadastroFornecedor.getButtonCancel().addActionListener(this);
        this.cadastroFornecedor.getButtonGravar().addActionListener(this);
        this.cadastroFornecedor.getButtonSearch().addActionListener(this);
        this.cadastroFornecedor.getButtonCliente().addActionListener(this);

        Utilities.Utilities.ativa(true, this.cadastroFornecedor.getPanelBottom());
        Utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getPanelMid());
        


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.cadastroFornecedor.getButtonNew()) {
            Utilities.Utilities.ativa(false, this.cadastroFornecedor.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, this.cadastroFornecedor.getPanelMid());
            this.cadastroFornecedor.getIdTF().setEnabled(false);
            this.cadastroFornecedor.getCepTF().setEnabled(false);
            this.cadastroFornecedor.getBairroTF().setEnabled(false);
            this.cadastroFornecedor.getCidadeTF().setEnabled(false);
        } else if (e.getSource() == this.cadastroFornecedor.getButtonExit()) {
            this.cadastroFornecedor.dispose();
        } else if (e.getSource() == this.cadastroFornecedor.getButtonCancel()) {
            Utilities.Utilities.ativa(true, this.cadastroFornecedor.getPanelBottom());
            Utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getPanelMid());
        } else if (e.getSource() == this.cadastroFornecedor.getButtonGravar()) {
            Utilities.Utilities.ativa(true, this.cadastroFornecedor.getPanelBottom());
            
            String id = this.cadastroFornecedor.getIdTF().getText();
            Fornecedor fornecedor = new Fornecedor();
            Endereco endereco = new Endereco();
            fornecedor.setEndereco(endereco);
            fornecedor.setId((fornecedorList.size()+1));
            fornecedor.setNome((this.cadastroFornecedor.getNomeTF().getText()));
            fornecedor.setFone(this.cadastroFornecedor.getFone1TF().getText());
            fornecedor.setFone2(this.cadastroFornecedor.getFone2TF().getText());
            fornecedor.setCnpj(this.cadastroFornecedor.getCnpjTF().getText());
            fornecedor.setInscricaoEstadual(this.cadastroFornecedor.getInscricaoEstadualTF().getText());
            fornecedor.setRazaoSocial(this.cadastroFornecedor.getRazaoSocialTF().getText());
            fornecedor.setEmail(this.cadastroFornecedor.getEmailTF().getText());
            fornecedor.setComplementoEndereco(this.cadastroFornecedor.getComplementoEnderecoTF().getText());
            fornecedor.getEndereco().setCep(this.cadastroFornecedor.getCepTF().getText());
            fornecedor.setStatus(this.cadastroFornecedor.getStatusCB().getSelectedItem().toString());
            
            if(this.cadastroFornecedor.getIdTF().getText().equalsIgnoreCase("")){
                    FornecedorService.create(fornecedor);
                    }else{
                    fornecedor.setId(Integer.parseInt(this.cadastroFornecedor.getIdTF().getText()));
                    FornecedorService.update(fornecedor);
                        }
            
            
            Utilities.Utilities.limpaComponentes(false, this.cadastroFornecedor.getPanelMid());
        } else if (e.getSource() == this.cadastroFornecedor.getButtonSearch()) {
            BuscaFornecedor buscaFornecedor = new BuscaFornecedor();
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(buscaFornecedor);
            buscaFornecedor.setVisible(true);
            this.cadastroFornecedor.dispose();
           
           codigo = 0;
            
             if (codigo != 0){
               Fornecedor fornecedor = new Fornecedor();
               fornecedor = FornecedorService.retrieve(codigo);
               Utilities.Utilities.ativa(false, this.cadastroFornecedor.getPanelBottom());
               Utilities.Utilities.limpaComponentes(true, this.cadastroFornecedor.getPanelMid());
               this.cadastroFornecedor.getIdTF().setText(fornecedor.getId() +"");
               this.cadastroFornecedor.getNomeTF().setText(fornecedor.getNome());
               this.cadastroFornecedor.getFone1TF().setText(fornecedor.getFone());
               this.cadastroFornecedor.getFone2TF().setText(fornecedor.getFone2());
               this.cadastroFornecedor.getCnpjTF().setText(fornecedor.getCnpj());
               this.cadastroFornecedor.getInscricaoEstadualTF().setText(fornecedor.getInscricaoEstadual());
               this.cadastroFornecedor.getRazaoSocialTF().setText(fornecedor.getRazaoSocial());
               this.cadastroFornecedor.getEmailTF().setText(fornecedor.getEmail());
               this.cadastroFornecedor.getComplementoEnderecoTF().setText(fornecedor.getComplementoEndereco());
               this.cadastroFornecedor.getCepTF().setText(fornecedor.getEndereco().getCep());
               this.cadastroFornecedor.getStatusCB().setSelectedItem(fornecedor.getStatus());
               this.cadastroFornecedor.getIdTF().setEnabled(false);
             }
        
        }else if (e.getSource() == this.cadastroFornecedor.getButtonCliente()) {
             BuscaEndereco buscaEndereco = new BuscaEndereco();
             ControllerBuscaEndereco controllerBuscaCliente = new ControllerBuscaEndereco(buscaEndereco);
             puxaEndecoFornecedor = true;
             buscaEndereco.setVisible(true);
             this.cadastroFornecedor.dispose();
        }
    }
        

}
