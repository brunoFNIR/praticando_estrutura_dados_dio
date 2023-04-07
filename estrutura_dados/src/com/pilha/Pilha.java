package com.pilha;

public class Pilha {
    private No refNoTopoPilha;

    public Pilha(){
        this.refNoTopoPilha = null; // ou seja, na hora que eu instancio um Nó, a referencia dele sempre começa como nula
    }


    public void push(No novoNo){
        No refAuxiliar = refNoTopoPilha; //guardando referencia de entrada na variavel auxiliar
        refNoTopoPilha = novoNo; //atribuindo a referencia de memoria do novoNo ao refNoTopoPilha
        refNoTopoPilha.setRefNo(refAuxiliar); //faz com que a referencia de topo (guardada na refAuxiliar) aponte para o novo Nó
    }

    public No pop(){
        if(!this.isEmpty()){ //se a pilha nao estiver vazia
            No noPoped = refNoTopoPilha; //guardo o Nó que esta sendo popado da pilha
            refNoTopoPilha = refNoTopoPilha.getRefNo();//digo que a referencia de entrada agora é o Nó que está abaixo dele
            return noPoped;
        }
        return null;
    }

    public No top(){
        return  refNoTopoPilha;
    }

    public boolean isEmpty(){
        if(refNoTopoPilha == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String stringRetorno = "--------------------\n";
        stringRetorno += "  Pilha\n";
        stringRetorno += "--------------------\n";

        No noAuxiliar =refNoTopoPilha; //Nó utilizado pra percorrer a pilha e dar um print nela

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo(); //o refNo do meu Nó auxiliar é o Nó que está logo abaixo, ele mesmo passa a ser o prixomo Nó
            }else {
                break;
            }
        }
        stringRetorno += "====================\n";
        return stringRetorno;
    }
}
