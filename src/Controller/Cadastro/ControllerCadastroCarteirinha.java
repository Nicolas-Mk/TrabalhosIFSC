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
import Service.CarteirinhaService;
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
            this.cadastroCarteirinha.getMatriculaTF().setEnabled(false);
        } else if (e.getSource() == this.cadastroCarteirinha.getButtonExit()) {
            this.cadastroCarteirinha.dispose();
        } else if (e.getSource() == this.cadastroCarteirinha.getButtonCancel()) {
            Utilities.Utilities.ativa(true, this.cadastroCarteirinha.getPanelBottom());
            Utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinha.getPanelMid());
        } else if (e.getSource() == this.cadastroCarteirinha.getButtonGravar()) { //BD IMPLEMENTADO
            Utilities.Utilities.ativa(true, this.cadastroCarteirinha.getPanelBottom());
            
            Cliente cliente = new Cliente();
            Carteirinha carteirinha = new Carteirinha();
            carteirinha.setCliente(cliente);
            carteirinha.getCliente().setNome(this.cadastroCarteirinha.getNomeTF().getText());
            carteirinha.getCliente().setCpf(this.cadastroCarteirinha.getCpfTF().getText());
            carteirinha.getCliente().setDataNascimento(this.cadastroCarteirinha.getDatadeNascimentoTF().getText());
            carteirinha.setDataGeracao(this.cadastroCarteirinha.getDataGeracaoTF().getText());
            carteirinha.setDataCancelamento(this.cadastroCarteirinha.getDataCancelamentoTF().getText());
            carteirinha.getCliente().setMatricula(this.cadastroCarteirinha.getMatriculaTF().getText());
            carteirinha.setCodigoBarra(this.cadastroCarteirinha.getCodigoBarrasTF().getText());
            
                    if(this.cadastroCarteirinha.getIdTF().getText().equalsIgnoreCase("")){
                    CarteirinhaService.create(carteirinha);
                    }else{
                    carteirinha.setId(Integer.parseInt(this.cadastroCarteirinha.getIdTF().getText()));
                    CarteirinhaService.update(carteirinha);
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
