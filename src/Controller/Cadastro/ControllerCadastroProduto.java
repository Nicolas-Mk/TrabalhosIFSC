/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cadastro;

import Controller.Busca.ControllerBuscaProduto;
import static Model.DAO.Persiste.produtoList;
import Model.Produto;
import View.Busca.BuscaProduto;
import View.Cadastro.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author aluno
 */
public class ControllerCadastroProduto implements ActionListener {

    // Criando um objeto global do tipo da tela que será controlada.
    CadastroProduto cadastroProduto;
    public static int codigo;

    //Passando a tela que será controlada como parametro de invocação.
    public ControllerCadastroProduto(CadastroProduto cadastroProduto) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.cadastroProduto = cadastroProduto;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.cadastroProduto.getButtonNew().addActionListener(this);
        this.cadastroProduto.getButtonExit().addActionListener(this);
        this.cadastroProduto.getButtonCancel().addActionListener(this);
        this.cadastroProduto.getButtonGravar().addActionListener(this);
        this.cadastroProduto.getButtonSearch().addActionListener(this);

        Utilities.Utilities.ativa(true, this.cadastroProduto.getPanelBottom());
        Utilities.Utilities.limpaComponentes(false, this.cadastroProduto.getPanelMid());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.cadastroProduto.getButtonNew()) {
            Utilities.Utilities.ativa(false, this.cadastroProduto.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, this.cadastroProduto.getPanelMid());
            this.cadastroProduto.getIdTF().setEnabled(false);
        } else if (e.getSource() == this.cadastroProduto.getButtonExit()) {
            this.cadastroProduto.dispose();
        } else if (e.getSource() == this.cadastroProduto.getButtonCancel()) {
            Utilities.Utilities.ativa(true, this.cadastroProduto.getPanelBottom());
            Utilities.Utilities.limpaComponentes(false, this.cadastroProduto.getPanelMid());
        } else if (e.getSource() == this.cadastroProduto.getButtonGravar()) {
            Utilities.Utilities.ativa(true, this.cadastroProduto.getPanelBottom());
            
            String id = this.cadastroProduto.getIdTF().getText();
            Produto produto = new Produto();
            produto.setId((produtoList.size()+1));
            produto.setCodigoBarra(this.cadastroProduto.getCodigodeBarrasTF().getText());
            produto.setStatus(this.cadastroProduto.getStatusCB().getSelectedItem().toString());
            produto.setDescricao(this.cadastroProduto.getDescricaoTF().getText());
            
            if(this.cadastroProduto.getIdTF().getText().equalsIgnoreCase("")){
                      Model.DAO.Persiste.produtoList.add(produto);
                    }else if (produtoList.size() > 0) {
                        
                if (!produtoList.get(Integer.parseInt(id) - 1).getDescricao().equals(this.cadastroProduto.getDescricaoTF())) {
                produtoList.get(Integer.parseInt(id) - 1).setDescricao(this.cadastroProduto.getDescricaoTF().getText());
                }   
                if (!produtoList.get(Integer.parseInt(id) - 1).getCodigoBarra().equals(this.cadastroProduto.getCodigodeBarrasTF())) {
                    produtoList.get(Integer.parseInt(id) - 1).setCodigoBarra(this.cadastroProduto.getCodigodeBarrasTF().getText());
                }        
                if (!produtoList.get(Integer.parseInt(id) - 1).getStatus().equals(this.cadastroProduto.getStatusCB().getSelectedItem().toString())) {
                    produtoList.get(Integer.parseInt(id) - 1).setStatus(this.cadastroProduto.getStatusCB().getSelectedItem().toString());
                }
                
                        
                    }
            
            Utilities.Utilities.limpaComponentes(false, this.cadastroProduto.getPanelMid());
        } else if (e.getSource() == this.cadastroProduto.getButtonSearch()) {
            BuscaProduto buscaProduto = new BuscaProduto();
            ControllerBuscaProduto controllerBuscaProduto = new ControllerBuscaProduto(buscaProduto);
            buscaProduto.setVisible(true);
            this.cadastroProduto.dispose();
           
           codigo = 0;
            
             if (codigo != 0){
               Produto produto = new Produto();
               produto = Model.DAO.Persiste.produtoList.get(codigo -1);
               Utilities.Utilities.ativa(false, this.cadastroProduto.getPanelBottom());
               Utilities.Utilities.limpaComponentes(true, this.cadastroProduto.getPanelMid());
               this.cadastroProduto.getIdTF().setText(produto.getId() +"");
               this.cadastroProduto.getDescricaoTF().setText(produto.getDescricao());
               this.cadastroProduto.getCodigodeBarrasTF().setText(produto.getCodigoBarra());
               this.cadastroProduto.getStatusCB().setSelectedItem(produto.getStatus());
               
                 
               this.cadastroProduto.getIdTF().setEnabled(false);
             }
        }
    }

}
