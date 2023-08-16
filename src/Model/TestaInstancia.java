/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class TestaInstancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("123421421", "123321", "17/12/2002", "12321312");
        Carteirinha ca1 = new Carteirinha(1, "31221421", "24/12/2006", "", c1);  
        System.out.println(ca1.toString());
   
    }
    
}
