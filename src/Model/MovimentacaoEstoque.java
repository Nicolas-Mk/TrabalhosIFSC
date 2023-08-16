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
public class MovimentacaoEstoque {
    
    private int id;
    private String dataHoraMovimento;
    private char flagTipoMovimento;
    private float quantidadeMovimentada;
    private String observacaoMovimento;
    private char status;
    
    private Funcionario funcionario;
    private Produto produto;

    public MovimentacaoEstoque() {
    }

    public MovimentacaoEstoque(int id, String dataHoraMovimento, char flagTipoMovimento, float quantidadeMovimentada, String observacaoMovimento, char status, Funcionario funcionario, Produto produto) {
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.flagTipoMovimento = flagTipoMovimento;
        this.quantidadeMovimentada = quantidadeMovimentada;
        this.observacaoMovimento = observacaoMovimento;
        this.status = status;
        this.funcionario = funcionario;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public String getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public char getFlagTipoMovimento() {
        return flagTipoMovimento;
    }

    public float getQuantidadeMovimentada() {
        return quantidadeMovimentada;
    }

    public String getObservacaoMovimento() {
        return observacaoMovimento;
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

    public void setDataHoraMovimento(String dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public void setFlagTipoMovimento(char flagTipoMovimento) {
        this.flagTipoMovimento = flagTipoMovimento;
    }

    public void setQuantidadeMovimentada(float quantidadeMovimentada) {
        this.quantidadeMovimentada = quantidadeMovimentada;
    }

    public void setObservacaoMovimento(String observacaoMovimento) {
        this.observacaoMovimento = observacaoMovimento;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Produto getProduto() {
        return produto;
    }

    
    
    @Override
    public String toString() {
        return "Movimento Estoque \n"+
                this.getId() +", "+
                this.getDataHoraMovimento() +", "+
                this.getFlagTipoMovimento() +", "+
                this.getQuantidadeMovimentada() +", "+
                this.getObservacaoMovimento() +", "+
                this.getStatus() + "\n" +
                "Produto \n" +
                this.produto.getId() + ", " +
                this.produto.getDescricao() + ", " +
                this.produto.getCodigoBarra() + ", " +
                this.produto.getStatus() + "\n" +
                "Funcionario \n"+
                this.funcionario.getCpf() +", "+
                this.funcionario.getRg() +", "+
                this.funcionario.getUsuario() +", "+
                this.funcionario.getSenha();
                  
    }  

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
