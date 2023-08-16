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
public class Venda {
    
    private int id;
    private String dataHoraVenda;
    private float valorDesconto;
    private char flagTipoDesconto;
    private String observacao;
    private char status;
    
    private Funcionario funcionario;
    private Carteirinha carteirinha;

    public Venda() {
    }

    public Venda(int id, String dataHoraVenda, float valorDesconto, char flagTipoDesconto, String observacao, char status, Funcionario funcionario, Carteirinha carteirinha) {
        this.id = id;
        this.dataHoraVenda = dataHoraVenda;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.observacao = observacao;
        this.status = status;
        this.funcionario = funcionario;
        this.carteirinha = carteirinha;
    }

    public int getId() {
        return id;
    }

    public String getDataHoraVenda() {
        return dataHoraVenda;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public char getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public String getObservacao() {
        return observacao;
    }

    public char getStatus() {
        return status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataHoraVenda(String dataHoraVenda) {
        this.dataHoraVenda = dataHoraVenda;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setFlagTipoDesconto(char flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
                return  "Venda \n" +
                this.getId() +", "+ 
                this.getDataHoraVenda() +", "+
                this.getValorDesconto() +", "+
                this.getFlagTipoDesconto() +", "+
                this.getObservacao() +", "+
                this.getStatus() + "\n" +
                "Funcionario \n"+
                this.funcionario.getCpf() +", "+
                this.funcionario.getRg() +", "+
                this.funcionario.getUsuario() +", "+
                this.funcionario.getSenha() + "\n" +
                "Carteirinha \n"+
                this.carteirinha.getCodigoBarra() +", "+
                this.carteirinha.getDataGeracao() +", "+
                this.carteirinha.getDataCancelamento(); 
    }

}
