package Controller.Busca;


import Controller.Cadastro.ControllerCadastroEndereco;
import static Model.DAO.Persiste.cidadeList;
import Model.Cidade;
import Service.CidadeService;
import View.Busca.BuscaBairro;
import View.Busca.BuscaCidade;
import View.Cadastro.CadastroCidade;
import View.Cadastro.CadastroEndereco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicolas Kuffner
 */
public class ControllerBuscaCidade implements ActionListener {

   // Criando um objeto global do tipo da tela que será controlada. 
    BuscaCidade buscaCidade;
    int contador;

    //Passando a tela que será controlada como parametro de invocação.
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
            
           if (this.buscaCidade.getSearchTF().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atenção!\n Filtro vazio!");
                this.buscaCidade.getSearchTF().requestFocus();
            }else{
                List<Cidade> CidadeList = new ArrayList<Cidade>();
                
                if (this.buscaCidade.getEscolhaCB().getSelectedIndex() == 0){
                    CidadeList.add(CidadeService.retrieve(Integer.parseInt(this.buscaCidade.getSearchTF().getText())));
                }else if (this.buscaCidade.getEscolhaCB().getSelectedIndex() == 1){
                    CidadeList = (CidadeService.retrieve(this.buscaCidade.getSearchTF().getText().trim()));
                }else if (this.buscaCidade.getEscolhaCB().getSelectedIndex() == 2){
                    CidadeList = (CidadeService.retrieve(this.buscaCidade.getSearchTF().getText().trim()));
                }
                
                DefaultTableModel tabelaDados = (DefaultTableModel) buscaCidade.getTable().getModel();
                tabelaDados.setRowCount(0);
                for (Cidade CidadeAtual : CidadeList) {
                    tabelaDados.addRow(new Object[]{CidadeAtual.getId(), CidadeAtual.getUf(), CidadeAtual.getDescricao()});
                }
           }
            
    }

        if (e.getSource() == this.buscaCidade.getButtonLoad()) {
            
            CadastroEndereco cadastroEndereco = new CadastroEndereco();
            ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
            
            CadastroCidade cadastroCidade = new CadastroCidade();
            Controller.Cadastro.ControllerCadastroCidade controllerCadastroCidade = new Controller.Cadastro.ControllerCadastroCidade(cadastroCidade);

            if(ControllerCadastroEndereco.puxaCidadeEndereco == true){
            Utilities.Utilities.ativa(false, cadastroEndereco.getPanelBottom());
            
            
            //DESABILITAR E HABILITAR BOTÕES MANUALMENTE
            cadastroEndereco.getIdTF().setEnabled(false);
            cadastroEndereco.getBairroTF().setEnabled(false);
            cadastroEndereco.getCidadeTF().setEnabled(false);
            cadastroEndereco.getCepTF().setEnabled(true);
            cadastroEndereco.getStatusCB().setEnabled(true);
            cadastroEndereco.getButtonBairro().setEnabled(true);
            cadastroEndereco.getButtonCidade().setEnabled(true);
            cadastroEndereco.getLogradouroTF().setEnabled(true);
            //SETA O VALOR DA CIDADE PARA O ITEM SELECIONADO
            cadastroEndereco.getCidadeTF().setText((String) this.buscaCidade.getTable().getValueAt(this.buscaCidade.getTable().getSelectedRow(),2));
            this.buscaCidade.dispose();
            
            cadastroEndereco.setVisible(true);
                ControllerCadastroEndereco.reset = false;
            }else{
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
    
    }


