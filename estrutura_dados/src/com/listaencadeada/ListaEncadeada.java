package com.listaencadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public  ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        if (referenciaEntrada == null){
            return true;
        }
        return false;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAux = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAux = noAux.getProximoNo();
        }

        noAux.setProximoNo(novoNo);
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referanciaAux = referenciaEntrada;

        while (true){
            if(referanciaAux != null){
                tamanhoLista++;
                if(referanciaAux.getProximoNo() != null){
                    referanciaAux = referanciaAux.getProximoNo();
                }else{
                    break;
                }
            }else {
                break;
            }
        }
        return tamanhoLista;
    }
}
