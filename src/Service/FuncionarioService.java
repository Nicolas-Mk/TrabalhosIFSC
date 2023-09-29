/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Funcionario;
import Model.DAO.DAOModel.FuncionarioDAO;
import java.util.List;

/**
 *
 * @author NicolasMK
 */
public class FuncionarioService {
    
    public static void create(Funcionario objeto){
        FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
        FuncionarioDAO.create(objeto);
        
    }
    
    public static List<Funcionario> retrive(){
        FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
        return FuncionarioDAO.retrieve();
    }
    
    public static Funcionario retrieve(int parPK){
        FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();   
        return FuncionarioDAO.retrieve(parPK);
    }
    
    public static List<Funcionario> retrieve(String parString){
        FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
        return FuncionarioDAO.retrieve(parString);   
    }
    
    public static void update(Funcionario objeto){
        FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
        FuncionarioDAO.update(objeto);
    }
    
    public static void delete(Funcionario objeto){
        FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
        FuncionarioDAO.delete(objeto);
    }
    
    
    
}
