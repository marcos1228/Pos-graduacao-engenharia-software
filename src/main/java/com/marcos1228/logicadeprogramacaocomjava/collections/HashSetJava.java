package com.marcos1228.logicadeprogramacaocomjava.collections;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetJava {
//    A classe
//    HashSet faz
//    parte do
//    Java Collections
//    Framework e
//    implementa a
//
//    interface Set,garantindo que não haja elementos duplicados e que a ordem de inserção não seja mantida.

    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println(numeros);

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()){
            it.forEachRemaining((value) -> System.out.println(value + ","));
        }

    }
}
