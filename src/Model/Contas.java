/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Contas {
    
    private int id;
    private String dataHoraEmissao;
    private String dataVencimento;
    private String dataQuitacao;
    private float valorEmitido;
    private float valorDesconto;
    private float valorAcrescimo;
    private float valorQuitado;
    private String observacao;
    private char flagTipoConta;
    private char status;
    
    private Venda venda;
    private MovimentoCaixa movimentoCaixa;
    private Compra compra;

    public Contas() {
    }

    public Contas(int id, String dataHoraEmissao, String dataVencimento, String dataQuitacao, float valorEmitido, float valorDesconto, float valorAcrescimo, float valorQuitado, String observacao, char flagTipoConta, char status, Venda venda, MovimentoCaixa movimentoCaixa, Compra compra) {
        this.id = id;
        this.dataHoraEmissao = dataHoraEmissao;
        this.dataVencimento = dataVencimento;
        this.dataQuitacao = dataQuitacao;
        this.valorEmitido = valorEmitido;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.valorQuitado = valorQuitado;
        this.observacao = observacao;
        this.flagTipoConta = flagTipoConta;
        this.status = status;
        this.venda = venda;
        this.movimentoCaixa = movimentoCaixa;
        this.compra = compra;
    }

    public int getId() {
        return id;
    }

    public String getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public String getDataQuitacao() {
        return dataQuitacao;
    }

    public float getValorEmitido() {
        return valorEmitido;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public float getValorQuitado() {
        return valorQuitado;
    }

    public String getObservacao() {
        return observacao;
    }

    public char getFlagTipoConta() {
        return flagTipoConta;
    }

    public char getStatus() {
        return status;
    }

    public Venda getVenda() {
        return venda;
    }

    public MovimentoCaixa getMovimentoCaixa() {
        return movimentoCaixa;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataHoraEmissao(String dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setDataQuitacao(String dataQuitacao) {
        this.dataQuitacao = dataQuitacao;
    }

    public void setValorEmitido(float valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public void setValorQuitado(float valorQuitado) {
        this.valorQuitado = valorQuitado;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setFlagTipoConta(char flagTipoConta) {
        this.flagTipoConta = flagTipoConta;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public void setMovimentoCaixa(MovimentoCaixa movimentoCaixa) {
        this.movimentoCaixa = movimentoCaixa;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return "Contas \n" +
                this.getId() +", "+
                this.getDataHoraEmissao() +", "+
                this.getDataHoraEmissao() +", "+
                this.getDataVencimento() +", "+
                this.getDataQuitacao() +", "+
                this.getValorEmitido() +", "+
                this.getValorDesconto() +", "+
                this.getValorAcrescimo() +", "+
                this.getValorQuitado() +", "+
                this.getObservacao() +", "+
                this.getFlagTipoConta() +", "+
                this.getStatus() + "\n" +
               "Venda \n" +
                this.venda.getId() +", "+ 
                this.venda.getDataHoraVenda() +", "+
                this.venda.getValorDesconto() +", "+
                this.venda.getFlagTipoDesconto() +", "+
                this.venda.getObservacao() +", "+
                this.venda.getStatus() + "\n" +
               "Compra \n" +
                this.compra.getId() +", "+
                this.compra.getNumeronf() +", "+
                this.compra.getDataHoraCompra() +", "+
                this.compra.getValorDesconto() +", "+
                this.compra.getFlagTipoDesconto() +", "+
                this.compra.getStatus() +", "+
                this.compra.getObservacao() +", "+
               "MovimentoCaixa" +
                this.movimentoCaixa.getId() + ", " +
                this.movimentoCaixa.getDataHoraMovimento() + ", " +
                this.movimentoCaixa.getValorMovimento() + ", " +
                this.movimentoCaixa.getObservacao() + ", " +
                this.movimentoCaixa.getFlagTipoMovimento() + ", " +
                this.movimentoCaixa.getStatus();
    }
    
    
}
