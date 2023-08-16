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
public class Carteirinha {
    
    private int id;
    private String codigoBarra;
    private String dataGeracao;
    private String dataCancelamento;
    
    private Cliente cliente;

    public Carteirinha() {
    }

    public Carteirinha(int id, String codigoBarra, String dataGeracao, String dataCancelamento, Cliente cliente) {
        this.id = id;
        this.codigoBarra = codigoBarra;
        this.dataGeracao = dataGeracao;
        this.dataCancelamento = dataCancelamento;
        this.cliente = cliente;
    }

    public Carteirinha(int id, String codigoBarra, String dataGeracao, String dataCancelamento) {
        this.id = id;
        this.codigoBarra = codigoBarra;
        this.dataGeracao = dataGeracao;
        this.dataCancelamento = dataCancelamento;
    }
    
    

    public int getId() {
        return id;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public String getDataCancelamento() {
        return dataCancelamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public void setDataCancelamento(String dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Carteirinha \n"+
                this.getId() + ", "+
                this.getCodigoBarra() +", "+
                this.getDataGeracao() +", "+
                this.getDataCancelamento() + "\n" + 
                "Cliente \n"+
                this.cliente.getCpf() +", "+
                this.cliente.getRg() +", "+
                this.cliente.getMatricula() +", "+
                this.cliente.getDataNascimento();
        
    }   
    
}
