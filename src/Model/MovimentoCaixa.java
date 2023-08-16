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
public class MovimentoCaixa {
    
    private int id;
    private String dataHoraMovimento;
    private float valorMovimento;
    private String observacao;
    private char flagTipoMovimento;
    private char status;

    private Caixa caixa;

    public MovimentoCaixa() {
    }

    public MovimentoCaixa(int id, String dataHoraMovimento, float valorMovimento, String observacao, char flagTipoMovimento, char status, Caixa caixa) {
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.valorMovimento = valorMovimento;
        this.observacao = observacao;
        this.flagTipoMovimento = flagTipoMovimento;
        this.status = status;
        this.caixa = caixa;
    }

    public int getId() {
        return id;
    }

    public String getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public float getValorMovimento() {
        return valorMovimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public char getFlagTipoMovimento() {
        return flagTipoMovimento;
    }

    public char getStatus() {
        return status;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataHoraMovimento(String dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public void setValorMovimento(float valorMovimento) {
        this.valorMovimento = valorMovimento;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setFlagTipoMovimento(char flagTipoMovimento) {
        this.flagTipoMovimento = flagTipoMovimento;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    @Override
    public String toString() {
        return  "MovimentoCaixa \n" +
                this.getId() + ", " +
                this.getDataHoraMovimento() + ", " +
                this.getValorMovimento() + ", " +
                this.getObservacao() + ", " +
                this.getFlagTipoMovimento() + ", " +
                this.getStatus() + "\n" +
                "Caixa \n" +
                this.caixa.getId() + ", "+
                this.caixa.getDataHoraAbertura() + ", "+
                this.caixa.getDataHoraFechamento() + ", "+
                this.caixa.getValorAbertura() + ", "+
                this.caixa.getValorFechamento() + ", "+
                this.caixa.getObservacao() + ", "+
                this.caixa.getStatus();
    }
    
    
    
}
