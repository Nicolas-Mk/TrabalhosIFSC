/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Bairro;
import Model.Cidade;
import Model.DAO.DAOModel.CidadeDAO;
import java.util.List;

/**
 *
 * @author NicolasMK
 */
public class CidadeService {
    
    public static void create(Cidade objeto){
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.create(objeto);
        
    }
    
    public static List<Cidade> retrive(){
        CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.retrieve();
    }
    
    public static Cidade retrieve(int parPK){
        CidadeDAO cidadeDAO = new CidadeDAO();   
        return cidadeDAO.retrieve(parPK);
    }
    
    public static Cidade retrieve(String parString){
        CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.retrieve(parString);   
    }
    
    public static void update(Cidade objeto){
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.update(objeto);
    }
    
    public static void delete(Cidade objeto){
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.delete(objeto);
    }
    
    
    
}
