/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Endereco;
import Model.DAO.DAOModel.EnderecoDAO;
import java.util.List;

/**
 *
 * @author NicolasMK
 */
public class EnderecoService {
    
    public static void create(Endereco objeto){
        EnderecoDAO EnderecoDAO = new EnderecoDAO();
        EnderecoDAO.create(objeto);
        
    }
    
    public static List<Endereco> retrive(){
        EnderecoDAO EnderecoDAO = new EnderecoDAO();
        return EnderecoDAO.retrieve();
    }
    
    public static Endereco retrieve(int parPK){
        EnderecoDAO EnderecoDAO = new EnderecoDAO();   
        return EnderecoDAO.retrieve(parPK);
    }
    
    public static List<Endereco> retrieve(String parString){
        EnderecoDAO EnderecoDAO = new EnderecoDAO();
        return EnderecoDAO.retrieve(parString);   
    }
    
    public static void update(Endereco objeto){
        EnderecoDAO EnderecoDAO = new EnderecoDAO();
        EnderecoDAO.update(objeto);
    }
    
    public static void delete(Endereco objeto){
        EnderecoDAO EnderecoDAO = new EnderecoDAO();
        EnderecoDAO.delete(objeto);
    }
    
    
    
}
