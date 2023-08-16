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
public class Caixa {
   
    private int id;
    private String dataHoraAbertura;
    private String dataHoraFechamento;
    private float valorAbertura;
    private float valorFechamento;
    private String observacao;
    private char status;
    
    private Funcionario funcionario;

    public Caixa() {
    }

    public Caixa(int id, String dataHoraAbertura, String dataHoraFechamento, float valorAbertura, float valorFechamento, String observacao, char status, Funcionario funcinario) {
        this.id = id;
        this.dataHoraAbertura = dataHoraAbertura;
        this.dataHoraFechamento = dataHoraFechamento;
        this.valorAbertura = valorAbertura;
        this.valorFechamento = valorFechamento;
        this.observacao = observacao;
        this.status = status;
        this.funcionario = funcinario;
    }

    public int getId() {
        return id;
    }

    public String getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public String getDataHoraFechamento() {
        return dataHoraFechamento;
    }

    public float getValorAbertura() {
        return valorAbertura;
    }

    public float getValorFechamento() {
        return valorFechamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public char getStatus() {
        return status;
    }

    public Funcionario getFuncinario() {
        return funcionario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataHoraAbertura(String dataHoraAbertura) {
        this.dataHoraAbertura = dataHoraAbertura;
    }

    public void setDataHoraFechamento(String dataHoraFechamento) {
        this.dataHoraFechamento = dataHoraFechamento;
    }

    public void setValorAbertura(float valorAbertura) {
        this.valorAbertura = valorAbertura;
    }

    public void setValorFechamento(float valorFechamento) {
        this.valorFechamento = valorFechamento;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setFuncinario(Funcionario funcinario) {
        this.funcionario = funcinario;
    }

    @Override
    public String toString() {
        return  "Caixa \n" +
                this.getId() + ", "+
                this.getDataHoraAbertura() + ", "+
                this.getDataHoraFechamento() + ", "+
                this.getValorAbertura() + ", "+
                this.getValorFechamento() + ", "+
                this.getObservacao() + ", "+
                this.getStatus() + "\n" +
                "Funcionario \n" +
                this.funcionario.getCpf() +", "+
                this.funcionario.getRg() +", "+
                this.funcionario.getUsuario() +", "+
                this.funcionario.getSenha();
                
                
    }
    
    

}