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
public class Bairro {
    
    private int id;
    private String descricao;

    public Bairro(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Bairro() {
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return  this.getId() +", "+
                this.getDescricao();
    }
    
    
}
