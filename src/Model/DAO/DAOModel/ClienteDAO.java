/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.DAOModel;

import Model.Cliente;
import Model.DAO.ConnectionFactory;
import Model.DAO.InterfaceDAO;
import Model.Endereco;
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
public class ClienteDAO implements InterfaceDAO<Cliente> {

    @Override
    public void create(Cliente objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cliente (nome, fone1, fone2,"
                + " rg, matricula, email, status, complementoEndereco,"
                + " dataNascimento, cpf, endereco_id)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, (select id from endereco where cep like ?))";
        
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getRg());
            pstm.setString(5, objeto.getMatricula());
            pstm.setString(6, objeto.getEmail());
            pstm.setString(7, objeto.getStatus());
            pstm.setString(8, objeto.getComplementoEndereco());
            pstm.setString(9, objeto.getDataNascimento().replace("/", ""));
            pstm.setString(10, objeto.getCpf());
            pstm.setString(11, objeto.getEndereco().getCep());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm);
        }
    }

    @Override
    public List<Cliente> retrieve() {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT Cliente.id, Cliente.nome FROM Cliente";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Cliente> ClienteList  = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            
            
            while(rst.next()){
                Cliente Cliente = new Cliente();
                Cliente.setId(rst.getInt("id"));
                Cliente.setNome(rst.getString("dataGeracao"));
                
                ClienteList.add(Cliente);
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return ClienteList;
        }
        
    }

    @Override
    public Cliente retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " select c.id, c.nome, c.cpf, c.fone1, c.fone2, c.matricula,"
                + " c.email, c.complementoEndereco, c.dataNascimento, e.status as cliente,"
                + " e.cep as endereco from cliente c "
                + " join endereco e  on c.endereco_id = e.id where e.id = ?";
               
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while(rst.next()){
            
                
                endereco.setCep(rst.getString("cep"));
                
                cliente.setId(rst.getInt("id"));
                cliente.setNome(rst.getString("nome"));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setFone(rst.getString("fone1"));
                cliente.setFone2(rst.getString("fone2"));
                cliente.setMatricula(rst.getString("matricula"));
                cliente.setEmail(rst.getString("email"));
                cliente.setComplementoEndereco(rst.getString("complementoEndereco"));
                cliente.setDataNascimento(rst.getString("dataNascimento"));
                cliente.setStatus(rst.getString("status"));

            }
            
            
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cliente;
        }
    }

    @Override
    public List<Cliente> retrieve(String parString) {
        return null;
    }

    @Override
    public void update(Cliente objeto) {
    }

    @Override
    public void delete(Cliente objeto) {
    }
    
}
