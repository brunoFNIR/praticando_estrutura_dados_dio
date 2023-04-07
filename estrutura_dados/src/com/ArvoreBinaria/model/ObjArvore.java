package com.ArvoreBinaria.model;

public abstract class ObjArvore<T> implements Comparable<T> {//classe abstrata para fazer uma forma das classes que vamos utilizar a Arvore Binária
    public abstract boolean equals(Object o );
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public abstract String toString();

}
