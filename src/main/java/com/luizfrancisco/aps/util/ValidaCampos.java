/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luizfrancisco.aps.util;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author User
 */
public class ValidaCampos {
    public boolean validaTextField(JTextField campo, String texto, JLabel aviso){
        if(campo.getText().equals(texto)){
            campo.setBorder(new LineBorder(Color.RED, 2));
            aviso.setText("O campo " + texto + " não foi preenchido ");
            aviso.setForeground(Color.RED);
            return true;
            
        }else{
            campo.setBorder(new LineBorder(Color.GRAY, 1));
            aviso.setText("");
            return false;     
    }
    }
    public boolean validaPasswordField(JPasswordField campo, String texto, JLabel aviso){
        if(String.valueOf(campo.getPassword()).equals(texto)){
            campo.setBorder(new LineBorder(Color.RED, 2));
            aviso.setText("O campo " + texto + " não foi preenchido ");
            aviso.setForeground(Color.RED);
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY, 1));
            aviso.setText("");
            return false;     
    }
    }
}