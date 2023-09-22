/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.DAOModel;

import Model.Funcionario;
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
public class FuncionarioDAO implements InterfaceDAO<Funcionario> {

    @Override
    public void create(Funcionario objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO funcionario (descricao) VALUES(?)";
        
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Funcionario> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Funcionario.id, Funcionario.nome FROM Funcionario";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Funcionario> FuncionarioList  = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            
            
            while(rst.next()){
                Funcionario Funcionario = new Funcionario();
                Funcionario.setId(rst.getInt("id"));
                Funcionario.setNome(rst.getString("nome"));
                
                FuncionarioList.add(Funcionario);
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return FuncionarioList;
        }
        
    }

    @Override
    public Funcionario retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Funcionario.id, Funcionario.nome FROM Funcionario where id = x";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Funcionario Funcionario = new Funcionario();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            
            Funcionario.setId(rst.getInt("id"));
            Funcionario.setNome(rst.getString("nome"));
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return Funcionario;
        }
    }

    @Override
    public Funcionario retrieve(String parString) {
        return null;
    }

    @Override
    public void update(Funcionario objeto) {
    }

    @Override
    public void delete(Funcionario objeto) {
    }
    
}
