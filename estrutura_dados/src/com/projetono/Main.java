package com.projetono;

public class Main {
    public static void main(String[] args) {
        //nossos objetos Nós são do tipo string
        No<String> no1 = new No<>("Conteúdo no1");

        No<String> no2 = new No<>("Conteudo no2");
        no1.setProximoNo(no2);


        No<String> no3 = new No<>("Conteudo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteudo no4");
        no3.setProximoNo(no4);

        //no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getProximoNo()); //com o no1 consigo pegar o no2

        System.out.println("-----------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // um nó apontando para o proximo, até que o ultimo aponta para null
    }
}
