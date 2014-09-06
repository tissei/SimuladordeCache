package simuladordecache;

/*
|--------------------------------------------------------------------------
| LinhadeMemoria
|--------------------------------------------------------------------------
|
| Simula uma linha da memoria principal
|
| @var int endereco  endereço de uma linha de memoria
| @var int palavra   palavra contida em uma linha de memoria
| @var int bloco     bloco de memoria a qual a linha esta contida
|
*/

class LinhadeMemoria
{
    private int endereco;
    private int palavra;
    private int bloco;
    
    public LinhadeMemoria(int endereco, int palavra, int bloco)
    {
        this.endereco = endereco;
        this.palavra = palavra;
        this.bloco = bloco;
    }
    
    /**
     * setPalavra
     * 
     * Insere ou altera a palavra de uma linha de memoria
     * 
     * @param int palavra palavra a ser inserida ou alterada em uma linha de memoria
     * 
     */
    
    public void setPalavra(int palavra)
    {
        this.palavra = palavra;
    }
    
    /**
     * getEndereco
     * 
     * Retorna o endereco de uma linha de memoria
     * 
     * @return int
     * 
     */
    
    public void getEndereco()
    {
        return this.endereco;
    }
    
    /**
     * getPalavra
     * 
     * Retorna a palavra de uma linha de memoria
     * 
     * @return int
     * 
     */
    
    public void getPalavra()
    {
        return this.palavra;
    }
    
    /**
     * getBloco
     * 
     * Retorna o bloco a qual a linha pertence
     * 
     * @return int
     * 
     */
    
    public void getBloco()
    {
        return this.bloco;
    }
}