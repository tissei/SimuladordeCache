/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simuladordecache;

/**
 *
 * Classe que gera a vizualização da linha de cache
 */
public class LinhaView {
    private MemoriaTextField tag;
    private MemoriaTextField palavra;
    public LinhaView(int tag, String palavra){
        this.tag = new MemoriaTextField(String.valueOf(tag));
        this.palavra = new MemoriaTextField(palavra);
    }
    public MemoriaTextField getTag(){
        return this.tag;
    }
     public MemoriaTextField getPalavra(){
        return this.palavra;
    }
}
