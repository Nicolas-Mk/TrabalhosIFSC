/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.DAOModel;

import Model.Funcionario;
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
public class FuncionarioDAO implements InterfaceDAO<Funcionario> {

    @Override
    public void create(Funcionario objeto) {
        
       Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO funcionario (nome, fone1, fone2," 
                + " email, usuario, senha, cpf, complementoEndereco, status, endereco_id) " 
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, (select id from endereco where cep like ? limit 1))";
        
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getEmail());
            pstm.setString(5, objeto.getUsuario());
            pstm.setString(6, objeto.getSenha());
            pstm.setString(7, objeto.getCpf());
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
        String sqlExecutar = " select F.id, F.nome, F.fone1, F.fone2, F.usuario,"
                + " F.cpf, F.email, F.complementoEndereco, F.status, E.Cep"
                + " from Funcionario F "
                + " join Endereco E on F.Endereco_id = E.id where F.id = ?";
               
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Funcionario funcionario = new Funcionario();
        Endereco endereco = new Endereco();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while(rst.next()){
            
                funcionario.setEndereco(endereco);
                
                funcionario.setId(rst.getInt("id"));
                funcionario.setNome(rst.getString("nome"));
                funcionario.setFone(rst.getString("fone1"));
                funcionario.setFone2(rst.getString("fone2"));
                funcionario.setUsuario(rst.getString("usuario"));
                funcionario.setCpf(rst.getString("cpf"));
                funcionario.setEmail(rst.getString("email"));
                funcionario.setComplementoEndereco(rst.getString("complementoEndereco"));
                endereco.setCep(rst.getString("cep"));
                funcionario.setStatus(rst.getString("status"));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return funcionario;
        }
    }

    @Override
    public List<Funcionario> retrieve(String parString) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " select F.id, F.nome, F.fone1, F.fone2, F.usuario,"
                + " F.cpf, F.email, F.complementoEndereco, F.status, E.Cep"
                + " from Funcionario F "
                + " join Endereco E on F.Endereco_id = E.id where "+Controller.Busca.ControllerBuscaBairro.filtroGlobal+" like ?";
               
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Funcionario funcionario = new Funcionario();
        Endereco endereco = new Endereco();
        List<Funcionario> funcionarioList = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, "%" + parString + "%");
            rst = pstm.executeQuery();
            
            
            
            while(rst.next()){
            
                funcionario.setEndereco(endereco);
                
                funcionario.setId(rst.getInt("id"));
                funcionario.setNome(rst.getString("nome"));
                funcionario.setFone(rst.getString("fone1"));
                funcionario.setFone2(rst.getString("fone2"));
                funcionario.setUsuario(rst.getString("usuario"));
                funcionario.setCpf(rst.getString("cpf"));
                funcionario.setEmail(rst.getString("email"));
                funcionario.setComplementoEndereco(rst.getString("complementoEndereco"));
                endereco.setCep(rst.getString("cep"));
                funcionario.setStatus(rst.getString("status"));
                
                funcionarioList.add(funcionario);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return funcionarioList;
        }
        
    }

    @Override
    public void update(Funcionario objeto) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "update funcionario set nome = ?, fone1 = ?, fone2 = ?, email = ?, status = ?, complementoEndereco = ?, cpf = ?, rg = ?, usuario = ?, senha = ? where id = ?";
        
        PreparedStatement pstm = null;
        Funcionario funcionario = new Funcionario();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getEmail());
            pstm.setString(5, objeto.getStatus());
            pstm.setString(6, objeto.getComplementoEndereco());
            pstm.setString(7, objeto.getCpf());
            pstm.setString(8, objeto.getRg());
            pstm.setString(10, objeto.getUsuario());
            pstm.setString(11, objeto.getSenha());
            pstm.setInt(12, objeto.getId());

            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        

        
    }

    @Override
    public void delete(Funcionario objeto) {
    }
    
}
