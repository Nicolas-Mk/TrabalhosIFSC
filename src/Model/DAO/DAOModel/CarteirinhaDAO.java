/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.DAOModel;

import Model.Carteirinha;
import Model.DAO.ConnectionFactory;
import Model.DAO.InterfaceDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class CarteirinhaDAO implements InterfaceDAO<Carteirinha> {

    @Override
    public void create(Carteirinha objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO endereco (codigoBarra, dataGeracao,"
                + " dataCancelamento, cliente_id)"
                + " VALUES(?, ?, ?, "
                + "(select id from cliente, where nome like ?)";
        
        
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodigoBarra());
            pstm.setString(2, objeto.getDataGeracao());
            pstm.setString(3, objeto.getDataCancelamento());
            pstm.setString(4, objeto.getCliente().getNome());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Carteirinha> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Carteirinha.id, Carteirinha.dataGeracao FROM Carteirinha";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Carteirinha> CarteirinhaList  = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            
            
            while(rst.next()){
                Carteirinha Carteirinha = new Carteirinha();
                Carteirinha.setId(rst.getInt("id"));
                Carteirinha.setDataGeracao(rst.getString("dataGeracao"));
                
                CarteirinhaList.add(Carteirinha);
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return CarteirinhaList;
        }
        
    }

    @Override
    public Carteirinha retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Carteirinha.id, Carteirinha.dataGeracao FROM Carteirinha where id = x";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Carteirinha Carteirinha = new Carteirinha();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            
            Carteirinha.setId(rst.getInt("id"));
            Carteirinha.setDataGeracao(rst.getString("dataGeracao"));
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return Carteirinha;
        }
    }

    @Override
    public List<Carteirinha> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Carteirinha.id, Carteirinha.descricao from Carteirinha WHERE descricao like ?";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Carteirinha> listaCarteirinha = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" +parString + "%");
            rst = pstm.executeQuery();
            while(rst.next()){
            Carteirinha carteirinha = new Carteirinha();
            carteirinha.setId(rst.getInt("id"));
            listaCarteirinha.add(carteirinha);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCarteirinha;
        
        }
    }

    @Override
    public void update(Carteirinha objeto) {
    }

    @Override
    public void delete(Carteirinha objeto) {
    }
    
}
