/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Bairro;
import Model.DAO.DAOModel.BairroDAO;
import java.util.List;

/**
 *
 * @author NicolasMK
 */
public class BairroService {
    
    public static void create(Bairro objeto){
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.create(objeto);
        
    }
    
    public static List<Bairro> retrive(){
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.retrieve();
    }
    
    public static Bairro retrieve(int parPK){
        BairroDAO bairroDAO = new BairroDAO();   
        return bairroDAO.retrieve(parPK);
    }
    
    public static List<Bairro> retrieve(String parString){
        BairroDAO bairroDAO = new BairroDAO();
        return bairroDAO.retrieve(parString);   
    }
    
    public static void update(Bairro objeto){
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.update(objeto);
    }
    
    public static void delete(Bairro objeto){
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.delete(objeto);
    }
    
    
    
}
