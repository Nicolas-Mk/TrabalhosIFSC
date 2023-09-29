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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class CarteirinhaDAO implements InterfaceDAO<Carteirinha> {

    @Override
    public void create(Carteirinha objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO carteirinha (descricao) VALUES(?)";
        
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDataGeracao());
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
        return null;
    }

    @Override
    public void update(Carteirinha objeto) {
    }

    @Override
    public void delete(Carteirinha objeto) {
    }
    
}
