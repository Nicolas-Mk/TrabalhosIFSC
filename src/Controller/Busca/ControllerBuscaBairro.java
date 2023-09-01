/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Busca;

import Controller.Cadastro.ControllerCadastroBairro;
import Service.BairroService;
import Model.Bairro;
import static Model.DAO.Persiste.bairroList;
import View.Busca.BuscaBairro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import View.Cadastro.CadastroBairro;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author aluno
 */
public class ControllerBuscaBairro implements ActionListener {

    // Criando um objeto global do tipo da tela que iremos controlar.
    BuscaBairro buscaBairro;
    int contador;
    private JTable tabela;

    //Passando a tela que iremos controlar como parametro de invocação.
    public ControllerBuscaBairro(BuscaBairro buscaBairro) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.buscaBairro = buscaBairro;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.buscaBairro.getButtonCancel().addActionListener(this);
        this.buscaBairro.getButtonLoad().addActionListener(this);
        this.buscaBairro.getButtonFilter().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.buscaBairro.getButtonCancel()) {
            buscaBairro.dispose();
        }
        if (e.getSource() == this.buscaBairro.getButtonFilter()) {
            contador++;
            if (contador == 1) {
                List<Bairro> bairroList = new ArrayList<Bairro>();
                bairroList = BairroService.retrive();

                DefaultTableModel tabelaDados = (DefaultTableModel) buscaBairro.getTable().getModel();
                for (Bairro bairroAtual : bairroList) {
                    tabelaDados.addRow(new Object[]{bairroAtual.getId(), bairroAtual.getDescricao()});
                }
            }

        }
        if (e.getSource() == this.buscaBairro.getButtonLoad()) {

            CadastroBairro cadastroBairro = new CadastroBairro();
            ControllerCadastroBairro controllerCadastroBairro = new ControllerCadastroBairro(cadastroBairro);

            Utilities.Utilities.ativa(false, cadastroBairro.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, cadastroBairro.getPanelMid());
            cadastroBairro.getIdTF().setEnabled(false);

            cadastroBairro.setVisible(true);
            Controller.Cadastro.ControllerCadastroBairro.codigo = (int) this.buscaBairro.getTable().getValueAt(this.buscaBairro.getTable().getSelectedRow(), 0);

            cadastroBairro.getIdTF().setText(this.buscaBairro.getTable().getValueAt(this.buscaBairro.getTable().getSelectedRow(), 0).toString());
            cadastroBairro.getDescricaoTF().setText(this.buscaBairro.getTable().getValueAt(this.buscaBairro.getTable().getSelectedRow(), 1).toString());
            this.buscaBairro.dispose();
        }

    }
}
