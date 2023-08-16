/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cadastro;

import Controller.Busca.ControllerBuscaBairro;
import static DAO.Persiste.bairroList;
import Model.Bairro;
import View.Busca.BuscaBairro;
import View.Cadastro.CadastroBairro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author aluno
 */
public class ControllerCadastroBairro implements ActionListener {

    // Criando um objeto global do tipo da tela que iremos controlar.
    CadastroBairro cadastroBairro;
    public static int codigo;

    //Passando a tela que iremos controlar como parametro de invocação.
    public ControllerCadastroBairro(CadastroBairro cadastroBairro) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.cadastroBairro = cadastroBairro;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.cadastroBairro.getButtonNew().addActionListener(this);
        this.cadastroBairro.getButtonExit().addActionListener(this);
        this.cadastroBairro.getButtonCancel().addActionListener(this);
        this.cadastroBairro.getButtonGravar().addActionListener(this);
        this.cadastroBairro.getButtonSearch().addActionListener(this);

        Utilities.Utilities.ativa(true, this.cadastroBairro.getPanelBottom());
        Utilities.Utilities.limpaComponentes(false, this.cadastroBairro.getPanelMid());

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.cadastroBairro.getButtonNew()) {
            Utilities.Utilities.ativa(false, this.cadastroBairro.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, this.cadastroBairro.getPanelMid());
            this.cadastroBairro.getIdTF().setEnabled(false);
        } else if (e.getSource() == this.cadastroBairro.getButtonExit()) {
            this.cadastroBairro.dispose();
        } else if (e.getSource() == this.cadastroBairro.getButtonCancel()) {
            Utilities.Utilities.ativa(true, this.cadastroBairro.getPanelBottom());
            Utilities.Utilities.limpaComponentes(false, this.cadastroBairro.getPanelMid());
        } else if (e.getSource() == this.cadastroBairro.getButtonGravar()) {
            
            String id = this.cadastroBairro.getIdTF().getText();
            Bairro bairro = new Bairro();
            bairro.setId((bairroList.size()+1));
            bairro.setDescricao(this.cadastroBairro.getDescricaoTF().getText());
            
                    if(this.cadastroBairro.getIdTF().getText().equalsIgnoreCase("")){
                    DAO.Persiste.bairroList.add(bairro);
                    }else if (bairroList.size() > 0) {
                        
                if (!bairroList.get(Integer.parseInt(id) - 1).getDescricao().equals(this.cadastroBairro.getDescricaoTF())) {
                    bairroList.get(Integer.parseInt(id) - 1).setDescricao(this.cadastroBairro.getDescricaoTF().getText());
                }
                        
                    }

            Utilities.Utilities.ativa(true, this.cadastroBairro.getPanelBottom());
            Utilities.Utilities.limpaComponentes(false, this.cadastroBairro.getPanelMid());
            
        } else if (e.getSource() == this.cadastroBairro.getButtonSearch()) {
          
            
           BuscaBairro buscaBairro = new BuscaBairro();
           ControllerBuscaBairro controllerBuscaBairro = new ControllerBuscaBairro(buscaBairro);  
           buscaBairro.setVisible(true);
           this.cadastroBairro.dispose();
           
           codigo = 0;
            
             if (codigo != 0){
               Bairro bairro = new Bairro();
               bairro = DAO.Persiste.bairroList.get(codigo -1);
               Utilities.Utilities.ativa(false, this.cadastroBairro.getPanelBottom());
               Utilities.Utilities.limpaComponentes(true, this.cadastroBairro.getPanelMid());
               this.cadastroBairro.getIdTF().setText(bairro.getId() +"");
               this.cadastroBairro.getDescricaoTF().setText(bairro.getDescricao());  
               this.cadastroBairro.getIdTF().setEnabled(false);
               
           
                }
           }
           
           
           
           
        }
    }


