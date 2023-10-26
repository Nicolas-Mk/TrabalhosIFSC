package Controller.Busca;

import Controller.Cadastro.ControllerCadastroBairro;
import Controller.Cadastro.ControllerCadastroEndereco;
import Service.BairroService;
import Model.Bairro;
import View.Busca.BuscaBairro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import View.Cadastro.CadastroBairro;
import View.Cadastro.CadastroEndereco;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas Kuffner
 */
public class ControllerBuscaBairro implements ActionListener {

    // Criando um objeto global do tipo da tela que será controlada. 
    BuscaBairro buscaBairro;
    int contador;

    //Passando a tela que será controlada como parametro de invocação.
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
        else if (e.getSource() == this.buscaBairro.getButtonFilter()) {
            
            if (this.buscaBairro.getSearchTF().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atenção!\n Filtro vazio!");
                this.buscaBairro.getSearchTF().requestFocus();
            }else{
                List<Bairro> bairroList = new ArrayList<Bairro>();
                
                if (this.buscaBairro.getEscolhaCB().getSelectedIndex() == 0){
                    bairroList.add(BairroService.retrieve(Integer.parseInt(this.buscaBairro.getSearchTF().getText())));
                }else if (this.buscaBairro.getEscolhaCB().getSelectedIndex() == 1){
                    bairroList = (BairroService.retrieve(this.buscaBairro.getSearchTF().getText().trim()));
                }
                
                DefaultTableModel tabelaDados = (DefaultTableModel) buscaBairro.getTable().getModel();
                tabelaDados.setRowCount(0);
                for (Bairro bairroAtual : bairroList) {
                    tabelaDados.addRow(new Object[]{bairroAtual.getId(), bairroAtual.getDescricao()});
                }
            }

                
                
            

        }else if (e.getSource() == this.buscaBairro.getButtonLoad()) {

            CadastroEndereco cadastroEndereco = new CadastroEndereco();
            ControllerCadastroEndereco controllerCadastroEndereco = new ControllerCadastroEndereco(cadastroEndereco);
            
            CadastroBairro cadastroBairro = new CadastroBairro();
            ControllerCadastroBairro controllerCadastroBairro = new ControllerCadastroBairro(cadastroBairro);
            
            if(ControllerCadastroEndereco.puxaBairroEndereco == true){
            Utilities.Utilities.ativa(false, cadastroEndereco.getPanelBottom());
           
            
            //DESABILITAR BOTÕES NOVAMENTE
            cadastroEndereco.getIdTF().setEnabled(false);
            cadastroEndereco.getBairroTF().setEnabled(false);
            cadastroEndereco.getCidadeTF().setEnabled(false);
            cadastroEndereco.getCepTF().setEnabled(true);
            cadastroEndereco.getStatusCB().setEnabled(true);
            cadastroEndereco.getButtonBairro().setEnabled(true);
            cadastroEndereco.getButtonCidade().setEnabled(true);
            cadastroEndereco.getLogradouroTF().setEnabled(true);
            //SETA O VALOR DA Bairro PARA O ITEM SELECIONADO
            cadastroEndereco.getBairroTF().setText((String) this.buscaBairro.getTable().getValueAt(this.buscaBairro.getTable().getSelectedRow(),1));
            ControllerCadastroEndereco.guardaBairro = (String) this.buscaBairro.getTable().getValueAt(this.buscaBairro.getTable().getSelectedRow(),1);
            this.buscaBairro.dispose();
            ControllerCadastroEndereco.reset = false;
            
            cadastroEndereco.setVisible(true);
            }else{
            

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
    }

