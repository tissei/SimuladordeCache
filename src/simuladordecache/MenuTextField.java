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
 * Classe utilizada para os textfields da classe menu
 */
public class MenuTextField extends JTextField{
    public MenuTextField(String text){
        super(text);
        this.disable();
        this.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        this.setBorder(null);
        this.setDisabledTextColor(Color.GREEN);
    }
}
