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
public class Endereco {
    
    private int id;
    private String cep;
    private String logradouro;
    private String status;
    
    private Bairro bairro;
    private Cidade cidade;

    public Endereco(int id, String cep, String logradouro, String status, Bairro bairro, Cidade cidade) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.status = status;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Endereco() {
    }

    public int getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getStatus() {
        return status;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return  this.getId() + ", " +
                this.getCep() + ", " +
                this.getLogradouro() + ", " +
                this.bairro.getDescricao() + ", " + 
                this.cidade.getDescricao() +", " +
                this.getStatus();
    }

}
