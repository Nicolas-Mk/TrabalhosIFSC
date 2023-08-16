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
public class Fornecedor extends Pessoa {
    
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String inscricaoEstadual, String razaoSocial) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public Fornecedor(String cnpj, String inscricaoEstadual, String razaoSocial, int id, String nome, String fone, String fone2, String email, char status, String complementoEndereco, Endereco endereco) {
        super(id, nome, fone, fone2, email, status, complementoEndereco, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    

    @Override
    public String toString() {
        return  this.getId() +", "+
                this.getNome() +", "+
                this.getFone() +", "+
                this.getFone2() +", "+
                this.getEmail() +", "+
                this.getStatus() +", "+
                this.getComplementoEndereco() +", "+
                this.getCnpj() +", "+
                this.getInscricaoEstadual() +", "+
                this.getRazaoSocial();
    }

    
    
}
