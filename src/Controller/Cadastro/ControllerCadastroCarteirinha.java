/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Cadastro;

import Controller.Busca.ControllerBuscaCarteirinha;
import Controller.Busca.ControllerBuscaCliente;
import static Controller.Cadastro.ControllerCadastroCarteirinha.codigo;
import static Model.DAO.Persiste.carteirinhaList;
import Model.Carteirinha;
import Model.Cliente;
import View.Cadastro.CadastroCarteirinha;
import View.Busca.BuscaCarteirinha;
import View.Busca.BuscaCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aluno
 */
public class ControllerCadastroCarteirinha implements ActionListener {

    // Criando um objeto global do tipo da tela que será controlada.
    CadastroCarteirinha cadastroCarteirinha;
        public static int codigo;
        public static boolean telaResultado = false;

    //Passando a tela que será controlada como parametro de invocação.
    public ControllerCadastroCarteirinha(CadastroCarteirinha cadastroCarteirinha) {
        //Repassando o valor(tela) do parâmtro para o objeto global.
        this.cadastroCarteirinha = cadastroCarteirinha;
        //Adicionando "Listeners" para escutar cada uma das ações relacionadas aos botões.
        this.cadastroCarteirinha.getButtonNew().addActionListener(this);
        this.cadastroCarteirinha.getButtonExit().addActionListener(this);
        this.cadastroCarteirinha.getButtonCancel().addActionListener(this);
        this.cadastroCarteirinha.getButtonGravar().addActionListener(this);
        this.cadastroCarteirinha.getButtonSearch().addActionListener(this);
        this.cadastroCarteirinha.getButtonCliente().addActionListener(this);

        Utilities.Utilities.ativa(true, this.cadastroCarteirinha.getPanelBottom());
        Utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinha.getPanelMid());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.cadastroCarteirinha.getButtonNew()) {
            Utilities.Utilities.ativa(false, this.cadastroCarteirinha.getPanelBottom());
            Utilities.Utilities.limpaComponentes(true, this.cadastroCarteirinha.getPanelMid());
            this.cadastroCarteirinha.getIdTF().setEnabled(false);
            this.cadastroCarteirinha.getNomeTF().setEnabled(false);
            this.cadastroCarteirinha.getDatadeNascimentoTF().setEnabled(false);
            this.cadastroCarteirinha.getCpfTF().setEnabled(false);
            cadastroCarteirinha.getMatriculaTF().setEnabled(false);
        } else if (e.getSource() == this.cadastroCarteirinha.getButtonExit()) {
            this.cadastroCarteirinha.dispose();
        } else if (e.getSource() == this.cadastroCarteirinha.getButtonCancel()) {
            Utilities.Utilities.ativa(true, this.cadastroCarteirinha.getPanelBottom());
            Utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinha.getPanelMid());
        } else if (e.getSource() == this.cadastroCarteirinha.getButtonGravar()) {
            Utilities.Utilities.ativa(true, this.cadastroCarteirinha.getPanelBottom());
            
            String id = this.cadastroCarteirinha.getIdTF().getText();
            Carteirinha carteirinha = new Carteirinha();
            Cliente cliente = new Cliente();
            carteirinha.setCliente(cliente);
            
            carteirinha.setId((carteirinhaList.size()+1));
            carteirinha.getCliente().setNome(this.cadastroCarteirinha.getNomeTF().getText());
            carteirinha.getCliente().setCpf(this.cadastroCarteirinha.getCpfTF().getText());
            carteirinha.getCliente().setDataNascimento(this.cadastroCarteirinha.getDatadeNascimentoTF().getText());
            carteirinha.setDataGeracao(this.cadastroCarteirinha.getDataGeracaoTF().getText());
            carteirinha.setDataCancelamento(this.cadastroCarteirinha.getDataCancelamentoTF().getText());
            carteirinha.getCliente().setMatricula(this.cadastroCarteirinha.getMatriculaTF().getText());
            carteirinha.setCodigoBarra(this.cadastroCarteirinha.getCodigoBarrasTF().getText());
            
            
             if(this.cadastroCarteirinha.getIdTF().getText().equalsIgnoreCase("")){
                    Model.DAO.Persiste.carteirinhaList.add(carteirinha);
                    }else if (carteirinhaList.size() > 0) {
                        
                if (!carteirinhaList.get(Integer.parseInt(id) - 1).getCliente().getNome().equals(this.cadastroCarteirinha.getNomeTF())) {
                    carteirinhaList.get(Integer.parseInt(id) - 1).getCliente().setNome(this.cadastroCarteirinha.getNomeTF().getText());
                }
                if (!carteirinhaList.get(Integer.parseInt(id) - 1).getCliente().getCpf().equals(this.cadastroCarteirinha.getCpfTF())) {
                    carteirinhaList.get(Integer.parseInt(id) - 1).getCliente().setCpf(this.cadastroCarteirinha.getCpfTF().getText());
                }
                if (!carteirinhaList.get(Integer.parseInt(id) - 1).getCliente().getDataNascimento().equals(this.cadastroCarteirinha.getDatadeNascimentoTF())) {
                    carteirinhaList.get(Integer.parseInt(id) - 1).getCliente().setDataNascimento(this.cadastroCarteirinha.getDatadeNascimentoTF().getText());
                }
                if (!carteirinhaList.get(Integer.parseInt(id) - 1).getDataGeracao().equals(this.cadastroCarteirinha.getDataGeracaoTF())) {
                    carteirinhaList.get(Integer.parseInt(id) - 1).setDataGeracao(this.cadastroCarteirinha.getDataGeracaoTF().getText());
                }
                if (!carteirinhaList.get(Integer.parseInt(id) - 1).getDataCancelamento().equals(this.cadastroCarteirinha.getDataCancelamentoTF())) {
                    carteirinhaList.get(Integer.parseInt(id) - 1).setDataCancelamento(this.cadastroCarteirinha.getDataCancelamentoTF().getText());
                    
                if (!carteirinhaList.get(Integer.parseInt(id) - 1).getCliente().getMatricula().equals(this.cadastroCarteirinha.getMatriculaTF())) {
                    carteirinhaList.get(Integer.parseInt(id) - 1).getCliente().setMatricula(this.cadastroCarteirinha.getMatriculaTF().getText());
                }
                if (!carteirinhaList.get(Integer.parseInt(id) - 1).getCodigoBarra().equals(this.cadastroCarteirinha.getCodigoBarrasTF())) {
                    carteirinhaList.get(Integer.parseInt(id) - 1).setCodigoBarra(this.cadastroCarteirinha.getCodigoBarrasTF().getText());
                }
                
                }
                
                
                        
                    }
            
            Utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinha.getPanelMid());
        } else if (e.getSource() == this.cadastroCarteirinha.getButtonSearch()) {
            BuscaCarteirinha buscaCarteirinha = new BuscaCarteirinha();
            ControllerBuscaCarteirinha controllerBuscaCarteirinha = new ControllerBuscaCarteirinha(buscaCarteirinha);
            buscaCarteirinha.setVisible(true);
            this.cadastroCarteirinha.dispose();
           
           codigo = 0;
            
             if (codigo != 0){
               Carteirinha carteirinha = new Carteirinha();
               carteirinha = Model.DAO.Persiste.carteirinhaList.get(codigo -1);
               Utilities.Utilities.ativa(false, this.cadastroCarteirinha.getPanelBottom());
               Utilities.Utilities.limpaComponentes(true, this.cadastroCarteirinha.getPanelMid());
               this.cadastroCarteirinha.getIdTF().setText(carteirinha.getId() +"");
               this.cadastroCarteirinha.getNomeTF().setText(carteirinha.getCliente().getNome());
               this.cadastroCarteirinha.getCpfTF().setText(carteirinha.getCliente().getCpf());
               this.cadastroCarteirinha.getDatadeNascimentoTF().setText(carteirinha.getCliente().getDataNascimento());
               this.cadastroCarteirinha.getDataGeracaoTF().setText(carteirinha.getDataGeracao());
               this.cadastroCarteirinha.getDataCancelamentoTF().setText(carteirinha.getDataCancelamento());
               this.cadastroCarteirinha.getMatriculaTF().setText(carteirinha.getCliente().getMatricula());
               this.cadastroCarteirinha.getCodigoBarrasTF().setText(carteirinha.getCodigoBarra());
               this.cadastroCarteirinha.getIdTF().setEnabled(false);
               
               
           
                }
        }
         else if (e.getSource() == this.cadastroCarteirinha.getButtonCliente()) {
             BuscaCliente buscaCliente = new BuscaCliente();
             ControllerBuscaCliente controllerBuscaCliente = new ControllerBuscaCliente(buscaCliente);
             telaResultado = true;
             buscaCliente.setVisible(true);
             this.cadastroCarteirinha.dispose();

        }
    }

}
