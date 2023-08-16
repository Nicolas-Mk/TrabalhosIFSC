/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Busca;


import Controller.Cadastro.ControllerCadastroCarteirinha;
import static DAO.Persiste.carteirinhaList;
import Model.Carteirinha;
import View.Busca.BuscaCarteirinha;
import View.Cadastro.CadastroCarteirinha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class ControllerBuscaCarteirinha implements ActionListener {

    // Criando um objeto global do tipo da tela que iremos controlar.
    BuscaCarteirinha buscaCarteirinha;
    int contador;

    //Passando a tela que iremos controlar como parametro de invocação.
    public ControllerBuscaCarteirinha(BuscaCarteirinha buscaCarteirinha) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.buscaCarteirinha = buscaCarteirinha;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.buscaCarteirinha.getButtonCancel().addActionListener(this);
        this.buscaCarteirinha.getButtonLoad().addActionListener(this);
        this.buscaCarteirinha.getButtonFilter().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.buscaCarteirinha.getButtonCancel()) {
            buscaCarteirinha.dispose();
        }
         if (e.getSource() == this.buscaCarteirinha.getButtonFilter()) {
            //Criando/Carregando uma instância da classe "singleton" de dados.
            DAO.Persiste.getInstance();
            contador++;
            if(contador == 1){
            //Criando uma objeto do tipo TableModel
            DefaultTableModel tabela = (DefaultTableModel) this.buscaCarteirinha.getTable().getModel();
            for (Carteirinha carteirinhaAtual : carteirinhaList) {
                tabela.addRow(new Object[]{carteirinhaAtual.getId(), carteirinhaAtual.getCliente().getNome(), carteirinhaAtual.getCliente().getMatricula(),
                    carteirinhaAtual.getCliente().getCpf(), carteirinhaAtual.getCliente().getDataNascimento(), carteirinhaAtual.getDataGeracao(), carteirinhaAtual.getDataCancelamento(), carteirinhaAtual.getCodigoBarra(),
                    });
                }
            }
        }
         if (e.getSource() == this.buscaCarteirinha.getButtonLoad()) {
            
            CadastroCarteirinha cadastroCarteirinha = new CadastroCarteirinha();
            ControllerCadastroCarteirinha controllerCadastroCarteirinha = new ControllerCadastroCarteirinha(cadastroCarteirinha);
            
            Utilities.Utilities.ativa(false, cadastroCarteirinha.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, cadastroCarteirinha.getPanelMid());
            cadastroCarteirinha.getIdTF().setEnabled(false);
            
            cadastroCarteirinha.setVisible(true);
            Controller.Cadastro.ControllerCadastroCarteirinha.codigo = (int) this.buscaCarteirinha.getTable().getValueAt
            (this.buscaCarteirinha.getTable().getSelectedRow(), 0);
           
            
            cadastroCarteirinha.getIdTF().setText(this.buscaCarteirinha.getTable().getValueAt(this.buscaCarteirinha.getTable().getSelectedRow(), 0).toString());
            cadastroCarteirinha.getNomeTF().setText(this.buscaCarteirinha.getTable().getValueAt(this.buscaCarteirinha.getTable().getSelectedRow(), 1).toString());
            cadastroCarteirinha.getMatriculaTF().setText(this.buscaCarteirinha.getTable().getValueAt(this.buscaCarteirinha.getTable().getSelectedRow(), 2).toString());
            cadastroCarteirinha.getCpfTF().setText(this.buscaCarteirinha.getTable().getValueAt(this.buscaCarteirinha.getTable().getSelectedRow(), 3).toString());
            cadastroCarteirinha.getDatadeNascimentoTF().setText((String) this.buscaCarteirinha.getTable().getValueAt(this.buscaCarteirinha.getTable().getSelectedRow(), 4));
            cadastroCarteirinha.getDataGeracaoTF().setText((String)(this.buscaCarteirinha.getTable().getValueAt(this.buscaCarteirinha.getTable().getSelectedRow(), 5)));
            cadastroCarteirinha.getDataCancelamentoTF().setText((String)(this.buscaCarteirinha.getTable().getValueAt(this.buscaCarteirinha.getTable().getSelectedRow(), 6)));
            cadastroCarteirinha.getCodigoBarrasTF().setText((String)(this.buscaCarteirinha.getTable().getValueAt(this.buscaCarteirinha.getTable().getSelectedRow(), 7)));
            this.buscaCarteirinha.dispose();
            }
         
    }

}
