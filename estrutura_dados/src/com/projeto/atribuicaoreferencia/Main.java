package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        System.out.println("A = " + a + "\nB = " + b);

        a = 2; //mudando o "a" o "b" não se altera por serem variaveis do tipo primitivo

        System.out.println("A = " + a + "\nB = " + b);


        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("ObjA = " + objA + "\nObjbB = " + objB);

        objA.setNum(2); // mudando o valor do objA, o objB se aletra tambem, por serem objtos e atribuição de um obj a outro, esta na vdd atribuindo a referencia de memoria
        System.out.println("ObjA = " + objA + "\nObjbB = " + objB);
    }
}
