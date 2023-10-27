/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.DAOModel;

import Model.Bairro;
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
public class BairroDAO implements InterfaceDAO<Bairro> {

    @Override
    public void create(Bairro objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO bairro (descricao) VALUES(?)";
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Bairro> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT bairro.id, bairro.descricao FROM BAIRRO";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Bairro> bairroList  = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            
            
            while(rst.next()){
                Bairro bairro = new Bairro();
                bairro.setId(rst.getInt("id"));
                bairro.setDescricao(rst.getString("descricao"));
                
                bairroList.add(bairro);
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return bairroList;
        }
        
    }

    @Override
    public Bairro retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT bairro.id, bairro.descricao FROM BAIRRO where bairro.id = ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Bairro bairro = new Bairro();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while(rst.next()){
            bairro.setId(rst.getInt("id"));
            bairro.setDescricao(rst.getString("descricao"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return bairro;
        }
    }

    @Override
    public List<Bairro> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT bairro.id, bairro.descricao from bairro WHERE descricao like ?";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Bairro> listaBairro = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" +parString + "%");
            rst = pstm.executeQuery();
            while(rst.next()){
            Bairro bairro = new Bairro();
            bairro.setId(rst.getInt("id"));
            bairro.setDescricao(rst.getString("descricao"));
            listaBairro.add(bairro);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaBairro;
        
        }
    }

    @Override
    public void update(Bairro objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE bairro set bairro.descricao = ? where bairro.id = ?";
        PreparedStatement pstm = null;
        Bairro bairro = new Bairro();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setInt(2, objeto.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
 
        
    }

    @Override
    public void delete(Bairro objeto) {
    }
    
}
