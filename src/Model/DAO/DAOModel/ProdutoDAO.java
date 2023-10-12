/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.DAOModel;

import Model.Produto;
import Model.DAO.ConnectionFactory;
import Model.DAO.InterfaceDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class ProdutoDAO implements InterfaceDAO<Produto> {

    @Override
    public void create(Produto objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO produto (descricao, codigoBarra, status) VALUES(?, ?, ?)";
        
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
             pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getCodigoBarra());
            pstm.setString(3, objeto.getStatus());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Produto> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Produto.id, Produto.descricao, Produto.codigoBarra, Produto.status FROM Produto";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Produto> ProdutoList  = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            
            
            while(rst.next()){
                Produto Produto = new Produto();
                Produto.setId(rst.getInt("id"));
                Produto.setDescricao(rst.getString("descricao"));
                Produto.setCodigoBarra(rst.getString("codigoBarra"));
                Produto.setStatus(rst.getString("status"));
                
                ProdutoList.add(Produto);
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return ProdutoList;
        }
        
    }

    @Override
    public Produto retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Produto.id, Produto.descricao, Produto.codigoBarra, Produto.Status FROM Produto where id = ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Produto produto = new Produto();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            while(rst.next()){
            produto.setId(rst.getInt("id"));
            produto.setDescricao(rst.getString("descricao"));
            produto.setCodigoBarra(rst.getString("codigoBarra"));
            produto.setStatus(rst.getString("status"));   
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return produto;
        }
    }

    @Override
    public List<Produto> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT produto.id, produto.descricao, produto.codigoBarra, produto.status from produto WHERE descricao like ?";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Produto> listaProduto = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" +parString + "%");
            rst = pstm.executeQuery();
            
            while(rst.next()){
            Produto produto = new Produto();
            produto.setId(rst.getInt("id"));
            produto.setDescricao(rst.getString("descricao"));
            produto.setCodigoBarra(rst.getString("codigoBarra"));
            produto.setStatus(rst.getString("status"));
            listaProduto.add(produto);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaProduto;
        }
    }
    
    @Override
    public void update(Produto objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE produto set produto.descricao = ?, produto.codigobarra = ?, produto.status = ? where Produto.id = ?";
        PreparedStatement pstm = null;
        Produto produto = new Produto();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getCodigoBarra());
            pstm.setString(3, objeto.getStatus());
            pstm.setInt(4, objeto.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Produto objeto) {
    }
    
}
