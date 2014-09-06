/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simuladordecache;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * TextFields utilizados pela classe MemoriaView
 */
public class MemoriaTextField extends JTextField {
    public MemoriaTextField(String text, boolean selected){
        super(text);
        this.disable();
        this.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        this.setBorder(null);
        if(selected){
            this.setDisabledTextColor(Color.RED);
        }else{
            this.setDisabledTextColor(Color.GREEN);
        }
    }
    public MemoriaTextField(String text){
        super(text);
        this.disable();
        this.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        this.setBorder(null);
        this.setDisabledTextColor(Color.GREEN);
    }
    
}
