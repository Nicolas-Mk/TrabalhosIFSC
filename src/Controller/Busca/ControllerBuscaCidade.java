/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Busca;


import static DAO.Persiste.cidadeList;
import Model.Cidade;
import View.Busca.BuscaCidade;
import View.Cadastro.CadastroCidade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class ControllerBuscaCidade implements ActionListener {

    // Criando um objeto global do tipo da tela que iremos controlar.
    BuscaCidade buscaCidade;
    int contador;

    //Passando a tela que iremos controlar como parametro de invocação.
    public ControllerBuscaCidade(BuscaCidade buscaCidade) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.buscaCidade = buscaCidade;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.buscaCidade.getButtonCancel().addActionListener(this);
        this.buscaCidade.getButtonLoad().addActionListener(this);
        this.buscaCidade.getButtonFilter().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.buscaCidade.getButtonCancel()) {
            buscaCidade.dispose();
        }
        if (e.getSource() == this.buscaCidade.getButtonFilter()) {
            //Criando/Carregando uma instância da classe "singleton" de dados.
            DAO.Persiste.getInstance();
            contador++;
            if(contador == 1){
            //Criando uma objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.buscaCidade.getTable().getModel();
            for (Cidade cidadeAtual : cidadeList) {
                tabela.addRow(new Object[]{cidadeAtual.getId(), cidadeAtual.getDescricao(), cidadeAtual.getUf()});
                }
            }
    }

        if (e.getSource() == this.buscaCidade.getButtonLoad()) {
            
            CadastroCidade cadastroCidade = new CadastroCidade();
            Controller.Cadastro.ControllerCadastroCidade controllerCadastroCidade = new Controller.Cadastro.ControllerCadastroCidade(cadastroCidade);
            
            Utilities.Utilities.ativa(false, cadastroCidade.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, cadastroCidade.getPanelMid());
            cadastroCidade.getIdTF().setEnabled(false);
            
            cadastroCidade.setVisible(true);
            Controller.Cadastro.ControllerCadastroCidade.codigo = (int) this.buscaCidade.getTable().getValueAt
            (this.buscaCidade.getTable().getSelectedRow(), 0);
           
            
            cadastroCidade.getIdTF().setText(this.buscaCidade.getTable().getValueAt(this.buscaCidade.getTable().getSelectedRow(), 0).toString());
            cadastroCidade.getDescricaoTF().setText(this.buscaCidade.getTable().getValueAt(this.buscaCidade.getTable().getSelectedRow(), 1).toString());
            cadastroCidade.getUfTF().setText(this.buscaCidade.getTable().getValueAt(this.buscaCidade.getTable().getSelectedRow(), 2).toString());
            this.buscaCidade.dispose();
            }
}
    
}
