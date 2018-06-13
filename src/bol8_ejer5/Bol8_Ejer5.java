/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_ejer5;

import javax.swing.*;

/**
 *
 * @author ero
 */

class Principal extends JFrame{

    public Principal() {
        Validacion valid=new Validacion(this);
        valid.pack();
        valid.setLocationRelativeTo(null);
        valid.setVisible(true);
    }
    
    
    
}
        
public class Bol8_Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal p=new Principal();
        p.setSize(500,500);
        p.setLocationRelativeTo(null);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setVisible(true);
    }
    
}
