/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.DAOModel;

import Model.Bairro;
import Model.Cidade;
import Model.Endereco;
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
public class EnderecoDAO implements InterfaceDAO<Endereco> {

    @Override
    public void create(Endereco objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO endereco (cep, logradouro,"
                + " status, cidade_id, bairro_id)"
                + " VALUES(?, ?, ?, (select id from cidade where descricao like ?),"
                + " (select id from bairro where descricao like ?))";
        
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCep());
            pstm.setString(2, objeto.getLogradouro());
            pstm.setString(3, objeto.getStatus());
            pstm.setString(4, objeto.getCidade().getDescricao());
            pstm.setString(5, objeto.getBairro().getDescricao());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Endereco> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Endereco.id, Endereco.cep FROM Endereco";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Endereco> EnderecoList  = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            
            
            while(rst.next()){
                Endereco Endereco = new Endereco();
                Endereco.setId(rst.getInt("id"));
                Endereco.setCep(rst.getString("cep"));
                
                EnderecoList.add(Endereco);
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return EnderecoList;
        }
        
    }

    @Override
    public Endereco retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " SELECT E.id, E.cep, E.logradouro, E.status," + 
                " C.descricao as Cidade, B.descricao as Bairro FROM Endereco E" +
                " Join Cidade C on E.Cidade_id = c.id" +
                " Join bairro B on E.Bairro_id" +
                " where E.id = ?";
               
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Endereco Endereco = new Endereco();
        Bairro bairro = new Bairro();
        Cidade cidade = new Cidade();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while(rst.next()){
            
                bairro.setDescricao(rst.getString("Bairro"));
                cidade.setDescricao(rst.getString("Cidade"));
                
                Endereco.setId(rst.getInt("id"));
                Endereco.setCep(rst.getString("cep"));
                Endereco.setLogradouro(rst.getString("logradouro"));
                Endereco.setBairro(bairro);
                Endereco.setCidade(cidade);
                Endereco.setStatus(rst.getString("status"));
                
            }
            
            
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return Endereco;
        }
    }

    @Override
    public List<Endereco> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id,cep,logradouro,status from endereco where logradouro like ?";
               
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Endereco endereco = new Endereco();
        List<Endereco> enderecoList = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            
            while(rst.next()){

                endereco.setId(rst.getInt("id"));
                endereco.setCep(rst.getString("cep"));
                endereco.setLogradouro(rst.getString("logradouro"));
                endereco.setStatus(rst.getString("status"));
                enderecoList.add(endereco);
                
            }
            
            
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return enderecoList;
        }
    }

    @Override
    public void update(Endereco objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE endereco set cep = ?, logradouro = ?, status = ? where id = ?";
        PreparedStatement pstm = null;
        Endereco endereco = new Endereco();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCep());
            pstm.setString(2, objeto.getLogradouro());
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
    public void delete(Endereco objeto) {
    }
    
}
