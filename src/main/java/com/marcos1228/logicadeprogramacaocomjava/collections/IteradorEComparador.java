package com.marcos1228.logicadeprogramacaocomjava.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteradorEComparador {
//    Collections em Java
//    O framework Java Collections é um conjunto de classes e interfaces que fornece uma arquitetura para armazenar e manipular grupos de objetos de forma eficiente. Ele contém estruturas de dados como List, Set, Map e Queue, permitindo operações como pesquisa, ordenação, inserção e exclusão.
//

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        System.out.println("ArrayList " + numeros);

        //Criando uma instancia de Iterator
        // A caminhamos dentro do nosso arrays
        Iterator<Integer> it = numeros.iterator();

        int numero = it.next();

        System.out.println(" Elemento " + numero);

        while (it.hasNext()) {
            it.forEachRemaining((value ) -> System.out.println(value + ","));
        }

    }
}
