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
public class Cliente extends Pessoa {
    
    private String cpf;
    private String rg;
    private String matricula;
    private String dataNascimento;
    
    public Cliente(String cpf, String rg, String matricula, String dataNascimento) {
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public Cliente(String cpf, String rg, String matricula, String dataNascimento, int id, String nome, String fone, String fone2, String email, String status, String complementoEndereco) {
        super(id, nome, fone, fone2, email, status, complementoEndereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }
    
    

    public Cliente() {
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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
                this.getMatricula() +", "+
                this.getDataNascimento();
    }    
    
}

    
