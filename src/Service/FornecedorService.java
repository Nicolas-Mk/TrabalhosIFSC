/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Fornecedor;
import Model.DAO.DAOModel.FornecedorDAO;
import java.util.List;

/**
 *
 * @author NicolasMK
 */
public class FornecedorService {
    
    public static void create(Fornecedor objeto){
        FornecedorDAO FornecedorDAO = new FornecedorDAO();
        FornecedorDAO.create(objeto);
        
    }
    
    public static List<Fornecedor> retrive(){
        FornecedorDAO FornecedorDAO = new FornecedorDAO();
        return FornecedorDAO.retrieve();
    }
    
    public static Fornecedor retrieve(int parPK){
        FornecedorDAO FornecedorDAO = new FornecedorDAO();   
        return FornecedorDAO.retrieve(parPK);
    }
    
    public static Fornecedor retrieve(String parString){
        FornecedorDAO FornecedorDAO = new FornecedorDAO();
        return FornecedorDAO.retrieve(parString);   
    }
    
    public static void update(Fornecedor objeto){
        FornecedorDAO FornecedorDAO = new FornecedorDAO();
        FornecedorDAO.update(objeto);
    }
    
    public static void delete(Fornecedor objeto){
        FornecedorDAO FornecedorDAO = new FornecedorDAO();
        FornecedorDAO.delete(objeto);
    }
    
    
    
}
