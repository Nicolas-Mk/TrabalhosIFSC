/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cadastro;

import Controller.Busca.ControllerBuscaCidade;
import Model.Cidade;
import Service.CidadeService;
import View.Busca.BuscaCidade;
import View.Cadastro.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ControllerCadastroCidade implements ActionListener {

    // Criando um objeto global do tipo da tela que será controlada.
    CadastroCidade cadastroCidade;
    public static int codigo;

    //Passando a tela que será controlada como parametro de invocação.
    public ControllerCadastroCidade(CadastroCidade cadastroCidade) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.cadastroCidade = cadastroCidade;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.cadastroCidade.getButtonNew().addActionListener(this);
        this.cadastroCidade.getButtonExit().addActionListener(this);
        this.cadastroCidade.getButtonCancel().addActionListener(this);
        this.cadastroCidade.getButtonGravar().addActionListener(this);
        this.cadastroCidade.getButtonSearch().addActionListener(this);

        Utilities.Utilities.ativa(true, this.cadastroCidade.getPanelBottom());
        Utilities.Utilities.limpaComponentes(false, this.cadastroCidade.getPanelMid());

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.cadastroCidade.getButtonNew()) {
            Utilities.Utilities.ativa(false, this.cadastroCidade.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, this.cadastroCidade.getPanelMid());

        } else if (e.getSource() == this.cadastroCidade.getButtonExit()) {
            this.cadastroCidade.dispose();

        } else if (e.getSource() == this.cadastroCidade.getButtonCancel()) {
            Utilities.Utilities.ativa(true, this.cadastroCidade.getPanelBottom());
            Utilities.Utilities.limpaComponentes(false, this.cadastroCidade.getPanelMid());
        } else if (e.getSource() == this.cadastroCidade.getButtonGravar()) {

            Cidade cidade = new Cidade();
            cidade.setDescricao(this.cadastroCidade.getDescricaoTF().getText());
            cidade.setUf(this.cadastroCidade.getUfTF().getText());

            if (this.cadastroCidade.getIdTF().getText().equalsIgnoreCase("")) {
                CidadeService.create(cidade);

            } else {
                cidade.setId(Integer.parseInt(this.cadastroCidade.getIdTF().getText()));
                CidadeService.update(cidade);
            }

            Utilities.Utilities.ativa(true, this.cadastroCidade.getPanelBottom());
            Utilities.Utilities.limpaComponentes(false, this.cadastroCidade.getPanelMid());

        } else if (e.getSource() == this.cadastroCidade.getButtonSearch()) {
            BuscaCidade buscaCidade = new BuscaCidade();
            ControllerBuscaCidade controllerBuscaCidade = new ControllerBuscaCidade(buscaCidade);
            buscaCidade.setVisible(true);
            this.cadastroCidade.dispose();

            codigo = 0;

            if (codigo != 0) {
                Cidade cidade = new Cidade();
                cidade = CidadeService.retrieve(codigo);
                Utilities.Utilities.ativa(false, this.cadastroCidade.getPanelBottom());
                Utilities.Utilities.limpaComponentes(true, this.cadastroCidade.getPanelMid());
                this.cadastroCidade.getIdTF().setText(cidade.getId() + "");
                this.cadastroCidade.getDescricaoTF().setText(cidade.getDescricao());
                this.cadastroCidade.getUfTF().setText(cidade.getUf());
                this.cadastroCidade.getIdTF().setEnabled(false);
            }
        }

    }

}
