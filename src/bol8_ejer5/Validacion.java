/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol8_ejer5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ero
 */
public class Validacion extends JDialog implements ActionListener{

    JLabel lblUsuario;
    JTextField txfUsuario;
    JLabel lblContraseña;
    JTextField txfContraseña;
    JButton entrar;
    JButton cancelar;
    
    public Validacion(Principal p) {
        super(p, true);
        this.setTitle("Usuario");
        this.setLayout(new FlowLayout());
        
        lblUsuario=new JLabel("Usuario");
        this.add(lblUsuario);
        
        txfUsuario=new JTextField(10);
        this.add(txfUsuario);
        
        lblContraseña=new JLabel("Contraseña");
        this.add(lblContraseña);
        
        txfContraseña=new JTextField(10);
        txfContraseña.addActionListener(this);
        this.add(txfContraseña);
        
        entrar=new JButton("Entrar");
        entrar.addActionListener(this);
        this.add(entrar);
        
        cancelar=new JButton("Cancelar");
        cancelar.addActionListener(this);
        this.add(cancelar);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing (WindowEvent e){
                System.exit(0);
            }
});
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==entrar){
            
        }
        if (e.getSource()==cancelar){
            System.exit(0);
        }
    }

}
