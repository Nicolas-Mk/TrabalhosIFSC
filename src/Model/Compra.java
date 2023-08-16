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
public class Compra {
    
    private int id;
    private int numeronf;
    private String dataHoraCompra;
    private float valorDesconto;
    private char flagTipoDesconto;
    private char status;
    private String observacao;

    private Fornecedor fornecedor;

    public Compra() {
    }

    public Compra(int id, int numeronf, String dataHoraCompra, float valorDesconto, char flagTipoDesconto, char status, String observacao, Fornecedor fornecedor) {
        this.id = id;
        this.numeronf = numeronf;
        this.dataHoraCompra = dataHoraCompra;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.status = status;
        this.observacao = observacao;
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public int getNumeronf() {
        return numeronf;
    }

    public String getDataHoraCompra() {
        return dataHoraCompra;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public char getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public char getStatus() {
        return status;
    }

    public String getObservacao() {
        return observacao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeronf(int numeronf) {
        this.numeronf = numeronf;
    }

    public void setDataHoraCompra(String dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setFlagTipoDesconto(char flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return  "Compra \n"+
                this.getId() +", "+
                this.getNumeronf() +", "+
                this.getDataHoraCompra() +", "+
                this.getValorDesconto() +", "+
                this.getFlagTipoDesconto() +", "+
                this.getStatus() +", "+
                this.getObservacao() + "\n" +
                "Fornecedor \n"+
                this.fornecedor.getCnpj() +", "+
                this.fornecedor.getInscricaoEstadual() +", "+
                this.fornecedor.getRazaoSocial();
                
    }
    
    
   
  
    
    
}
