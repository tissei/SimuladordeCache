/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simuladordecache;

import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Suporte01
 */
public class SimuladordeCache extends javax.swing.JFrame {
    private JPanel framePrincipal;
    private Menu menu;
    private CacheView cache;
    private MemoriaView memoria;
    
    /**
     * Creates new form SimuladordeCache
     */
    public SimuladordeCache() {
        super();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();
        this.framePrincipal =  new JPanel(new MigLayout());
        this.menu = new Menu();
        this.cache = new CacheView();
        this.memoria = new MemoriaView();
        this.framePrincipal.add(this.menu);
        this.framePrincipal.add(this.cache);
        this.framePrincipal.add(this.memoria);
        this.add(this.framePrincipal);
    }                  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimuladordeCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimuladordeCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimuladordeCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimuladordeCache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimuladordeCache().setVisible(true);
            }
        });
    }           
}
