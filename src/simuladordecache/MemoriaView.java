/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simuladordecache;

import java.util.ArrayList;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * Gera os blocos de memoria que serão vizualizados
 */
public class MemoriaView extends JPanel {
    private ArrayList<BlocoView> listadeBlocos;
    public MemoriaView(){
        super(new MigLayout());
        this.listadeBlocos = new ArrayList<BlocoView>();
        this.listadeBlocos.add(new BlocoView(false));
        this.listadeBlocos.add(new BlocoView(false));
        this.listadeBlocos.add(new BlocoView(true));
        this.listadeBlocos.add(new BlocoView(false));
        this.listadeBlocos.add(new BlocoView(false));
        for(int i=0;i<=4;i++){
            this.add(this.listadeBlocos.get(i).getEndereco());
            this.add(this.listadeBlocos.get(i).getPalavras(), "wrap");
        }   
    }
    
}
