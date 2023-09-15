/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Carteirinha;
import Model.Carteirinha;
import Model.DAO.DAOModel.CarteirinhaDAO;
import java.util.List;

/**
 *
 * @author NicolasMK
 */
public class CarteirinhaService {
    
    public static void create(Carteirinha objeto){
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();
        carteirinhaDAO.create(objeto);
        
    }
    
    public static List<Carteirinha> retrive(){
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();
        return carteirinhaDAO.retrieve();
    }
    
    public static Carteirinha retrieve(int parPK){
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();   
        return carteirinhaDAO.retrieve(parPK);
    }
    
    public static Carteirinha retrieve(String parString){
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();
        return carteirinhaDAO.retrieve(parString);   
    }
    
    public static void update(Carteirinha objeto){
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();
        carteirinhaDAO.update(objeto);
    }
    
    public static void delete(Carteirinha objeto){
        CarteirinhaDAO carteirinhaDAO = new CarteirinhaDAO();
        carteirinhaDAO.delete(objeto);
    }
    
    
    
}
