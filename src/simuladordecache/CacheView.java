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
 * Classe que gera a vizualição da memoria cache
 */
public class CacheView extends JPanel{
    private ArrayList<LinhaView> listaLinhas;
    public CacheView(){
        super(new MigLayout());
        this.listaLinhas = new ArrayList<LinhaView>();
        for(int i=0;i<20;i++){
            this.listaLinhas.add(new LinhaView(i,String.valueOf(i)));
        }
        for(int i=0;i<20;i++){
            this.add(this.listaLinhas.get(i).getTag());
            this.add(this.listaLinhas.get(i).getPalavra(),"wrap");
        }
    }
}
