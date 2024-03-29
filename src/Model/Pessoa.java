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
public abstract class Pessoa {
    
    private int id;
    private String nome;
    private String fone;
    private String fone2;
    private String email;
    private String status;
    private String complementoEndereco;

    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String fone, String fone2, String email, String status, String complementoEndereco, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.fone2 = fone2;
        this.email = email;
        this.status = status;
        this.complementoEndereco = complementoEndereco;
        this.endereco = endereco;
    }

    public Pessoa(int id, String nome, String fone, String fone2, String email, String status, String complementoEndereco) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.fone2 = fone2;
        this.email = email;
        this.status = status;
        this.complementoEndereco = complementoEndereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    @Override
    public String toString() {
        return this.getId() +", "+
                this.getNome() +", "+
                this.getFone() +", "+
                this.getFone2() +", "+
                this.getEmail() +", "+
                this.getStatus() +", "+
                this.getComplementoEndereco();
    }
   
}

