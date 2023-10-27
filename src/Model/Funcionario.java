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
public class Funcionario extends Pessoa{
    
    private String cpf;
    private String rg;
    private String usuario;
    private String senha;

    public Funcionario(String cpf, String rg, String usuario, String senha) {
        this.cpf = cpf;
        this.rg = rg;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Funcionario(String cpf, String rg, String usuario, String senha, int id, String nome, String fone, String fone2, String email, String status, String complementoEndereco, Endereco endereco) {
        super(id, nome, fone, fone2, email, status, complementoEndereco, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Funcionario() {
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
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
                this.getCpf() +", "+
                this.getRg() +", "+
                this.getUsuario() +", "+
                this.getSenha();
    }
}
