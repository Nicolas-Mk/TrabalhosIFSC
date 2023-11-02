/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.DAOModel;

import Model.Fornecedor;
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
public class FornecedorDAO implements InterfaceDAO<Fornecedor> {

    @Override
    public void create(Fornecedor objeto) {
        
         Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO fornecedor (nome, fone1, fone2," 
                + " cnpj, inscricaoEstadual, razaoSocial, email, complementoEndereco, status, endereco_id) " 
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, (select id from endereco where cep like ? limit 1))";
        
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getCnpj());
            pstm.setString(5, objeto.getInscricaoEstadual());
            pstm.setString(6, objeto.getRazaoSocial());
            pstm.setString(7, objeto.getEmail());
            pstm.setString(8, objeto.getComplementoEndereco());
            pstm.setString(10, objeto.getEndereco().getCep());
            pstm.setString(9, objeto.getStatus());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Fornecedor> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Fornecedor.id, Fornecedor.nome FROM Fornecedor";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Fornecedor> FornecedorList  = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            
            
            while(rst.next()){
                Fornecedor Fornecedor = new Fornecedor();
                Fornecedor.setId(rst.getInt("id"));
                Fornecedor.setNome(rst.getString("nome"));
                
                FornecedorList.add(Fornecedor);
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return FornecedorList;
        }
        
    }

    @Override
    public Fornecedor retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Fornecedor.id, Fornecedor.nome FROM Fornecedor where id = x";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Fornecedor Fornecedor = new Fornecedor();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            
            Fornecedor.setId(rst.getInt("id"));
            Fornecedor.setNome(rst.getString("nome"));
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return Fornecedor;
        }
    }

    @Override
    public List<Fornecedor> retrieve(String parString) {
        return null;
    }

    @Override
    public void update(Fornecedor objeto) {
    }

    @Override
    public void delete(Fornecedor objeto) {
    }
    
}
