/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvpoo;

/**
 *
 * @author Carolina
 */
public class AtvPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pessoa nome = new Pessoa ();
        nome.setNome ("Carol");
        System.out.println ("Nome - " + nome.getNome());
        nome.setIdade(27);
        System.out.println (nome.verificarMaioridade());
        
        
        
        
    }
    
}
