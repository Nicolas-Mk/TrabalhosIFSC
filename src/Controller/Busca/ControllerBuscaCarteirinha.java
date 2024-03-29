package Controller.Busca;


import static Controller.Busca.ControllerBuscaBairro.filtroGlobal;
import Controller.Cadastro.ControllerCadastroCarteirinha;
import static Model.DAO.Persiste.carteirinhaList;
import Model.Carteirinha;
import Service.CarteirinhaService;
import View.Busca.BuscaCarteirinha;
import View.Cadastro.CadastroCarteirinha;
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
public class ControllerBuscaCarteirinha implements ActionListener {

    // Criando um objeto global do tipo da tela que será controlada. 
    BuscaCarteirinha buscaCarteirinha;
    int contador;

    //Passando a tela que será controlada como parametro de invocação.
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
             if (this.buscaCarteirinha.getSearchTF().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atenção!\n Filtro vazio!");
                this.buscaCarteirinha.getSearchTF().requestFocus();
            }else{
                List<Carteirinha> carteirinhaList = new ArrayList<>();
                
                if (this.buscaCarteirinha.getEscolhaCB().getSelectedIndex() == 0){
                    carteirinhaList.add(CarteirinhaService.retrieve(Integer.parseInt(this.buscaCarteirinha.getSearchTF().getText())));
                }else {
                    carteirinhaList = (CarteirinhaService.retrieve(this.buscaCarteirinha.getSearchTF().getText().trim()));
                    filtroGlobal = (this.buscaCarteirinha.getEscolhaCB().getSelectedItem().toString());
                }

                DefaultTableModel tabelaDados = (DefaultTableModel) buscaCarteirinha.getTable().getModel();
                tabelaDados.setRowCount(0);
                for (Carteirinha carteirinhaAtual : carteirinhaList) {
                    tabelaDados.addRow(new Object[]{carteirinhaAtual.getId(),
                        carteirinhaAtual.getCliente().getNome(),
                        carteirinhaAtual.getCliente().getMatricula(),
                        carteirinhaAtual.getCliente().getCpf(),
                        carteirinhaAtual.getCliente().getDataNascimento(),
                        carteirinhaAtual.getDataGeracao(),
                        carteirinhaAtual.getDataCancelamento(),
                        carteirinhaAtual.getCodigoBarra()
                            });
                }
             }
             
        }if (e.getSource() == this.buscaCarteirinha.getButtonLoad()) {
            
            CadastroCarteirinha cadastroCarteirinha = new CadastroCarteirinha();
            ControllerCadastroCarteirinha controllerCadastroCarteirinha = new ControllerCadastroCarteirinha(cadastroCarteirinha);
            
            Utilities.Utilities.ativa(false, cadastroCarteirinha.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, cadastroCarteirinha.getPanelMid());
            cadastroCarteirinha.getIdTF().setEnabled(false);
            cadastroCarteirinha.getNomeTF().setEnabled(false);
            cadastroCarteirinha.getDatadeNascimentoTF().setEnabled(false);
            cadastroCarteirinha.getCpfTF().setEnabled(false);
            cadastroCarteirinha.getMatriculaTF().setEnabled(false);
            
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
    

         
          
            
    


    

    

