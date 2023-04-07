package com.projetono;

public class No<T>  { //agr é uma classe do tipo generica
    private T conteudo;  //conteudo poder ser de qql tipo
    private No<T> proximoNo; //assim como o proximo Nó

    public No(T conteudo) {
        this.proximoNo = null; // para garantir que sempre que criamos um proximo Nó, a referencia para o proximo vai ser nulla
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }


    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
