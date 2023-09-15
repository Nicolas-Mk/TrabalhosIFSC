/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Cliente;
import Model.DAO.DAOModel.ClienteDAO;
import java.util.List;

/**
 *
 * @author NicolasMK
 */
public class ClienteService {
    
    public static void create(Cliente objeto){
        ClienteDAO ClienteDAO = new ClienteDAO();
        ClienteDAO.create(objeto);
        
    }
    
    public static List<Cliente> retrive(){
        ClienteDAO ClienteDAO = new ClienteDAO();
        return ClienteDAO.retrieve();
    }
    
    public static Cliente retrieve(int parPK){
        ClienteDAO ClienteDAO = new ClienteDAO();   
        return ClienteDAO.retrieve(parPK);
    }
    
    public static Cliente retrieve(String parString){
        ClienteDAO ClienteDAO = new ClienteDAO();
        return ClienteDAO.retrieve(parString);   
    }
    
    public static void update(Cliente objeto){
        ClienteDAO ClienteDAO = new ClienteDAO();
        ClienteDAO.update(objeto);
    }
    
    public static void delete(Cliente objeto){
        ClienteDAO ClienteDAO = new ClienteDAO();
        ClienteDAO.delete(objeto);
    }
    
    
    
}
