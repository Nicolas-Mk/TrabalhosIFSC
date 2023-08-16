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
public class ItemCompra {
    
    private int id;
    private float quantidadeProduto;
    private float valorUnitario;
    private char status;
    
    private Compra compra;
    private Produto produto;

    public ItemCompra() {
    }

    public ItemCompra(int id, float quantidadeProduto, float valorUnitario, char status, Compra compra, Produto produto) {
        this.id = id;
        this.quantidadeProduto = quantidadeProduto;
        this.valorUnitario = valorUnitario;
        this.status = status;
        this.compra = compra;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public float getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public char getStatus() {
        return status;
    }

    public Compra getCompra() {
        return compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantidadeProduto(float quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return  "ItemCompra \n"+
                this.getId() +", "+
                this.getQuantidadeProduto() +", "+
                this.getValorUnitario() +", "+
                this.getStatus() + "\n" +
                "Compra \n"+
                this.compra.getId() +", "+
                this.compra.getNumeronf() +", "+
                this.compra.getDataHoraCompra() +", "+
                this.compra.getValorDesconto() +", "+
                this.compra.getFlagTipoDesconto() +", "+
                this.compra.getStatus() +", "+
                this.compra.getObservacao() + "\n" +
                "Produto \n"+
                this.produto.getId() + ", " +
                this.produto.getDescricao() + ", " +
                this.produto.getCodigoBarra() + ", " +
                this.produto.getStatus();
               
    }
    


   
   
    
    
}
