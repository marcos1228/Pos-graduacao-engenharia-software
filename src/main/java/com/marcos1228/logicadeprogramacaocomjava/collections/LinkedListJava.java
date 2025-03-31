package com.marcos1228.logicadeprogramacaocomjava.collections;

import java.util.LinkedList;

public class LinkedListJava {
    //    A classe
//    LinkedList faz
//    parte do
//    Java Collections
//    Framework e
//    implementa as
//    interfaces List, Deque
//    e Queue, oferecendo
//    uma estrutura
//    de lista
//    duplamente encadeada.
    public static void main(String[] args) {
        LinkedList<String> animais = new LinkedList<>();
        animais.add("Cachorro");
        animais.add("Cavalo");
        animais.add("Vaca");
        System.out.println("LinkedList: " + animais);
        animais.add(1, "gato");
        System.out.println(animais);
    }
}
