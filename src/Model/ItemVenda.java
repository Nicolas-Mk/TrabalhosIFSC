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
public class ItemVenda {
    
   private int id;
   private float quantidadeProduto;
   private float valorUnitario;
   private char status;
   
   private Produto produto;
   private Venda venda;
   

    public ItemVenda() {
    }

    public ItemVenda(int id, float quantidadeProduto, float valorUnitario, char status, Produto produto, Venda venda) {
        this.id = id;
        this.quantidadeProduto = quantidadeProduto;
        this.valorUnitario = valorUnitario;
        this.status = status;
        this.produto = produto;
        this.venda = venda;
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

    public Produto getProduto() {
        return produto;
    }

    public Venda getVenda() {
        return venda;
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

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public String toString() {
        return  "ItemVenda \n" +
                this.getId() + ", " +
                this.getQuantidadeProduto() + ", " +
                this.getValorUnitario() + ", " +
                this.getStatus() + "\n" +
                "Produto \n" +
                this.produto.getId() + ", " +
                this.produto.getDescricao() + ", " +
                this.produto.getCodigoBarra() + ", " +
                this.produto.getStatus() + "\n" +
                "Venda \n" +
                this.venda.getId() +", "+ 
                this.venda.getDataHoraVenda() +", "+
                this.venda.getValorDesconto() +", "+
                this.venda.getFlagTipoDesconto() +", "+
                this.venda.getObservacao() +", "+
                this.venda.getStatus();
                
    }
    
 
   
   
}
