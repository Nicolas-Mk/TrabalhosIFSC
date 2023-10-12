package Controller.Busca;


import static Model.DAO.Persiste.produtoList;
import Model.Produto;
import Service.ProdutoService;
import View.Busca.BuscaProduto;
import View.Cadastro.CadastroProduto;
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
public class ControllerBuscaProduto implements ActionListener {

    // Criando um objeto global do tipo da tela que será controlada. 
    BuscaProduto buscaProduto;
    int contador;

    //Passando a tela que será controlada como parametro de invocação.
    public ControllerBuscaProduto(BuscaProduto buscaProduto) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.buscaProduto = buscaProduto;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.buscaProduto.getButtonCancel().addActionListener(this);
        this.buscaProduto.getButtonLoad().addActionListener(this);
        this.buscaProduto.getButtonFilter().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.buscaProduto.getButtonCancel()) {
            buscaProduto.dispose();
        }if (e.getSource() == this.buscaProduto.getButtonFilter()) {
            
           if (this.buscaProduto.getSearchTF().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atenção!\n Filtro vazio!");
                this.buscaProduto.getSearchTF().requestFocus();
            }else{
                List<Produto> produtoList = new ArrayList<Produto>();
                
                if (this.buscaProduto.getEscolhaCB().getSelectedIndex() == 0){
                    produtoList.add(ProdutoService.retrieve(Integer.parseInt(this.buscaProduto.getSearchTF().getText())));
                }else if (this.buscaProduto.getEscolhaCB().getSelectedIndex() == 1){
                    produtoList = (ProdutoService.retrieve(this.buscaProduto.getSearchTF().getText().trim()));
                }else if (this.buscaProduto.getEscolhaCB().getSelectedIndex() == 2){
                    produtoList = (ProdutoService.retrieve(this.buscaProduto.getSearchTF().getText().trim()));
                }else if (this.buscaProduto.getEscolhaCB().getSelectedIndex() == 3){
                    produtoList = (ProdutoService.retrieve(this.buscaProduto.getSearchTF().getText().trim()));
                }

                DefaultTableModel tabelaDados = (DefaultTableModel) buscaProduto.getTable().getModel();
                tabelaDados.setRowCount(0);
                for (Produto produtoAtual : produtoList) {
                    tabelaDados.addRow(new Object[]{produtoAtual.getId(), produtoAtual.getDescricao(), produtoAtual.getCodigoBarra(), produtoAtual.getStatus() });
                }
            }
        }if (e.getSource() == this.buscaProduto.getButtonLoad()) {
            
            CadastroProduto cadastroProduto = new CadastroProduto();
            Controller.Cadastro.ControllerCadastroProduto controllerCadastroProduto = new Controller.Cadastro.ControllerCadastroProduto(cadastroProduto);
            
            Utilities.Utilities.ativa(false, cadastroProduto.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, cadastroProduto.getPanelMid());
            cadastroProduto.getIdTF().setEnabled(false);
            
            cadastroProduto.setVisible(true);
            Controller.Cadastro.ControllerCadastroProduto.codigo = (int) this.buscaProduto.getTable().getValueAt(this.buscaProduto.getTable().getSelectedRow(), 0);
           
            
            cadastroProduto.getIdTF().setText(this.buscaProduto.getTable().getValueAt(this.buscaProduto.getTable().getSelectedRow(), 0).toString());
            cadastroProduto.getDescricaoTF().setText(this.buscaProduto.getTable().getValueAt(this.buscaProduto.getTable().getSelectedRow(), 1).toString());
            cadastroProduto.getCodigodeBarrasTF().setText(this.buscaProduto.getTable().getValueAt(this.buscaProduto.getTable().getSelectedRow(), 2).toString());
            cadastroProduto.getStatusCB().setSelectedItem(this.buscaProduto.getTable().getValueAt(this.buscaProduto.getTable().getSelectedRow(), 3).toString());
            
            this.buscaProduto.dispose();
            }
    }

 }

    

