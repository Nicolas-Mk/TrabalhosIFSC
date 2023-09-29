/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Produto;
import Model.DAO.DAOModel.ProdutoDAO;
import java.util.List;

/**
 *
 * @author NicolasMK
 */
public class ProdutoService {
    
    public static void create(Produto objeto){
        ProdutoDAO ProdutoDAO = new ProdutoDAO();
        ProdutoDAO.create(objeto);
        
    }
    
    public static List<Produto> retrive(){
        ProdutoDAO ProdutoDAO = new ProdutoDAO();
        return ProdutoDAO.retrieve();
    }
    
    public static Produto retrieve(int parPK){
        ProdutoDAO ProdutoDAO = new ProdutoDAO();   
        return ProdutoDAO.retrieve(parPK);
    }
    
    public static List<Produto> retrieve(String parString){
        ProdutoDAO ProdutoDAO = new ProdutoDAO();
        return ProdutoDAO.retrieve(parString);   
    }
    
    public static void update(Produto objeto){
        ProdutoDAO ProdutoDAO = new ProdutoDAO();
        ProdutoDAO.update(objeto);
    }
    
    public static void delete(Produto objeto){
        ProdutoDAO ProdutoDAO = new ProdutoDAO();
        ProdutoDAO.delete(objeto);
    }
    
    
    
}
