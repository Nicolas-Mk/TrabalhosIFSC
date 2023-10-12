/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.DAOModel;

import Model.Cidade;
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
public class CidadeDAO implements InterfaceDAO<Cidade> {

    @Override
    public void create(Cidade objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cidade (descricao, uf) VALUES(?, ?)";
        
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getUf());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Cidade> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Cidade.id, Cidade.descricao, cidade.uf FROM Cidade";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Cidade> CidadeList  = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            
            
            while(rst.next()){
                Cidade Cidade = new Cidade();
                Cidade.setId(rst.getInt("id"));
                Cidade.setDescricao(rst.getString("descricao"));
                Cidade.setUf(rst.getString("uf"));
                
                CidadeList.add(Cidade);
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return CidadeList;
        }
        
    }

    @Override
    public Cidade retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Cidade.id, Cidade.uf, Cidade.descricao FROM Cidade where Cidade.id = ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Cidade cidade = new Cidade();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while(rst.next()){
            cidade.setId(rst.getInt("id"));
            cidade.setUf(rst.getString("uf"));
            cidade.setDescricao(rst.getString("descricao"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cidade;
        }
    }

    @Override
    public List<Cidade> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Cidade.id, Cidade.uf, Cidade.descricao from Cidade WHERE descricao like ?";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Cidade> listaCidade = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" +parString + "%");
            rst = pstm.executeQuery();
            while(rst.next()){
            Cidade cidade = new Cidade();
            cidade.setId(rst.getInt("id"));
            cidade.setUf(rst.getString("uf"));
            cidade.setDescricao(rst.getString("descricao"));
            listaCidade.add(cidade);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCidade;
        }
    }

    @Override
    public void update(Cidade objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE cidade set cidade.descricao = ?, cidade.uf = ? where cidade.id = ?";
        PreparedStatement pstm = null;
        Cidade cidade = new Cidade();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getUf());
            pstm.setInt(3, objeto.getId());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public void delete(Cidade objeto) {
    }
    
}
