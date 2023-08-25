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
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class BairroDAO implements InterfaceDAO<Bairro> {

    @Override
    public void Create(Bairro objeto) {
        
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
    public List<Bairro> Retrieve() {
        return null;
        
    }

    @Override
    public Bairro Retrieve(int parPK) {
        return null;
    }

    @Override
    public Bairro Retrieve(String parString) {
        return null;
    }

    @Override
    public void Update(Bairro objeto) {
    }

    @Override
    public void Delete(Bairro objeto) {
    }
    
}
