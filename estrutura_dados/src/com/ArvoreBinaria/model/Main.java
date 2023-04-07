package com.ArvoreBinaria.model;

import com.ArvoreBinaria.ArvoreBinaria;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria<Obj> minnhaArvore = new ArvoreBinaria<>();

        minnhaArvore.inserir(new Obj(13));
        minnhaArvore.inserir(new Obj(10));
        minnhaArvore.inserir(new Obj(25));
        minnhaArvore.inserir(new Obj(2));
        minnhaArvore.inserir(new Obj(12));
        minnhaArvore.inserir(new Obj(20));
        minnhaArvore.inserir(new Obj(31));
        minnhaArvore.inserir(new Obj(29));
        minnhaArvore.inserir(new Obj(32));

        minnhaArvore.exibirInOrdem();
        minnhaArvore.exibirPreOrdem();
        minnhaArvore.exibirPosOrdem();

    }
}
