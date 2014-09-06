/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simuladordecache;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * Gera o Layout do menu
 */
public class Menu extends JPanel{
    private JLabel labelPC;
    private MenuTextField textPC;
    private JLabel labelOP;
    private MenuTextField textOP;
    private JComboBox algoritmos;
    private JButton iniciar;
    private JButton pausar;
    
    public Menu(){
        super(new MigLayout());
        this.labelPC = new JLabel("Program Counter: ");
        this.textPC = new MenuTextField("0");
        this.labelOP = new JLabel("Operação: ");
        this.textOP = new MenuTextField("OP");
        this.algoritmos = new JComboBox();
        this.algoritmos.addItem(makeObj("FIFO"));
        this.algoritmos.addItem(makeObj("LFU"));
        this.iniciar = new JButton("Iniciar");
        this.pausar = new JButton("Pausar");
        this.add(this.labelPC , "gap para");
        this.add(this.textPC, "span, growx, wrap ");
        this.add(this.labelOP, "gap para");
        this.add(this.textOP, "span, growx, wrap");
        this.add(this.algoritmos, "span, growx, wrap");
        this.add(this.iniciar);
        this.add(this.pausar, "wrap");
    }
    
    /*
     * Gera objetos para serem inseridos na JComboBox   
    */
    private Object makeObj(final String item)  {
        return new Object() { public String toString() { return item; } };
    }
    
}
