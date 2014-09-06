package simuladordecache;

import java.util.ArrayList;

/*
|--------------------------------------------------------------------------
| MemoriaPrincipal
|--------------------------------------------------------------------------
| Simula o funcionamento da memoria principal
|
| @var ArrayList<LinhadeMemoria> listadeLinhas   lista das linhas contidas na memoria
| @var int                       contadorLinhas  conta quantas linhas foram gerados e gera o endereco das mesmas
| @var boolean                   
|
|
*/

public class MemoriaPrincipal {
    private ArrayList<LinhadeMemoria> linhas;
    private int contadorBlocos;
    private int contadorLinhas;
    private boolean ultimoBlocoCheio;
    static final int QTD_LINHAS = 1500;
    static final int TAMANHO_BLOCO = 5;
    
    public MemoriaPrincipal(){
        this.linhas = new ArrayList<LinhadeMemoria>();
        this.contadorBlocos = 0;
        this.contadorLinhas = 0;
        this.ultimoBlocoCheio = false;
    }
    
    /**
     * newLinha
     *
     * Insere uma nova linha na cache
     *
     * @param int palavra a palavra a ser inserida
     * @return void
     *
     */
    
    public void newLinha(int palavra)
    {
        countLinha();
        countBloco();
        this.linhas.add(new LinhadeMemoria(this.contadorLinhas, palavra, this.contadorBlocos));
        
    }
    
    /**
     * countLinha
     *
     * adiciona ao contador de linhas
     *
     */
    
    public void countLinha()
    {
        this.contadorLinhas++;    
    }
    
    /**
     * countBloco
     *
     * Verifica se o bloco atual esta cheio ou nao, se o resultado for inteiro esta cheio e soma
     * se nao ele nao estara cheio entao nao soma.
     *
     */
    
    public void countBloco()
    {
        if(this.contadorBlocos == 0){
            this.contadorBlocos++;
        }else{
            if((this.contadorBlocos/this.contadorLinhas) == Math.round(this.contadorBlocos/this.contadorLinhas)){
             this.contadorBlocos++;
            }
        }
    }
        
}
