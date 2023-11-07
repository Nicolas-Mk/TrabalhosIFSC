/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.DAOModel;

import Model.Carteirinha;
import Model.Cliente;
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
        String sqlExecutar = "INSERT INTO carteirinha (codigoBarra, dataGeracao,"
                + " dataCancelamento, cliente_id)"
                + " VALUES(?, ?, ?, "
                + "(select id from cliente where cliente.nome like ?))";
        
        
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodigoBarra().replace("-", ""));
            pstm.setString(2, objeto.getDataGeracao().replace("-", ""));
            pstm.setString(3, objeto.getDataCancelamento().replace("-", ""));
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
        String sqlExecutar = "SELECT C.id, Cl.nome, Cl.matricula, Cl.Cpf, Cl.dataNascimento, C.dataCancelamento, C.dataGeracao,"
                + " C.codigoBarra FROM Carteirinha C"
                + " join Cliente Cl on C.cliente_id = Cl.id"
                + " where C.id = ?"; 
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Carteirinha carteirinha = new Carteirinha();
        Cliente cliente = new Cliente();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();
            
            while(rst.next()){
            
                carteirinha.setId(rst.getInt("id"));
                cliente.setNome(rst.getString("nome"));
                cliente.setMatricula(rst.getString("matricula"));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setDataNascimento(rst.getString("dataNascimento"));
                
                carteirinha.setCodigoBarra(rst.getString("codigoBarra"));
                carteirinha.setDataCancelamento(rst.getString("dataCancelamento"));
                carteirinha.setDataGeracao(rst.getString("dataGeracao"));
                carteirinha.setCliente(cliente);
                  
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return carteirinha;
        }
    }

    @Override
    public List<Carteirinha> retrieve(String parString) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT C.id, Cl.nome, Cl.matricula, Cl.Cpf, Cl.dataNascimento, C.dataCancelamento, C.dataGeracao,"
                + " C.codigoBarra FROM Carteirinha C"
                + " join Cliente Cl on C.cliente_id = Cl.id where "+Controller.Busca.ControllerBuscaBairro.filtroGlobal+" like ?";
        
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Carteirinha carteirinha = new Carteirinha();
        Cliente cliente = new Cliente();
        List<Carteirinha> listaCarteirinha = new ArrayList<>();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, parString + "%");
            rst = pstm.executeQuery();
            while(rst.next()){
                
                cliente.setNome(rst.getString("nome"));
                cliente.setMatricula(rst.getString("matricula"));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setDataNascimento(rst.getString("dataNascimento"));
                
                carteirinha.setId(rst.getInt("id"));
                carteirinha.setCodigoBarra(rst.getString("codigoBarra"));
                carteirinha.setDataCancelamento(rst.getString("dataCancelamento"));
                carteirinha.setDataGeracao(rst.getString("dataGeracao"));
                carteirinha.setCliente(cliente);
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
        
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "update carteirinha set codigobarra = ?, dataGeracao = ?,"
                + " dataCancelamento = ? where id = ?";
        PreparedStatement pstm = null;
        Carteirinha carteirinha = new Carteirinha();
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodigoBarra());
            pstm.setString(2, objeto.getDataGeracao());
            pstm.setString(3, objeto.getDataCancelamento());
            pstm.setInt(4, objeto.getId());

            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }
        
    }

    @Override
    public void delete(Carteirinha objeto) {
    }
    
}
