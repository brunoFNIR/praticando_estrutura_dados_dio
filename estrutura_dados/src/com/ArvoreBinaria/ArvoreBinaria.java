package com.ArvoreBinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;
    public ArvoreBinaria(){
        this.raiz = null; //toda vez q instanciarmos uma arvore binária, sua raiz começara como nula
    }


    public  void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo); //criando um Nó desse conteúdo passado como parametro
        this.raiz = inserir(raiz, novoNo); // chamando método privado
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){ //método de inserção que será recursivo
        if(atual == null){ // quer dizer que eu to na raiz(ou seja, a arvore ta vazia) e vou retornar esse novo Nó (para ser a raiz)
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) { //se for menor que 0, é pq o conteudo do novoNo é                                                                         menor do que o conteudo do Nó atual
            atual.setNoEsq(inserir(atual.getNoEsq(),novoNo)); // pra repetir o msm ciclo
        } else{ //se for maior ou igual
            atual.setNoDir(inserir(atual.getNoDir(),novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\nExibindo InOrdem");
        exibirInOrdem(this.raiz); // chamando método privado
    }

    public void exibirInOrdem(BinNo<T> atual){
        if (atual != null){ // se tiver nulo é pq chegou no fim da exbição
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\nExibindo PosOrdem");
        exibirPosOrdem(this.raiz); // chamando método privado
    }

    public void exibirPosOrdem(BinNo<T> atual){ //exibe depois de visitar
        if (atual != null){ // se tiver nulo é pq chegou no fim da exbição
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\nExibindo PreOrdem");
        exibirPreOrdem(this.raiz); // chamando método privado
    }

    public void exibirPreOrdem(BinNo<T> atual){ //exibe primeiro pra depois visitar
        if (atual != null){ // se tiver nulo é pq chegou no fim da exbição
            System.out.print(atual.getConteudo() + ", ");
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
        }
    }


    public void remover(T conteudo){
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temporario = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)){ //para percorrer a aravore procurando esse conteudo
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){ //testando se o conteudo q to tentando remover é menor que o                                                      conteudo desse Nó
                   atual = atual.getNoEsq(); //se for menor eu vou pra esquerda
                }else{
                  atual = atual.getNoDir(); //se não, vou pra direita
                }
            }

            if(atual == null){ //caso nao tenha achado o conteudo
                System.out.println("Conteúdo não encontrado. Bloco try");
            }


            if(pai == null){ //parte da raiz, pq se não tem pai, é pq é a raiz
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                }else{
                    for (temporario = atual, filho = atual.getNoEsq(); filho.getNoDir() == null; temporario = filho, filho = filho.getNoEsq()){
                        if(filho != atual.getNoEsq()){
                            temporario.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            } else if (atual.getNoDir() == null) {
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else{
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) {
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else{
                    pai.setNoDir(atual.getNoDir());
                }
            }else {
                for(temporario = atual, filho = atual.getNoEsq(); filho.getNoDir() != null; temporario = filho, filho = filho.getNoDir()){
                    if(filho != atual.getNoEsq()){
                        temporario.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }

        }catch(NullPointerException erro){
            System.out.println("Conteúdo não encontrado. Bloco catch");
        }
    }

}
