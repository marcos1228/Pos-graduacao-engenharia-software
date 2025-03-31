package com.marcos1228.logicadeprogramacaocomjava.vetoresematrizes;

import java.util.*;

public class ArayList {
    public static void main(String[] args) {
        //Principais operações

        ArrayList<String> estados = new ArrayList<>();
        //Adicionar um elemento
        estados.add("Espito santo");
        estados.add("Pará");
        // remove um elemento um valor
        estados.remove("Pará");

        //remove um elemento índice
        estados.remove(0);

        //Acessa um elemento
       // System.out.println(estados.get(1));

        //Modifica um elemento
        //estados.set(1, "Estado modificado");


        // Verificar o tamanho size
        System.out.println(estados.size());

        //Percorre a list com o for tradicional
        for (int i = 0; i < estados.size(); i++){
            System.out.println(estados.get(i));
        }

        // Percorre com o for-each
        for(String item : estados){
            System.out.println(item);
        }

        // Percorre com o forEach expressão lambda
        estados.forEach(item -> System.out.println(item));
        System.out.println(estados);

        //Inicialização direta
        List<Integer> numeros = new ArrayList<>(List.of(10, 20, 3, 4, 5));

        System.out.println("Remove " + numeros.remove(1));
        System.out.println(numeros);

        // Convert um arrayList num Array
        Integer[] array = numeros.toArray(new Integer[0]);
        System.out.println("Convertido em array" + array[0]);

        //Ordenação
        //TODO ordenar com collections.sort()
        Collections.sort(numeros);
        System.out.println("List ordenada com o sort " +numeros);
        numeros.sort(Comparator.reverseOrder());
        System.out.println("Ordem descrecente" + numeros);

        //Verificação ser contens
        ArrayList<String> listContains = new ArrayList<>(List.of("JAVA", "SPRING BOOT"));
        if (listContains.contains("JAVA")){
            System.out.println("Aqui existe");
        }

        //Verificação se a list é vazia
        ArrayList<Integer> listVazia = new ArrayList<>(List.of());
        if (listVazia.isEmpty()){
            System.out.println("List vázia");
        }

        // Conversão entre ArrayList e LinkedList
        ArrayList<String> lista = new ArrayList<>(List.of());
        LinkedList<String> linkedList = new LinkedList<>(lista);
        ArrayList<String> novaLista = new ArrayList<>(linkedList);
        System.out.println(novaLista);
//
//        Característica            |	ArrayList       | LinkedList
   //     --------------------------------------------------------------------
//        Estrutura Interna         |	Array Dinâmico	| Lista Encadeada
//        Acesso por Índice	Rápido  | (O(1))	        | Lento (O(n))
//        Inserção/Remoção no meio	| Lento (O(n))	    | Rápido (O(1))
//        Uso de Memória            |	Menos	        | Mais (devido a ponteiros)
    }
}
